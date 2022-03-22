package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    
    private int x;
    private int y;
    private Job2dDriver driver;


    @Override
    public void execute() {
        driver.setPosition(x, y);
        
    }
}
