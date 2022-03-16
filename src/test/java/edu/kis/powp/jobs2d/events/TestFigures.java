package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class TestFigures{
    public TestFigures() {
    }

    public static void figuresTest1(Job2dDriver driver) {
        DriverCommand setPositionCommand = new SetPositionCommand(driver);
        DriverCommand operateToCommand = new OperateToCommand(driver);

        setPositionCommand.setXY(-100, -100);
        setPositionCommand.execute();
        operateToCommand.setXY(0, 100);
        operateToCommand.execute();


    }
}
