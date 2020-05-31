package edu.utm.patterns;

import edu.utm.patterns.behavioral.command.Engine;
import edu.utm.patterns.behavioral.command.EngineCommandsExecutor;
import edu.utm.patterns.behavioral.command.StartEngine;
import edu.utm.patterns.behavioral.command.StopEngine;
import org.junit.jupiter.api.Test;

class EngineCommandsTest {

    @Test
    void readFile() {
        EngineCommandsExecutor engineCommandsExecutor = new EngineCommandsExecutor();
        engineCommandsExecutor.executeOperation(new StartEngine(new Engine("Gas")));
        engineCommandsExecutor.executeOperation(new StopEngine(new Engine("Diesel")));
    }
}
