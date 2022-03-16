package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{
    private int x;
    private int y;
    @Override
    public void execute(Job2dDriver driver) {
        driver.operateTo(this.x,this.y);
    }
}
