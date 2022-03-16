package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements  DriverCommand{

    int x;
    int y;

    @Override
    public void execute(Job2dDriver job2dDriver) {
        job2dDriver.setPosition(this.x,this.y);
    }
}
