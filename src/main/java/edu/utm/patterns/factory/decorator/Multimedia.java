package edu.utm.patterns.factory.decorator;

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
