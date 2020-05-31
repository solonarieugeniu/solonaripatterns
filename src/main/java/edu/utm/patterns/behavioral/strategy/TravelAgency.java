package edu.utm.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TravelAgency {
    List<Traveler> travelers;

    public TravelAgency() {
        this.travelers = new ArrayList<>();
    }

    public void bookATravel(Traveler item) {
        this.travelers.add(item);
    }

    public void quiteTravel(Traveler item) {
        this.travelers.remove(item);
    }

    public void travel(TravelStrategy travelStrategy) {
        travelStrategy.travel(travelers.stream()
            .map(Traveler::getTravelTicket).collect(Collectors.joining(" , ")));
    }
}
