package edu.utm.patterns.creational.factory;

public class BrowserFactory implements BrowserUtilsFactory {
    @Override
    public Browser initDriver(String type) {
        Browser browserDriver;
        switch (type) {
            case "chrome":
                browserDriver = new ChromeDriver();
                break;
            case "firefox":
                browserDriver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser name");
        }
        browserDriver.createDriver();
        return browserDriver;
    }
}
