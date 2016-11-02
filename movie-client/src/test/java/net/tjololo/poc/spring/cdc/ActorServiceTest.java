package net.tjololo.poc.spring.cdc;

import net.tjololo.poc.spring.cdc.dto.Actor;
import net.tjololo.poc.spring.cdc.dto.ActorPart;
import net.tjololo.poc.spring.cdc.dto.ActorSearch;
import net.tjololo.poc.spring.cdc.dto.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by tjololo on 02/11/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"net.tjololo.poc.spring.cdc:movie-server:+:stubs:8080"}, workOffline = true)
public class ActorServiceTest {
    @Autowired
    private ActorService actorService;

    @Test
    public void returnRoleWhenActorInMovie() {
        Actor ryan = new Actor("Ryan Reynolds", "Deadpool");
        Actor morena = new Actor("Morena Baccarin", "Vanessa");
        Movie movie = new Movie("Deadpool", Arrays.asList(ryan, morena));
        ActorSearch actorSearch = new ActorSearch(movie, "Ryan Reynolds");
        ActorPart part = actorService.findPart(actorSearch);
        assertThat(part.isActs(), is(true));
        assertThat(part.getPart(), equalTo("Deadpool"));
    }
}