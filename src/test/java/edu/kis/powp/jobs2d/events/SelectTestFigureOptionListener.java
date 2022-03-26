package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractLineDrawerAdapter;
import edu.kis.powp.jobs2d.factory.FigureStarFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			FigureStarFactory.createDrawCommand(driverManager.getCurrentDriver()).execute();
	}
}
