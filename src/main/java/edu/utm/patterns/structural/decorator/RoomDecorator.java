package edu.utm.patterns.structural.decorator;

public abstract class RoomDecorator implements Room {
    private Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }

    @Override
    public String design() {
        return room.design();
    }
}
