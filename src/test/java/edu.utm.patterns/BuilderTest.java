package edu.utm.patterns;

import edu.utm.patterns.creational.builder.iPhone;
import org.junit.jupiter.api.Test;

class BuilderTest {

    @Test
    void makeComputer() {
        iPhone iPhone = new iPhone.iPhoneBuilder()
            .setModel("iPhone 11 Pro")
            .setOperationalSystem("iOS 13.4")
            .setCamera(12)
            .setProcessor("A13 Bionic")
            .setScreen(5.7)
            .build();

        System.out.println(iPhone);
    }
}
