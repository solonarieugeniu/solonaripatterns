package edu.utm.patterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContextSingleton {
    private Map<ScenarioKeys, Object> data;

    private static ScenarioContextSingleton instance;

    private ScenarioContextSingleton() {
        this.data = new HashMap<>();
    }

    public static ScenarioContextSingleton getInstance() {

        if (instance == null) {
            instance = new ScenarioContextSingleton();
        }
        return instance;
    }

    public void saveData(ScenarioKeys key, Object value) {
        data.put(key, value);
    }

    public Object getData(ScenarioKeys key) {
        return data.get(key);
    }

    public void resetContext() {
        data.clear();
    }
}
