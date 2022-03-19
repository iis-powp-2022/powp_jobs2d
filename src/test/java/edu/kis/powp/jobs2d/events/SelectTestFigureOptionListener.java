package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	private TestOption option;

	public enum TestOption {
		Test1, Test2;
	}

	public SelectTestFigureOptionListener(DriverManager driverManager, TestOption option_) {
		this.driverManager = driverManager;
		option = option_;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(option)
		{
		case Test1:
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
			break;
		case Test2:
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
			break;
		}
	}
}
