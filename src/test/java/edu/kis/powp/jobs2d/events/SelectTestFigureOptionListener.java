package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.factories.DrawingFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	int pattern;

	public SelectTestFigureOptionListener(DriverManager driverManager , int pattern) {
		this.driverManager = driverManager;
		this.pattern = pattern;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ComplexCommand task;
		switch(pattern){
			case 0:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case 1:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case 2:
				task = new ComplexCommand();
				task.loadComms(DrawingFactory.getCircleComms(0,0,100));
				task.execute(driverManager.getCurrentDriver());
				break;
			case 3:
				task = new ComplexCommand();
				task.loadComms(DrawingFactory.getRectangleComms(0,0,50, 100));
				task.execute(driverManager.getCurrentDriver());
				break;
			case 4:
				task = new ComplexCommand();
				task.loadComms(DrawingFactory.getSquareComms(0,0,50));
				task.execute(driverManager.getCurrentDriver());
				break;
		}
	}
}
