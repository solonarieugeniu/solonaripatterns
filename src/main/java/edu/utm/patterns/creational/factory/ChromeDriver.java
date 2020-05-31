package edu.utm.patterns.creational.factory;

public class ChromeDriver implements Browser{
    @Override
    public void createDriver() {
        System.out.println("Initializing Chrome Driver");
    }
}
