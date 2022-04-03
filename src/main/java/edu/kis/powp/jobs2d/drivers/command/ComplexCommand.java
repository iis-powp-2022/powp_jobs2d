package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private ArrayList<DriverCommand> commands;

    public ComplexCommand(ArrayList<DriverCommand> commands) {
        this.commands = commands;
    }
    public ComplexCommand(DriverCommand command) {
        this.commands = new ArrayList<>();
        this.commands.add(command);
    }

    public void addCommands(ArrayList<DriverCommand> commands) {
        this.commands.addAll(commands);
    }
    public void addCommand(DriverCommand command) {
        this.commands.add(command);
    }

    public void setCommands(ArrayList<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "ComplexCommand{" +
                "commands=" + commands +
                '}';
    }

    @Override
    public void execute() {
        for(DriverCommand command: commands) {
            System.out.println("Executing" + command);
            command.execute();
        }
    }
}
