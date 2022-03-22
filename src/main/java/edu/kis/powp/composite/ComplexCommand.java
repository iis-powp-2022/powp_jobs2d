package edu.kis.powp.composite;

import edu.kis.powp.command.DriverCommand;

import java.util.Set;

public class ComplexCommand implements DriverCommand {
    private final Set<DriverCommand> commandSet;

    public ComplexCommand(Set<DriverCommand> commandSet) {
        this.commandSet = commandSet;
    }

    @Override
    public void execute() {
        for(DriverCommand command : commandSet)
            command.execute();
    }
}
