package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public abstract class DriverCommand {
    protected int x;
    protected int y;

    protected Job2dDriver driver;

    public DriverCommand(Job2dDriver driver) {
        this.driver = driver;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void execute();
}
