package edu.utm.patterns.factory.decorator;

public class Pictures extends RoomDecorator{

    public Pictures(Room room) {
        super(room);
    }

    @Override
    public String design() {
        return super.design() + decorateWallsWithPictures();
    }

    private String decorateWallsWithPictures() {
        return " with pictures";
    }

}
