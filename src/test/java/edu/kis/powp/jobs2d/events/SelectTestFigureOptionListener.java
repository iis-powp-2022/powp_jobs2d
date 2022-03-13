package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final FigureLambda figure;

	public SelectTestFigureOptionListener(DriverManager driverManager, FigureLambda figureLambda) {
		this.driverManager = driverManager;
		this.figure = figureLambda;
	}

	public static SelectTestFigureOptionListener getListenerWithLambda(DriverManager driverManager, FigureLambda figureLambda) {
		return new SelectTestFigureOptionListener(driverManager, figureLambda);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		figure.getFigure(driverManager.getCurrentDriver());
	}
}
