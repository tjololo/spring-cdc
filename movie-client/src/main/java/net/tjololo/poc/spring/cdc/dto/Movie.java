package net.tjololo.poc.spring.cdc.dto;

import java.util.List;

/**
 * Created by tjololo on 02/11/16.
 */
public class Movie {
    private String title;
    private List<Actor> actors;

    public Movie(String title, List<Actor> actors) {
        this.title = title;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public List<Actor> getActors() {
        return actors;
    }
}
