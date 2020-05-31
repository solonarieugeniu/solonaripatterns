package edu.utm.patterns.creational.factory;

public class FirefoxDriver implements Browser{
    @Override
    public void createDriver() {
        System.out.println("Initializing Gecko Driver");
    }
}
