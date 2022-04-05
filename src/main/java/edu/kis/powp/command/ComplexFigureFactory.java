package edu.kis.powp.command;

public class ComplexFigureFactory {
    public static ComplexCommand drawTriangle(int startX, int startY, int sizeA, int sizeB) {
        ComplexCommand complexCmd = new ComplexCommand();
        complexCmd.addNextCmd(new SetPositionCommand(startX, startY));
        complexCmd.addNextCmd(new OperateToCommand(startX + sizeA, startY));
        complexCmd.addNextCmd(new OperateToCommand(startX, startY + sizeB));
        complexCmd.addNextCmd(new OperateToCommand(startX, startY));
        return complexCmd;
    }
}