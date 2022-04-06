package edu.kis.powp.jobs2d.command;

public class ComplexCommandFactory {
	private ComplexCommandFactory() {}

	public static DriverCommand getRectangle() {
		ComplexCommand command = new ComplexCommand();
		command.addCommand(new SetPositionCommand(-50, -100));
		command.addCommand(new OperateToCommand(-50, 100));
		command.addCommand(new OperateToCommand(50, 100));
		command.addCommand(new OperateToCommand(50, -100));
		command.addCommand(new OperateToCommand(-50, -100));
		return command;
	}

	public static DriverCommand getTriangle() {
		ComplexCommand command = new ComplexCommand();
		command.addCommand(new SetPositionCommand(-50, -50));
		command.addCommand(new OperateToCommand(-75, 50));
		command.addCommand(new OperateToCommand(75, 50));
		command.addCommand(new OperateToCommand(-50, -50));
		return command;
	}
}
