package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.factories.ComplexCommandFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;



public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final TestSelector testChoice;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
		this.testChoice = TestSelector.figureScript1;
	}

	public SelectTestFigureOptionListener(DriverManager driverManager, TestSelector testChoice) {
		this.driverManager = driverManager;
		this.testChoice = testChoice;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(testChoice){
			case figureScript1: FiguresJoe.figureScript1(driverManager.getCurrentDriver()); break;
			case figureScript2:	FiguresJoe.figureScript2(driverManager.getCurrentDriver()); break;
			case drawRectangle:
					ComplexCommandFactory.
					getRectangle(-100,-50,200,100).
					execute(driverManager.getCurrentDriver()); break;
			case drawRightEquilateralTriangle:					ComplexCommandFactory.
					getRightEquilateralTriangle(-100,-50,100).
					execute(driverManager.getCurrentDriver()); break;
			//idk how to handle that so for example performing figureScript1 probably should throw exception or ignore?
			default:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}

	}
}
