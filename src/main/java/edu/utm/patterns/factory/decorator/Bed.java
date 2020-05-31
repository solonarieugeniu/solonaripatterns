package edu.utm.patterns.factory.decorator;

public class Bed extends RoomDecorator{
    public Bed(Room room) {
        super(room);
    }

    @Override
    public String design() {
        return super.design() + decoratewithFancyBed();
    }

    private String decoratewithFancyBed() {
        return " with fancy bed";
    }

}
