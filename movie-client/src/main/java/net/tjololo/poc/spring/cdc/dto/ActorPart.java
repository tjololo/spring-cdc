package net.tjololo.poc.spring.cdc.dto;

/**
 * Created by tjololo on 02/11/16.
 */
public class ActorPart {
    private boolean acts;
    private String part;

    public ActorPart() {
    }

    public ActorPart(boolean acts, String part) {
        this.acts = acts;
        this.part = part;
    }

    public boolean isActs() {
        return acts;
    }

    public String getPart() {
        return part;
    }

    public void setActs(boolean acts) {
        this.acts = acts;
    }

    public void setPart(String part) {
        this.part = part;
    }
}
