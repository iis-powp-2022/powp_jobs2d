package edu.kis.powp.command.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.ComplexCommandStore;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class Joe2Factory {
    private ComplexCommand commandRectangle = new ComplexCommand();
    private Job2dDriver driver;

    public Joe2Factory(Job2dDriver driver) {
        this.driver = driver;
    }

    public void setRectangle(){
        commandRectangle.addToList(new ComplexCommandStore(new SetPositionCommand(0, 0, driver)));
        commandRectangle.addToList(new ComplexCommandStore(new OperateToCommand(233, -23, driver)));
        commandRectangle.addToList(new ComplexCommandStore(new OperateToCommand(24, 90, driver)));
        commandRectangle.addToList(new ComplexCommandStore(new OperateToCommand(-104, 80, driver)));
        commandRectangle.addToList(new ComplexCommandStore(new OperateToCommand(11, -22, driver)));
        commandRectangle.addToList(new ComplexCommandStore(new OperateToCommand(-33, 44, driver)));
        commandRectangle.addToList(new ComplexCommandStore(new OperateToCommand(-66, -88, driver)));
        commandRectangle.addToList(new ComplexCommandStore(new OperateToCommand(128, 256, driver)));
    }

    public void DrawRectangle(){
        commandRectangle.execute();
    }
}
