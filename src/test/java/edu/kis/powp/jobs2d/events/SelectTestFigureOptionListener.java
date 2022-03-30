package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;

	private final FigureTypes chosenFigure;

	public SelectTestFigureOptionListener(DriverManager driverManager, FigureTypes chosenFigure) {
		this.driverManager = driverManager;
		this.chosenFigure = chosenFigure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (chosenFigure) {
			case FIGURES_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURES_JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case RECTANGLE:
				ComplexCommandFactory.getRectangleComplexCommand().execute(driverManager.getCurrentDriver());
			case PYTHAGOREAN_TRIANGLE:
				ComplexCommandFactory.getPythagoreanTriangleComplexCommand().execute(driverManager.getCurrentDriver());
			default:
		}
	}
}
