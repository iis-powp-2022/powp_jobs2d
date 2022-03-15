package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private int figureID;

	public SelectTestFigureOptionListener(DriverManager driverManager, int figureID) {
		this.driverManager = driverManager;
		this.figureID = figureID;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(figureID == 1)
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if(figureID == 2)
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
	}
}
