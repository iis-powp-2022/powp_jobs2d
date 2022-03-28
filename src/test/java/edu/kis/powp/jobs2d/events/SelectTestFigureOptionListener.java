package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.factories.FiguresFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand())
		{
			case "Figure Joe 1" :
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;

			case "Figure Joe 2" :
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case "Rectangle" :
				FiguresFactory.getRectangle(100,150,-50,-75).execute(driverManager.getCurrentDriver());
				break;
			case "Triangle" :
				FiguresFactory.getTriangle(100,-50,50).execute(driverManager.getCurrentDriver());
				break;
		}

	}
}
