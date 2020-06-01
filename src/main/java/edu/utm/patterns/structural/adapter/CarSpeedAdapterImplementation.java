package edu.utm.patterns.structural.adapter;

public class CarSpeedAdapterImplementation implements CarSpeedAdapter {
    private CarSpeed carSpeed;

    public CarSpeedAdapterImplementation(CarSpeed carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public double getSpeed() {
        double mph = carSpeed.getSpeed();
        return convertMPHtoKMPH(mph);
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
