package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> listOfCommands;

    public ComplexCommand(List<DriverCommand> listOfCommands) {
        this.listOfCommands = listOfCommands;
    }

    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand command:listOfCommands){
            command.execute(driver);
        }
    }
}
