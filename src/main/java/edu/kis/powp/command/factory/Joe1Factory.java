package edu.kis.powp.command.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class Joe1Factory {
	private ComplexCommand commandRectangle = new ComplexCommand();
	private Job2dDriver driver;

	public Joe1Factory(Job2dDriver driver) {
		this.driver = driver;
	}

	public void setRectangle(){
		commandRectangle.addToList(new SetPositionCommand(-120, -120, driver));
		commandRectangle.addToList(new OperateToCommand(120, -120, driver));
		commandRectangle.addToList(new OperateToCommand(120, 120, driver));
		commandRectangle.addToList(new OperateToCommand(-120, 120, driver));
		commandRectangle.addToList(new OperateToCommand(-120, -120, driver));
		commandRectangle.addToList(new OperateToCommand(120, 120, driver));
		commandRectangle.addToList(new SetPositionCommand(120, -120, driver));
		commandRectangle.addToList(new OperateToCommand(-120, 120, driver));
	}

	public void DrawRectangle(){
		commandRectangle.execute();
	}
}
