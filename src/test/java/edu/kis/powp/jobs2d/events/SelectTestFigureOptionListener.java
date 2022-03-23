package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.SquareFactory;
import edu.kis.powp.command.TriangleFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Figure Joe 1")) FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if(e.getActionCommand().equals("Figure Joe 2")) FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		else if(e.getActionCommand().equals("Square")) new SquareFactory(driverManager.getCurrentDriver()).createComplexCommand().execute();
		else if(e.getActionCommand().equals("Triangle")) new TriangleFactory(driverManager.getCurrentDriver()).createComplexCommand().execute();
	}
}
