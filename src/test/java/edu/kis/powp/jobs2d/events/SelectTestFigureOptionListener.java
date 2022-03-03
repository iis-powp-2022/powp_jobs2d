package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final IFigureScript script;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
		script = FiguresJoe::figureScript1;
	}

	public SelectTestFigureOptionListener(DriverManager driverManager, IFigureScript script) {
		this.driverManager = driverManager;
		this.script = script;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		script.figureScript(driverManager.getCurrentDriver());
	}
}

