package edu.utm.patterns;

import edu.utm.patterns.creational.factory.Browser;
import edu.utm.patterns.creational.factory.BrowserFactory;
import edu.utm.patterns.creational.factory.BrowserUtilsFactory;
import org.junit.jupiter.api.Test;

public class BrowserFactoryTest {
    @Test
    public void makeMeals(){
        BrowserUtilsFactory browserFactory = new BrowserFactory();
        Browser cheesePizza = browserFactory.initDriver("chrome");
        Browser chiliePizza = browserFactory.initDriver("firefox");
    }
}
