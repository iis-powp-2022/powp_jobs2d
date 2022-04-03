package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private int x;
    private int y;
    private Job2dDriver driver;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Job2dDriver getDriver() {
        return driver;
    }

    public void setDriver(Job2dDriver driver) {
        this.driver = driver;
    }

    public OperateToCommand(int x, int y, Job2dDriver driver) {
        this.x = x;
        this.y = y;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "OperateToCommand{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void execute() {
        this.driver.operateTo(this.x, this.y);
    }
}
