package edu.kis.powp.command;

public class OperateToCommand implements DriverCommand {
    int x;
    int y;
    @Override
    public void execute() {
        driver.operateTo(x,y);
    }
}
