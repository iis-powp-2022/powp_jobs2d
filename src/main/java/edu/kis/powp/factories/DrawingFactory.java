package edu.kis.powp.factories;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class DrawingFactory {

    public static List<DriverCommand> getSquareComms(int x, int y, int sideLen){
        List<DriverCommand> commList = new ArrayList<DriverCommand>();
        commList.add(new SetPositionCommand(x, y));
        commList.add(new OperateToCommand(x, y+sideLen));
        commList.add(new OperateToCommand(x + sideLen, y+sideLen));
        commList.add(new OperateToCommand(x+sideLen, y));
        commList.add(new OperateToCommand(x, y));
        return commList;
    }

    public static List<DriverCommand> getRectangleComms(int x, int y, int sideLen1, int sideLen2){
        List<DriverCommand> commList = new ArrayList<DriverCommand>();
        commList.add(new SetPositionCommand(x, y));
        commList.add(new OperateToCommand(x, y+sideLen2));
        commList.add(new OperateToCommand(x + sideLen1, y+sideLen2));
        commList.add(new OperateToCommand(x+sideLen1, y));
        commList.add(new OperateToCommand(x, y));
        return commList;
    }

    public static List<DriverCommand> getCircleComms(int x, int y, int radius){
        List<DriverCommand> commList = new ArrayList<DriverCommand>();
        int angle = 0;
        int newX, newY;

        newX = (int) (radius * Math.cos(angle * Math.PI / 180));
        newY = (int) (radius * Math.sin(angle * Math.PI / 180));
        commList.add(new SetPositionCommand(newX, newY));

        for(angle = 1; angle < 360; angle++){
            newX = (int) (radius * Math.cos(angle * Math.PI / 180));
            newY = (int) (radius * Math.sin(angle * Math.PI / 180));
            commList.add(new OperateToCommand(newX, newY));
        }
        return commList;
    }
}
