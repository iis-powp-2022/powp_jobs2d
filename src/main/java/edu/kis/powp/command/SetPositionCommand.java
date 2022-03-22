package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    int x;
    int y;
    Job2dDriver driver;

    @Override
    public void execute() {
        driver.setPosition(x, y);
    }
}
