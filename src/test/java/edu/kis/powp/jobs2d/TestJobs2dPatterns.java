package edu.kis.powp.jobs2d;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.CustomLine;
import edu.kis.powp.jobs2d.drivers.LineDrawerAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.MyDriver;
import edu.kis.powp.jobs2d.events.SelectChangeVisibleOptionListener;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListener;
import edu.kis.powp.jobs2d.events.TestFigures;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class TestJobs2dPatterns {
	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param application Application context.
	 */
	private static void setupPresetTests(Application application) {
		SelectTestFigureOptionListener TestFigureOptionListener1 = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), FiguresJoe::figureScript1);

		SelectTestFigureOptionListener TestFigureOptionListener2 = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), FiguresJoe::figureScript2);

		SelectTestFigureOptionListener TestFigureDriverCommands = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), TestFigures::figuresTest1);

		SelectTestFigureOptionListener TestFigureSquare = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), TestFigures::figureTestSquare);

		SelectTestFigureOptionListener TestFigureCircle = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), TestFigures::figureTestCircle);

		SelectTestFigureOptionListener TestJoeFigures = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), TestFigures::figureTestJoes);


//		ActionListener actionListener2 = e -> {
//			FiguresJoe.figureScript2(DriverFeature.getDriverManager().getCurrentDriver());};

		application.addTest("Figure Joe 1", TestFigureOptionListener1);
		application.addTest("Figure Joe 2", TestFigureOptionListener2);
		application.addTest("Figure Test Command Driver", TestFigureDriverCommands);
		application.addTest("Figure Test Square", TestFigureSquare);
		application.addTest("Figure Test Circle", TestFigureCircle);
		application.addTest("Figure Test Joe's", TestJoeFigures);
	}

	/**
	 * Setup driver manager, and set default driver for application.
	 * 
	 * @param application Application context.
	 */
	private static void setupDrivers(Application application) {
		Job2dDriver loggerDriver = new LoggerDriver();
		DriverFeature.addDriver("Logger Driver", loggerDriver);
		DriverFeature.getDriverManager().setCurrentDriver(loggerDriver);

		Job2dDriver testDriver = new MyDriver();
		DriverFeature.addDriver("Buggy Simulator", testDriver);

		Job2dDriver lineDrawerAdapterDriver = new LineDrawerAdapter(LineFactory.getSpecialLine());
		DriverFeature.addDriver("Chosen line adapter", lineDrawerAdapterDriver);

		Job2dDriver customLineDiver = new LineDrawerAdapter(
				new CustomLine().setColor(Color.ORANGE).setDotted(true).setThickness(10.0F));
		DriverFeature.addDriver("Custom Line adapter", customLineDiver);

		DriverFeature.updateDriverInfo();
	}

	/**
	 * Auxiliary routines to enable using Buggy Simulator.
	 * 
	 * @param application Application context.
	 */
	private static void setupDefaultDrawerVisibilityManagement(Application application) {
		DefaultDrawerFrame defaultDrawerWindow = DefaultDrawerFrame.getDefaultDrawerFrame();
		application.addComponentMenuElementWithCheckBox(DrawPanelController.class, "Default Drawer Visibility",
				new SelectChangeVisibleOptionListener(defaultDrawerWindow), true);
		defaultDrawerWindow.setVisible(true);
	}

	/**
	 * Setup menu for adjusting logging settings.
	 * 
	 * @param application Application context.
	 */
	private static void setupLogger(Application application) {
		application.addComponentMenu(Logger.class, "Logger", 0);
		application.addComponentMenuElement(Logger.class, "Clear log",
				(ActionEvent e) -> application.flushLoggerOutput());
		application.addComponentMenuElement(Logger.class, "Fine level", (ActionEvent e) -> logger.setLevel(Level.FINE));
		application.addComponentMenuElement(Logger.class, "Info level", (ActionEvent e) -> logger.setLevel(Level.INFO));
		application.addComponentMenuElement(Logger.class, "Warning level",
				(ActionEvent e) -> logger.setLevel(Level.WARNING));
		application.addComponentMenuElement(Logger.class, "Severe level",
				(ActionEvent e) -> logger.setLevel(Level.SEVERE));
		application.addComponentMenuElement(Logger.class, "OFF logging", (ActionEvent e) -> logger.setLevel(Level.OFF));
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Application app = new Application("2d jobs Visio");
				DrawerFeature.setupDrawerPlugin(app);
//				setupDefaultDrawerVisibilityManagement(app); //this spawn drawer
				DriverFeature.setupDriverPlugin(app);
				setupDrivers(app);
				setupPresetTests(app);
				setupLogger(app);

				app.setVisibility(true);
			}
		});
	}

}
