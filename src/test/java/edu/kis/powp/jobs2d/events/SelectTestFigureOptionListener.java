package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.factory.ComplexCommandShapesFacotry;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == FigureOption.FIGURE_JOHN_1.getNameOfFigure())
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if (e.getActionCommand() == FigureOption.PAT_TERN_1.getNameOfFigure())
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		else if (e.getActionCommand() == FigureOption.RECTANGLE_1.getNameOfFigure())
			ComplexCommandShapesFacotry
					.getComplexCommandToRepresentRectangle(driverManager.getCurrentDriver(), -120, -120, 40, 50)
					.excecute();
		else if (e.getActionCommand() == FigureOption.DIAMOND_1.getNameOfFigure())
			ComplexCommandShapesFacotry.getComplexCommandToRepresentDiamond(driverManager.getCurrentDriver(), 0, 0, 59)
					.excecute();
		;
	}
}
