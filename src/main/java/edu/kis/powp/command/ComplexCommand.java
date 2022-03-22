package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    List<DriverCommand> commandList = new ArrayList<>();

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    public ComplexCommand(){}

    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand cmd : commandList){
            cmd.execute(driver);
        }
    }

    public void add(DriverCommand dc){
        commandList.add(dc);
    }
    public void clear(){
        commandList.clear();
    }
}
