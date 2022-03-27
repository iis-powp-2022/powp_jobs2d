package edu.kis.powp.jobs2d.drivers.command.impl;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

	private final List<DriverCommand> commands;

	public ComplexCommand(List<DriverCommand> commands) {
		this.commands = commands;
	}

	public ComplexCommand(ComplexCommandBuilder complexCommandBuilder) {
		this.commands = complexCommandBuilder.commands;
	}

	@Override
	public void execute(Job2dDriver job2dDriver) {
		for (DriverCommand driverCommand : this.commands) {
			driverCommand.execute(job2dDriver);
		}
	}

	public static ComplexCommandBuilder builder() {
		return new ComplexCommandBuilder();
	}

	public static class ComplexCommandBuilder {
		private final List<DriverCommand> commands;

		public ComplexCommandBuilder() {
			commands = new ArrayList<>();
		}

		public ComplexCommandBuilder driverCommand(DriverCommand driverCommand) {
			this.commands.add(driverCommand);
			return this;
		}

		public ComplexCommand build() {
			return new ComplexCommand(this);
		}
	}
}
