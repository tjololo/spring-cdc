package net.tjololo.poc.spring.cdc.dto;

/**
 * Created by tjololo on 02/11/16.
 */
public class ActorSearch {
    private Movie movie;
    private String actorname;

    public ActorSearch(Movie movie, String actorname) {
        this.movie = movie;
        this.actorname = actorname;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getActorname() {
        return actorname;
    }
}
