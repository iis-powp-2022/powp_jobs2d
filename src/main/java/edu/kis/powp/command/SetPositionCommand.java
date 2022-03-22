package edu.kis.powp.command;

public class SetPositionCommand implements DriverCommand{

    int x;
    int y;
    @Override
    public void execute() {
        driver.setPosition(x,y);
    }
}
