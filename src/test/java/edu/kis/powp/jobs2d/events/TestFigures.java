package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class TestFigures{
    public TestFigures() {
    }

    public static void figuresTest1(Job2dDriver driver) {
        SetPositionCommand setPositionCommand = new SetPositionCommand();
        OperateToCommand operateToCommand = new OperateToCommand();
        ComplexCommand complexCommand = new ComplexCommand();

        setPositionCommand.setXY(-100, -100);
        complexCommand.addCommand(setPositionCommand);
        operateToCommand.setXY(0, 100);
        complexCommand.addCommand(operateToCommand);
        complexCommand.execute(driver);

    }
}
