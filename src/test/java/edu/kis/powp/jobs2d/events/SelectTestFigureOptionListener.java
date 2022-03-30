package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.EnumShape;
import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.Factories;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final EnumShape.Shape figureToDraw;

	public SelectTestFigureOptionListener(DriverManager driverManager, EnumShape.Shape figureToDraw) {
		this.driverManager = driverManager;
		this.figureToDraw = figureToDraw;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(figureToDraw){
			case FJ1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FJ2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case RECTANGLE:
				new ComplexCommand(Factories.drawRectangle(50,50,100,150)).execute(driverManager.getCurrentDriver());
				break;
			case TRIANGLE:
				new ComplexCommand(Factories.drawTriangle(50,50,150)).execute(driverManager.getCurrentDriver());
				break;
			default:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
	}
}
