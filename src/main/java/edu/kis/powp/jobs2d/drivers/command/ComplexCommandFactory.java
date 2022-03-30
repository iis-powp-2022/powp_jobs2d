package edu.kis.powp.jobs2d.drivers.command;

public class ComplexCommandFactory {
    public static DriverCommand getRectangleComplexCommand() {
        return new ComplexCommandBuilder()
                .addCommand(new SetPositionCommand(-200, -100))
                .addCommand(new OperateToCommand(200, -100))
                .addCommand(new OperateToCommand(200, 100))
                .addCommand(new OperateToCommand(-200, 100))
                .addCommand(new OperateToCommand(-200, -100))
                .build();
    }
    public static DriverCommand getPythagoreanTriangleComplexCommand() {
        return new ComplexCommandBuilder()
                .addCommand(new SetPositionCommand(-200, -200))
                .addCommand(new OperateToCommand(-200, 200))
                .addCommand(new OperateToCommand(100, -200))
                .addCommand(new OperateToCommand(-200, -200))
                .build();
    }
}
