package net.tjololo.poc.spring.cdc;

import net.tjololo.poc.spring.cdc.dto.ActorPart;
import net.tjololo.poc.spring.cdc.dto.ActorSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tjololo on 02/11/16.
 */
@Service
public class ActorService {
    @Autowired
    private RestTemplate restTemplate;
    private String MOVIE_ACTOR_SERVICE_JSON_VERSION_1 = "application/vnd.actor.v1+json";

    public ActorPart findPart(ActorSearch actorSearch) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MOVIE_ACTOR_SERVICE_JSON_VERSION_1);
        ResponseEntity<ActorPart> response = restTemplate.exchange("http://localhost:8080/movie/role", HttpMethod.POST, new HttpEntity<>(actorSearch, httpHeaders), ActorPart.class);
        return response.getBody();
    }
}
