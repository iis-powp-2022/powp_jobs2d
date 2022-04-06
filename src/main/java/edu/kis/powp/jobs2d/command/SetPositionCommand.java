package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private final int x;
    private final int y;

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void execute(Job2dDriver driver) {
        driver.setPosition(x, y);
    }
}
