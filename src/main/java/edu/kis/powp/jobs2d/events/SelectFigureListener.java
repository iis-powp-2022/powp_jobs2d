package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectFigureListener implements ActionListener {

	private DriverManager driverManager;
	private DriverCommand command;

	public SelectFigureListener(DriverManager driverManager, DriverCommand command) {
		this.driverManager = driverManager;
		this.command = command;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		command.execute(driverManager.getCurrentDriver());
	}
}
