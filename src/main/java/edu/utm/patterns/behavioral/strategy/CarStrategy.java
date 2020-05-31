package edu.utm.patterns.behavioral.strategy;

public class CarStrategy implements TravelStrategy {

    private String driverName;
    private String carModel;
    private String carNumber;
    private int numberOfSeats;

    public CarStrategy(String driverName, String carModel, String carNumber, int numberOfSeats){
        this.driverName=driverName;
        this.carModel=carModel;
        this.carNumber=carNumber;
        this.numberOfSeats=numberOfSeats;
    }

    @Override
    public void travel(String travelerName) {
        System.out.println(travelerName + " is going to travel by car.");
    }
}
