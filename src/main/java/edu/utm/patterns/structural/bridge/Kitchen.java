package edu.utm.patterns.structural.bridge;

public class Kitchen extends Room {

    public Kitchen(BuildColor buildColor) {
        super(buildColor);
    }

    @Override
    public String design() {
        return "Kitchen designed. " + buildColor.paint();
    }
}
