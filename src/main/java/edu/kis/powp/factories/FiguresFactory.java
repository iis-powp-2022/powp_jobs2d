package edu.kis.powp.factories;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class FiguresFactory {
    public static DriverCommand getRectangle(int x, int y, int startX, int startY) {
        DriverCommand driverCommand = new ComplexCommand() {{
            addCommand(new SetPositionCommand(startX, startY));
            addCommand(new OperateToCommand(startX, startY + y));
            addCommand(new OperateToCommand(startX + x, startY + y));
            addCommand(new OperateToCommand(startX + x, startY));
            addCommand(new OperateToCommand(startX, startY));
        }};

        return driverCommand;
    }
    public static DriverCommand getTriangle(int x, int startX, int startY) {
        DriverCommand driverCommand = new ComplexCommand() {{
            addCommand(new SetPositionCommand(startX, startY));
            addCommand(new OperateToCommand(startX + x, startY));
            addCommand(new OperateToCommand(startX + x/2, startY-x));
            addCommand(new OperateToCommand(startX, startY));
        }};

        return driverCommand;
    }
}
