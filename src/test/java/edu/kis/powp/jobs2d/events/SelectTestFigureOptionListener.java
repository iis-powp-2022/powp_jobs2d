package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractLineDrawerAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private int figureScriptId;

	public SelectTestFigureOptionListener(DriverManager driverManager, int figureScriptId) {
		this.driverManager = driverManager;
		this.figureScriptId = figureScriptId;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (figureScriptId == 1)
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if (figureScriptId == 2)
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		else if (figureScriptId == 3)
			FiguresJane.figureScript(AbstractLineDrawerAdapter.toAbstractDriver(driverManager.getCurrentDriver()));
		else
		{
			List<DriverCommand> starCommandsList = new ArrayList<>();
			starCommandsList.add(new SetPositionCommand(driverManager.getCurrentDriver(), -50, -50));
			starCommandsList.add(new OperateToCommand(driverManager.getCurrentDriver(), 0, -150));
			starCommandsList.add(new OperateToCommand(driverManager.getCurrentDriver(), 50, -50));
			starCommandsList.add(new OperateToCommand(driverManager.getCurrentDriver(), 150, 0));
			starCommandsList.add(new OperateToCommand(driverManager.getCurrentDriver(), 50, 50));
			starCommandsList.add(new OperateToCommand(driverManager.getCurrentDriver(), 0, 150));
			starCommandsList.add(new OperateToCommand(driverManager.getCurrentDriver(), -50, 50));
			starCommandsList.add(new OperateToCommand(driverManager.getCurrentDriver(), -150, 0));
			starCommandsList.add(new OperateToCommand(driverManager.getCurrentDriver(), -50, -50));
			ComplexCommand starCommand = new ComplexCommand(starCommandsList);
			starCommand.execute();
		}
	}
}
