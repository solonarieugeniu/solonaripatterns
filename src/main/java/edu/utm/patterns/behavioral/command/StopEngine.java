package edu.utm.patterns.behavioral.command;

public class StopEngine implements EngineCommands {
    private Engine engine;

    public StopEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String execute() {
        return engine.stop();
    }
}
