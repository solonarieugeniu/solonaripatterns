package edu.utm.patterns.structural.bridge;

public abstract class Room {
    protected BuildColor buildColor;

    public Room(BuildColor buildColor) {
        this.buildColor = buildColor;
    }

    abstract public String design();
}
