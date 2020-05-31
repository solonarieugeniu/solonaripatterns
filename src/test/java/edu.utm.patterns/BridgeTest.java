package edu.utm.patterns;

import edu.utm.patterns.factory.bridge.Blue;
import edu.utm.patterns.factory.bridge.Kitchen;
import edu.utm.patterns.factory.bridge.Room;
import org.junit.jupiter.api.Test;

public class BridgeTest {
    @Test
    void bridgeTest(){
        Room room = new Kitchen(new Blue());
        System.out.println(room.design());
    }
}
