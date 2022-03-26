package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.factory.FiguresFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class TestFigures{
    public TestFigures() {
    }

    public static void figuresTest1(Job2dDriver driver) {
        SetPositionCommand setPositionCommand = new SetPositionCommand();
        OperateToCommand operateToCommand = new OperateToCommand();
        ComplexCommand complexCommand = new ComplexCommand();

        setPositionCommand.setXY(-100, -100);
        complexCommand.addCommand(setPositionCommand);
        operateToCommand.setXY(0, 100);
        complexCommand.addCommand(operateToCommand);
        complexCommand.execute(driver);

    }

    public static void figureTestSquare(Job2dDriver driver) {
        ComplexCommand squareCommand = FiguresFactory.getSquareCommand(-100, -100, 200);
        squareCommand.execute(driver);
    }

    public static void figureTestCircle(Job2dDriver driver) {
        ComplexCommand squareCommand = FiguresFactory.getCircleCommand(0, 0, 100);
        squareCommand.execute(driver);
    }

}
