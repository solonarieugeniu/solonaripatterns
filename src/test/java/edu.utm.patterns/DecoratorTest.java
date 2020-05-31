package edu.utm.patterns;

import edu.utm.patterns.factory.bridge.Room;
import edu.utm.patterns.factory.decorator.Bed;
import edu.utm.patterns.factory.decorator.Multimedia;
import edu.utm.patterns.factory.decorator.Pictures;
import edu.utm.patterns.factory.decorator.RoomImplementation;
import org.junit.jupiter.api.Test;

class DecoratorTest {
    @Test
    void decorateRoom() {
        Bed room = new Bed(new Pictures(new Multimedia(new RoomImplementation())));
        System.out.println(room.design());
    }
}
