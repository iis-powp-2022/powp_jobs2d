package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final int testNo;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
		this.testNo = 0;
	}

	public SelectTestFigureOptionListener(DriverManager driverManager, int testNumber) {
		this.driverManager = driverManager;
		this.testNo = testNumber;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (testNo == 0) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}
