package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factories.DrawFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Figure Joe 1")){
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
		else if(e.getActionCommand().equals("Figure Joe 2")){
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
		else if(e.getActionCommand().equals("Rectangle")){
			DrawFactory.drawRectangle (-150,-150,150,200).execute(driverManager.getCurrentDriver());
		}
		else if(e.getActionCommand().equals("Triangle")){
			DrawFactory.drawTriangle (-150,-150,150).execute(driverManager.getCurrentDriver());
		}
	}
}
