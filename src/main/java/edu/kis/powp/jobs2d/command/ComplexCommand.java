package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand extends DriverCommand {
	private ArrayList<DriverCommand> commands;

	public void addCommand(DriverCommand command) {
		this.commands.add(command);
	}

	public void removeCommand(DriverCommand command) {
		this.commands.remove(command);
	}

	public void execute(Job2dDriver driver) {
		for(DriverCommand command : commands) {
			command.execute(driver);
		}
	}
}
