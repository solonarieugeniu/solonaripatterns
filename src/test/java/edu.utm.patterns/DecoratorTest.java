package edu.utm.patterns;

import edu.utm.patterns.structural.decorator.Bed;
import edu.utm.patterns.structural.decorator.Multimedia;
import edu.utm.patterns.structural.decorator.Pictures;
import edu.utm.patterns.structural.decorator.RoomImplementation;
import org.junit.jupiter.api.Test;

class DecoratorTest {
    @Test
    void decorateRoom() {
        Bed room = new Bed(new Pictures(new Multimedia(new RoomImplementation())));
        System.out.println(room.design());
    }
}
