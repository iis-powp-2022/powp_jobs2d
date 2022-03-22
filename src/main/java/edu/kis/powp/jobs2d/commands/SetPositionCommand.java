package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
	private int x = 0;
	private int y = 0;

	Job2dDriver driver;

	public SetPositionCommand(Job2dDriver driver) {
		this.driver = driver;
	}

	public void SetPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void execute() {
		driver.setPosition(x, y);
	}
}
