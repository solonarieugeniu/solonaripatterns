package edu.utm.patterns.factory.bridge;

public class Blue implements BuildColor {
    @Override
    public String paint() {
        return "Walls painted in Blue";
    }
}
