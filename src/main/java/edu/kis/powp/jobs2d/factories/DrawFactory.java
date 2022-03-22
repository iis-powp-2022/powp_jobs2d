package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class DrawFactory {

    public static ComplexCommand drawRectangle (int startX,int startY,int a,int b){
        final List<DriverCommand> squareList = new ArrayList<DriverCommand>() {{
            add(new SetPositionCommand(startX, startY));
            add(new OperateToCommand(a, -a));
            add(new OperateToCommand(a, b));
            add(new OperateToCommand(-a, b));
            add(new OperateToCommand(-a, -a));
        }};
        return new ComplexCommand(squareList);
    }
    public static ComplexCommand drawTriangle (int startX,int startY,int a){
        final List<DriverCommand> squareList = new ArrayList<DriverCommand>() {{
            add(new SetPositionCommand(startX, startY));
            add(new OperateToCommand(a, -a));
            add(new OperateToCommand(a, a));
            add(new OperateToCommand(startX, startX));
        }};
        return new ComplexCommand(squareList);
    }
}

