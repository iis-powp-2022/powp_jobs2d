package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

	private Job2dDriver driver;

	private int x;
	private int y;

	OperateToCommand(Job2dDriver driver) {
		this.driver = driver;
	}

	public OperateToCommand(Job2dDriver driver, int x, int y) {
		this.driver = driver;
		this.x = x;
		this.y = y;
	}

	public Job2dDriver getDriver() {
		return driver;
	}

	public void setDriver(Job2dDriver driver) {
		this.driver = driver;
	}

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

	@Override
	public void excecute() {
		driver.operateTo(x, y);

	}

}
