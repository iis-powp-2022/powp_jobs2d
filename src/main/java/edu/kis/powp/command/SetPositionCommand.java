package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand extends DriverCommand{

    public SetPositionCommand(Job2dDriver driver) {
        super(driver);
    }

    @Override
    public void execute() {
        driver.setPosition(x, y);
    }
}
