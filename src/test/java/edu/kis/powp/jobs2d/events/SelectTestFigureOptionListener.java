package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.function.Consumer;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;

	private final HashMap<String, Consumer<Job2dDriver>> tests = new HashMap<>();

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
		this.tests.put("Figure Joe 1", FiguresJoe::figureScript1);
		this.tests.put("Figure Joe 2", FiguresJoe::figureScript2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(tests.containsKey(e.getActionCommand())) {
			tests.get(e.getActionCommand()).accept(driverManager.getCurrentDriver());
		}
	}
}
