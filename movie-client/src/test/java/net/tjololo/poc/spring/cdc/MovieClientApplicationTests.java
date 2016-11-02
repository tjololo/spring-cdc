package net.tjololo.poc.spring.cdc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"net.tjololo.poc.spring.cdc:movie-server:+:stubs:8080"}, workOffline = true)
public class MovieClientApplicationTests {

    @Test
    public void contextLoads() {
    }

}
