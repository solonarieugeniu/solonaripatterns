package edu.utm.patterns;

import edu.utm.patterns.creational.singleton.ScenarioContextSingleton;
import edu.utm.patterns.creational.singleton.ScenarioKeys;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ScenarioContextSingletonTest {

    private ScenarioContextSingleton scenarioContextSingleton = ScenarioContextSingleton.getInstance();

    @Test
    void scenarioContextSingletonTest(){
        final String username = "Eugeniu";
        final String password = "falcon1";
        ScenarioContextSingleton.getInstance().saveData(ScenarioKeys.USERNAME, username);
        ScenarioContextSingleton.getInstance().saveData(ScenarioKeys.PASSWORD, password);
        String actualUsername = (String) scenarioContextSingleton.getData(ScenarioKeys.USERNAME);
        String actualPassword = (String) scenarioContextSingleton.getData(ScenarioKeys.PASSWORD);

        assertAll(
            () -> assertEquals(actualUsername, username),
            () -> assertEquals(actualPassword, password)
        );
    }
}
