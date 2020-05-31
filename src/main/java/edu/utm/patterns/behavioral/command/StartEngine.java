package edu.utm.patterns.behavioral.command;

public class StartEngine implements EngineCommands {
    private Engine engine;

    public StartEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String execute() {
        return engine.start();
    }
}
