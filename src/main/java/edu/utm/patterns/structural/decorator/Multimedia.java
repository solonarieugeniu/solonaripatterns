package edu.utm.patterns.structural.decorator;

public class Multimedia extends RoomDecorator {
    public Multimedia(Room room) {
        super(room);
    }

    @Override
    public String design() {
        return super.design() + decorateWithMultimedia();
    }

    private String decorateWithMultimedia() {
        return " with TV and sound bar";
    }
}
