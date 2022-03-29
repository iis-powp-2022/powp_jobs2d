package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.factory.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {
	public static final String FIGURE_JOE_1 = "Figure Joe 1";
	public static final String FIGURE_JOE_2 = "Figure Joe 2";
	public static final String RECTANGLE = "Rectangle";
	public static final String PARALLELOGRAM = "Parallelogram";
	public static final String TRIANGLE = "Triangle";
	private final DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(FIGURE_JOE_1))
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if(e.getActionCommand().equals(FIGURE_JOE_2))
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		else if(e.getActionCommand().equals(RECTANGLE))
			ComplexCommandFactory.getRectangleComplexCommand().execute(DriverFeature.getDriverManager().getCurrentDriver());
		else if(e.getActionCommand().equals(PARALLELOGRAM))
			ComplexCommandFactory.getParallelogramComplexCommand().execute(DriverFeature.getDriverManager().getCurrentDriver());
		else if(e.getActionCommand().equals(TRIANGLE))
			ComplexCommandFactory.getTriangleComplexCommand().execute(DriverFeature.getDriverManager().getCurrentDriver());
	}
}
