package edu.kis.powp.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandShapesFacotry {

	public static ComplexCommand getComplexCommandToRepresentRectangle(Job2dDriver driver, int startX, int startY,
			int a, int b) {
		List<DriverCommand> driverCommands = new ArrayList<DriverCommand>();

		driverCommands.add(new SetPositionCommand(driver, startX, startY));

		driverCommands.add(new OperateToCommand(driver, startX + a, startY));
		driverCommands.add(new OperateToCommand(driver, startX + a, startY + b));
		driverCommands.add(new OperateToCommand(driver, startX, startY + b));
		driverCommands.add(new OperateToCommand(driver, startX, startY));

		return new ComplexCommand(driverCommands);

	}
}
