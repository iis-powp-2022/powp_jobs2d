package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    List<DriverCommand> commands = new ArrayList<>();

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commands = commandList;
    }

    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand command : commands)
            command.execute(driver);
    }

}
