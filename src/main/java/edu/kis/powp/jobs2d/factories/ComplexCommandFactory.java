package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.SetPositionCommand;

public class ComplexCommandFactory {
    
    private ComplexCommandFactory(){}

    public static DriverCommand getRectangle()
    {
        ComplexCommand command = new ComplexCommand();
        command.appendCommand(new SetPositionCommand(10, 10));
        command.appendCommand(new OperateToCommand(20, 10));
        command.appendCommand(new OperateToCommand(20, 20));
        command.appendCommand(new OperateToCommand(10, 20));
        command.appendCommand(new OperateToCommand(10, 10));
        return command;
    }
    public static DriverCommand getStar()
    {
        ComplexCommand command = new ComplexCommand();
        command.appendCommand(new SetPositionCommand(70, 60));
        command.appendCommand(new OperateToCommand(10, 60));
        command.appendCommand(new OperateToCommand(60, 20));
        command.appendCommand(new OperateToCommand(40, 90));
        command.appendCommand(new OperateToCommand(20, 20));
        command.appendCommand(new OperateToCommand(70, 60));
        return command;
    }
}
