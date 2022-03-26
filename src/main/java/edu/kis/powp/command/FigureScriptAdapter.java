package edu.kis.powp.command;

import edu.kis.powp.IFigureScript;
import edu.kis.powp.jobs2d.Job2dDriver;

public class FigureScriptAdapter implements DriverCommand{

    private final IFigureScript script;

    public FigureScriptAdapter(IFigureScript script) {
        this.script = script;
    }

    @Override
    public void execute(Job2dDriver driver) {
        script.figureScript(driver);
    }
}
