package edu.kis.powp.jobs2d.command;

public class ComplexCommandBuilder {
	private final ComplexCommand command;

	public ComplexCommandBuilder() {
		this.command = new ComplexCommand();
	}

	public ComplexCommandBuilder setPosition(int x, int y) {
		this.command.addCommand(new SetPositionCommand(x, y));
		return this;
	}

	public ComplexCommandBuilder operateTo(int x, int y) {
		this.command.addCommand(new OperateToCommand(x, y));
		return this;
	}

	public ComplexCommand getResult() {
		return command;
	}
}
