package edu.utm.patterns.behavioral.strategy;

public class Traveler {
    private String name;
    private String travelTicket;

    public String getName() {
        return name;
    }

    public String getTravelTicket() {
        return travelTicket;
    }

    public Traveler(String name, String travelTicket) {
        this.name = name;
        this.travelTicket = travelTicket;
    }

}
