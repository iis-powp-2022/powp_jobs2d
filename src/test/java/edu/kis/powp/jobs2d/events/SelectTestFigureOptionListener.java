package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.FigureScriptNumber_e;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {
	private DriverManager driverManager;
	private FigureScriptNumber_e selectedTest;

	public SelectTestFigureOptionListener(DriverManager driverManager, FigureScriptNumber_e test) {
		this.driverManager = driverManager;
		this.selectedTest = test;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (this.selectedTest) {
			case FIGURE_SCRIPT_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_SCRIPT_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
		}
	}
}
