package edu.utm.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class EngineCommandsExecutor {

    private final List<EngineCommands> engineCommands = new ArrayList<>();

    public String executeOperation(EngineCommands engineCommand) {
        engineCommands.add(engineCommand);
        return engineCommand.execute();
    }
}
