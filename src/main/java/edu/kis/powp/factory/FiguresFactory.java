package edu.kis.powp.factory;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class FiguresFactory {

    public static List<DriverCommand> getDrawRectangleCommands(int x, int y, int a, int b) {
        List<DriverCommand> listOfCommands = new ArrayList<>();
        listOfCommands.add(new SetPositionCommand(x, y));
        listOfCommands.add(new OperateToCommand(x + a, y));
        listOfCommands.add(new OperateToCommand(x + a, y + b));
        listOfCommands.add(new OperateToCommand(x, y + b));
        listOfCommands.add(new OperateToCommand(x, y));
        return listOfCommands;
    }

    public static List<DriverCommand> getDrawSquareCommands(int x, int y, int a) {
        return getDrawRectangleCommands(x, y, a, a);
    }

    public static List<DriverCommand> getDrawTriangleCommands(int x, int y, int a) {
        List<DriverCommand> listOfCommands = new ArrayList<>();
        listOfCommands.add(new SetPositionCommand(x, y));
        listOfCommands.add(new OperateToCommand(x+a, y));
        int h = (int) (a*Math.sqrt(3)/2);
        listOfCommands.add(new OperateToCommand(x+(int)(a/2), y-h));
        listOfCommands.add(new OperateToCommand(x, y));
        return listOfCommands;
    }
}
