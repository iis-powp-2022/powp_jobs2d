package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.factory.ShapeFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {
	private final DriverManager driverManager;
	private final int figureID;

	public static final int figure1 = 1;
	public static final int figure2 = 2;
	public static final int figure3 = 3;
	public static final int figure4 = 4;

	public SelectTestFigureOptionListener(DriverManager driverManager, int figureID) {
		this.driverManager = driverManager;
		this.figureID = figureID;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(figureID) {
			case figure1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case figure2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case figure3:
				ShapeFactory.getTriangle(driverManager.getCurrentDriver(), -100, 0, 150, 150).execute();
				break;
			case figure4:
				ShapeFactory.getUpsideDownTriangle(driverManager.getCurrentDriver(), -100, 0, 150, 150).execute();
				break;
		}
	}
}
