package edu.kis.powp.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.FigureScriptAdapter;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class FiguresFactory {
    public static ComplexCommand getRectangleCommand(int x, int y, int a, int b) {
        ComplexCommand commands = new ComplexCommand() {{
            addCommand(new SetPositionCommand(x, y));
            addCommand(new OperateToCommand(x+a, y));
            addCommand(new OperateToCommand(x+a, y+b));
            addCommand(new OperateToCommand(x, y+b));
            addCommand(new OperateToCommand(x, y));
        }};
        return commands;
    }

    public static ComplexCommand getSquareCommand(int x, int y, int a) {
        return getRectangleCommand(x, y, a, a);
    }

    public static ComplexCommand getCircleCommand(int x, int y, int r) {
        double angleDelta = 2 * Math.PI / 30;
        ComplexCommand commands = new ComplexCommand() {{
            addCommand(new SetPositionCommand((int) Math.floor(x + r * Math.cos(0)), (int) Math.floor(y + r * Math.sin(0))));
            for (double i = angleDelta; i < 2 * Math.PI + angleDelta; i += angleDelta) {
                addCommand(new OperateToCommand((int) Math.floor(x + r * Math.cos(i)), (int) Math.floor(y + r * Math.sin(i))));
            }
        }};
        return commands;
    }

    public static ComplexCommand getJoeCommands() {
        ComplexCommand commands = new ComplexCommand() {{
            addCommand(new FigureScriptAdapter(FiguresJoe::figureScript1));
            addCommand(new FigureScriptAdapter(FiguresJoe::figureScript2));
        }};
        return commands;
    }

}
