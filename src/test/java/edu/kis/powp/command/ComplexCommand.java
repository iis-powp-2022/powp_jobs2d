package edu.kis.powp.command;

import java.util.List;

public class ComplexCommand implements DriverCommand {
    
    List<DriverCommand> driverCommands;


    @Override
    public void excecute() {
        for (DriverCommand driverCommand : driverCommands) {
            driverCommand.excecute();
        }
    }
    
    public ComplexCommand(List<DriverCommand> driverCommands) {
        this.driverCommands = driverCommands;
    }

    public ComplexCommand()
    {

    }

    public List<DriverCommand> getDriverCommands() {
        return driverCommands;
    }

    public void setDriverCommands(List<DriverCommand> driverCommands) {
        this.driverCommands = driverCommands;
    }


    
}
