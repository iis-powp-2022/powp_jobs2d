package edu.kis.powp.jobs2d.drivers.factories;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;


public class ComplexCommandFactory {
    public static ComplexCommand getRectangle(int x, int y, int lenVertical, int lenHorizontal) {
        List<DriverCommand> listOfCommands = new ArrayList<>();
        listOfCommands.add(new SetPositionCommand(x, y));
        listOfCommands.add(new OperateToCommand(x + lenVertical, y));
        listOfCommands.add(new OperateToCommand(x + lenVertical, y - lenHorizontal));
        listOfCommands.add(new OperateToCommand(x, y - lenHorizontal));
        listOfCommands.add(new OperateToCommand(x, y));
        return new ComplexCommand(listOfCommands);
    }

    public static ComplexCommand getRightIsoscelesTriangle(int x, int y, int sideLen) {
        List<DriverCommand> listOfCommands = new ArrayList<>();
        listOfCommands.add(new SetPositionCommand(x, y));
        listOfCommands.add(new OperateToCommand(x , y+sideLen));
        listOfCommands.add(new OperateToCommand(x+sideLen , y+sideLen));
        listOfCommands.add(new OperateToCommand(x, y));
        return new ComplexCommand(listOfCommands);
    }
}
