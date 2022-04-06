package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factories.ComplexCommandFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private int testNumber;
	public SelectTestFigureOptionListener(DriverManager driverManager, int testNumber) {
		this.driverManager = driverManager;
		this.testNumber = testNumber;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(this.testNumber)
		{
			case 1:
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
			break;

			case 2:
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
			break;

			case 3:
			ComplexCommandFactory.getRectangle().execute(driverManager.getCurrentDriver());
			break;

			case 4:
			ComplexCommandFactory.getStar().execute(driverManager.getCurrentDriver());
			break;
		}
		
	}
}
