package edu.kis.powp.jobs2d.drivers.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class ShapeFactory {
    public static DriverCommand getTriangle(Job2dDriver driver, int startX, int startY, int width, int height) {
        ComplexCommand command = new ComplexCommand(new SetPositionCommand(startX, startY, driver));
        command.addCommand(new OperateToCommand(startX + width, startY, driver));
        command.addCommand(new OperateToCommand(startX + width / 2, startY - height, driver));
        command.addCommand(new OperateToCommand(startX, startY, driver));
        return command;
    }
    public static DriverCommand getUpsideDownTriangle(Job2dDriver driver, int startX, int startY, int width, int height) {
        ComplexCommand command = new ComplexCommand(new SetPositionCommand(startX, startY - height, driver));
        command.addCommand(new OperateToCommand(startX + width, startY - height, driver));
        command.addCommand(new OperateToCommand(startX + width/2, startY, driver));
        command.addCommand(new OperateToCommand(startX, startY - height, driver));
        return command;
    }
}
