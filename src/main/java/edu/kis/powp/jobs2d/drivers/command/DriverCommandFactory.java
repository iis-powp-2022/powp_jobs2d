package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.drivers.command.impl.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.impl.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.impl.SetPositionCommand;

public class DriverCommandFactory {

	public static DriverCommand createSquare() {
		return ComplexCommand.builder()
				.driverCommand(new SetPositionCommand(0, 0))
				.driverCommand(new OperateToCommand(0, 10))
				.driverCommand(new OperateToCommand(10, 10))
				.driverCommand(new OperateToCommand(10, 0))
				.driverCommand(new OperateToCommand(0, 0))
				.build();
	}

	public static DriverCommand createBigSquare() {
		return ComplexCommand.builder()
				.driverCommand(new SetPositionCommand(0, 0))
				.driverCommand(new OperateToCommand(0, 40))
				.driverCommand(new OperateToCommand(40, 40))
				.driverCommand(new OperateToCommand(40, 0))
				.driverCommand(new OperateToCommand(0, 0))
				.build();
	}

	public static DriverCommand createTriangle() {
		return ComplexCommand.builder()
				.driverCommand(new SetPositionCommand(0, 0))
				.driverCommand(new OperateToCommand(40, 0))
				.driverCommand(new OperateToCommand(0, 80))
				.driverCommand(new OperateToCommand(-40, 0))
				.driverCommand(new OperateToCommand(0, 0))
				.build();
	}


}
