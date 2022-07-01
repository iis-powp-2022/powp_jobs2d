package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class FiguresFabric {

	public static ComplexCommand getRectangle(int x, int y, int height, int width) {
		ComplexCommand complexCommand = new ComplexCommand();
		complexCommand.add(new SetPositionCommand(x, y));
		complexCommand.add(new OperateToCommand(x, y + height));
		complexCommand.add(new OperateToCommand(x + width, y + height));
		complexCommand.add(new OperateToCommand(x + width, y));
		complexCommand.add(new OperateToCommand(x, y));
		return complexCommand;
	}

	public static ComplexCommand getCircle(int radius) {
		ComplexCommand complexCommand = new ComplexCommand();
		int x1 = (int) Math.round(radius * Math.cos(0 * Math.PI / 180));
		int y1 = (int) Math.round(radius * Math.sin(0 * Math.PI / 180));
		complexCommand.add(new SetPositionCommand(x1, y1));

		for (int i = 0; i < 360; ++i) {
			x1 = (int) Math.round(radius * Math.cos(i * Math.PI / 180));
			y1 = (int) Math.round(radius * Math.sin(i * Math.PI / 180));
			complexCommand.add(new OperateToCommand(x1, y1));
		}

		return complexCommand;
	}
}
