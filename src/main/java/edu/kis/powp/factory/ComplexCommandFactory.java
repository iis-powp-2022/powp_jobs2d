package edu.kis.powp.factory;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.composite.ComplexCommand;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandFactory {
    public static ComplexCommand getRectangleComplexCommand() {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(-150, -100));
        commandList.add(new OperateToCommand(150, -100));
        commandList.add(new OperateToCommand(150, 100));
        commandList.add(new OperateToCommand(-150, 100));
        commandList.add(new OperateToCommand(-150, -100));

        return new ComplexCommand(commandList);
    }

    public static ComplexCommand getParallelogramComplexCommand() {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(-135, -100));
        commandList.add(new OperateToCommand(165, -100));
        commandList.add(new OperateToCommand(150, 100));
        commandList.add(new OperateToCommand(-150, 100));
        commandList.add(new OperateToCommand(-135, -100));

        return new ComplexCommand(commandList);
    }

    public static ComplexCommand getTriangleComplexCommand() {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0, -125));
        commandList.add(new OperateToCommand(160, 125));
        commandList.add(new OperateToCommand(-160, 125));
        commandList.add(new OperateToCommand(0, -125));

        return new ComplexCommand(commandList);
    }

}
