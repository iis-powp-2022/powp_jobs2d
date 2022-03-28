package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private final List<DriverCommand> commandList;

    public ComplexCommand() {
        this.commandList = new ArrayList<>();
    }

    public void addCommand(DriverCommand command){
        commandList.add(command);
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for(DriverCommand command : this.commandList){
            command.execute(job2dDriver);
        }
    }
}
