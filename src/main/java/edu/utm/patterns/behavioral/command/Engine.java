package edu.utm.patterns.behavioral.command;

import static java.lang.String.format;

public class Engine {

    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String start() {
        System.out.println(format("Starting engine %s", type));
        return "Starting engine " + type;
    }

    public String stop() {
        System.out.println(format("Stopping engine %s", type));
        return "Stopping engine " + type;
    }
}
