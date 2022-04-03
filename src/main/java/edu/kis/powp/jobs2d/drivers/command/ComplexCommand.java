package edu.kis.powp.jobs2d.drivers.command;

import java.util.Arrays;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> commands;

    public ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }
    public ComplexCommand(DriverCommand command) {
        this.commands = Arrays.asList(command);
    }

    public void addCommands(List<DriverCommand> commands) {
        this.commands.addAll(commands);
    }

    public void setCommands(List<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(DriverCommand command: commands) {
            command.execute();
        }
    }
}
