package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;

public class RectangleShapeFactory {
    private Job2dDriver job2dDriver;
    
    public RectangleShapeFactory(Job2dDriver job2dDriver) {
        this.job2dDriver = job2dDriver;
    }

    public ComplexCommand getComplexCommand() {
        List<DriverCommand> commands = new ArrayList<>();
        int[] xs = {-50, 50, 50, -50, -50};
        int[] ys = {100, 100, -100, -100, 100};
        SetPositionCommand setPositionCommand = new SetPositionCommand(xs[0], ys[0], job2dDriver);
        commands.add(setPositionCommand);
        for(int i = 1; i < 5; i++) {
            commands.add(new OperateToCommand(xs[i], ys[i], job2dDriver));
        }

        return new ComplexCommand(commands);
    }
}
