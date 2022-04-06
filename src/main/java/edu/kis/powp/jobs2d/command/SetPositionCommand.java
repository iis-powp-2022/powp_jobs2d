package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private Job2dDriver driver;

    public SetPositionCommand(Job2dDriver driver) {
        this.driver = driver;
    }

    public void execute(int x, int y) {
        driver.setPosition(x, y);
    }
}
