package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	private final int chosenFigure;

	public SelectTestFigureOptionListener(DriverManager driverManager, int chosenFigure) {
		this.driverManager = driverManager;
		this.chosenFigure = chosenFigure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (chosenFigure) {
			case 1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case 2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			default:
		}
	}
}
