package edu.utm.patterns;

import edu.utm.patterns.structural.bridge.Blue;
import edu.utm.patterns.structural.bridge.Kitchen;
import edu.utm.patterns.structural.bridge.Room;
import org.junit.jupiter.api.Test;

public class BridgeTest {
    @Test
    void bridgeTest(){
        Room room = new Kitchen(new Blue());
        System.out.println(room.design());
    }
}
