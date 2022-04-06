package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private Job2dDriver driver;

    public OperateToCommand(Job2dDriver driver) {
        this.driver = driver;
    }

    public void execute(int x, int y) {
        driver.operateTo(x, y);
    }
}
