package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public abstract class DriverCommand {
    protected int x;
    protected int y;

    protected Job2dDriver driver;

    public DriverCommand(Job2dDriver driver) {
        this.driver = driver;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void execute();
}
