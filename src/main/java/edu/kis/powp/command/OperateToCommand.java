package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{
    int x;
    int y;
    Job2dDriver driver;

    @Override
    public void execute() {
        driver.operateTo(x, y);
    }
}
