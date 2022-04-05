package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    List<DriverCommand> cmdList;

    public ComplexCommand(List<DriverCommand> commandList) {
        this.cmdList = commandList;
    }

    public ComplexCommand() {
        this.cmdList = new ArrayList<>();
    }

    public void addNextCmd (DriverCommand cmd) {
        this.cmdList.add(cmd);
    }

    public void clearCmdList () {
        this.cmdList.clear();
    }

    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand cmd : cmdList){
            cmd.execute(driver);
        }
    }
}