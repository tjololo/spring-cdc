package net.tjololo.poc.spring.cdc.dto;

/**
 * Created by tjololo on 02/11/16.
 */
public class Actor {
    private String name;
    private String part;

    public Actor(String name, String part) {
        this.name = name;
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public String getPart() {
        return part;
    }
}
