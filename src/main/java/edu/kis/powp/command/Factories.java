package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class Factories {
    public static List<DriverCommand> drawRectangle(int x, int y, int a, int b) {
        List<DriverCommand> listOfCommands = new ArrayList<>();
        listOfCommands.add(new SetPositionCommand(x, y));
        listOfCommands.add(new OperateToCommand(x + a, y));
        listOfCommands.add(new OperateToCommand(x + a, y + b));
        listOfCommands.add(new OperateToCommand(x, y + b));
        listOfCommands.add(new OperateToCommand(x, y));
        return listOfCommands;
    }

    public static List<DriverCommand> drawTriangle(int x, int y, int a) {
        List<DriverCommand> listOfCommands = new ArrayList<>();
        listOfCommands.add(new SetPositionCommand(x, y));
        listOfCommands.add(new OperateToCommand(x + a, y));
        int h = (int) (a * Math.sqrt(3) / 2);
        listOfCommands.add(new OperateToCommand(x + (a/2), y + h));
        listOfCommands.add(new OperateToCommand(x, y));
        return listOfCommands;
    }
}
