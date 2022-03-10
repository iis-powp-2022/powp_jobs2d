package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

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
		else
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
	}
}
