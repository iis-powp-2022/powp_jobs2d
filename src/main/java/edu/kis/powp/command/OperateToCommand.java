package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand extends DriverCommand{

    public OperateToCommand(Job2dDriver driver) {
        super(driver);
    }

    @Override
    public void execute() {
        driver.operateTo(x, y);
    }
}
