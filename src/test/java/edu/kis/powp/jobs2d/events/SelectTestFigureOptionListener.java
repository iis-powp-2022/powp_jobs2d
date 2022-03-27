package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionListener implements ActionListener {

	public static String FIGURE_JOE_1 = "Figure Joe 1";
	public static String FIGURE_JOE_2 = "Figure Joe 2";

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (FIGURE_JOE_1.equals(e.getActionCommand())) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else if (FIGURE_JOE_2.equals(e.getActionCommand())) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}
