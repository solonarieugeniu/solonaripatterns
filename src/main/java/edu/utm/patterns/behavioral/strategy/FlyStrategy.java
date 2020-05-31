package edu.utm.patterns.behavioral.strategy;

public class FlyStrategy implements TravelStrategy{

    private String flyCompany;

    public FlyStrategy(String flyCompany){
        this.flyCompany=flyCompany;
    }

    @Override
    public void travel(String travelerName) {
        System.out.println(travelerName + " is going to travel by plane with " + flyCompany);
    }
}
