package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.factory.FiguresFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
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
		switch(testNumber){
			case 1: {
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			}
			case 2:{
				 FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				 break;
			}
			case 3:{
				new ComplexCommand().add(FiguresFactory.getDrawSquareCommands(-50,-50,100)).execute(driverManager.getCurrentDriver());
				break;
			}
			case 4:{
				new ComplexCommand().add(FiguresFactory.getDrawRectangleCommands(-50,-100,100,200)).execute(driverManager.getCurrentDriver());
				break;
			}
			case 5:{
				new ComplexCommand().add(FiguresFactory.getDrawTriangleCommands(-50,50,100)).execute(driverManager.getCurrentDriver());
				break;
			}
		}
	}
}
