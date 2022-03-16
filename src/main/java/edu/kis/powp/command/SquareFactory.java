package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class SquareFactory {
    private Job2dDriver driver;

    public SquareFactory(Job2dDriver driver) {
        this.driver = driver;
    }

    public ComplexCommand createComplexCommand() {
        List<DriverCommand> commandList = new ArrayList<>();
        SetPositionCommand setPositionCommand = new SetPositionCommand(0, 0, driver);
        commandList.add(setPositionCommand);
        OperateToCommand operateToCommand1 = new OperateToCommand(100, 0, driver);
        OperateToCommand operateToCommand2 = new OperateToCommand(100, 100, driver);
        OperateToCommand operateToCommand3 = new OperateToCommand(0, 100, driver);
        OperateToCommand operateToCommand4 = new OperateToCommand(0, 0, driver);

        commandList.add(operateToCommand1);
        commandList.add(operateToCommand2);
        commandList.add(operateToCommand3);
        commandList.add(operateToCommand4);
        return new ComplexCommand(commandList);
    }

}
