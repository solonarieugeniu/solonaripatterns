package edu.utm.patterns.structural.bridge;

public class Blue implements BuildColor {
    @Override
    public String paint() {
        return "Walls painted in Blue";
    }
}
