package edu.kis.powp.jobs2d;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.DrawPanelControllerAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.events.SelectChangeVisibleOptionListener;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListener;
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
		SelectTestFigureOptionListener selectTestFigure1OptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), SelectTestFigureOptionListener.Test.FIGURE_JOE_1);

		SelectTestFigureOptionListener selectTestFigure2OptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), SelectTestFigureOptionListener.Test.FIGURE_JOE_2);

		SelectTestFigureOptionListener selectRectangleOptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), SelectTestFigureOptionListener.Test.RECTANGLE);

		SelectTestFigureOptionListener selectTriangleOptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), SelectTestFigureOptionListener.Test.TRIANGLE);

		SelectTestFigureOptionListener selectCommandBuilderOptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager(), SelectTestFigureOptionListener.Test.COMMAND_BUILDER);

		application.addTest("Figure Joe 1", selectTestFigure1OptionListener);
		application.addTest("Figure Joe 2", selectTestFigure2OptionListener);
		application.addTest("Rectangle", selectRectangleOptionListener);
		application.addTest("Triangle", selectTriangleOptionListener);
		application.addTest("Figure Joe 1 Command Builder", selectCommandBuilderOptionListener);
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

		Job2dDriver testDriver = new DrawPanelControllerAdapter(DrawerFeature.getDrawerController());
		DriverFeature.addDriver("Draw Panel Simulator", testDriver);

		Job2dDriver basicLineDrawer = new LineDrawerAdapter(DrawerFeature.getDrawerController(), LineFactory.getBasicLine());
		DriverFeature.addDriver("Basic Line Drawer", basicLineDrawer);

		Job2dDriver dottedLineDrawer = new LineDrawerAdapter(DrawerFeature.getDrawerController(), LineFactory.getDottedLine());
		DriverFeature.addDriver("Dotted Line Drawer", dottedLineDrawer);

		Job2dDriver specialLineDrawer = new LineDrawerAdapter(DrawerFeature.getDrawerController(), LineFactory.getSpecialLine());
		DriverFeature.addDriver("Special Line Drawer", specialLineDrawer);

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
				//setupDefaultDrawerVisibilityManagement(app);

				DriverFeature.setupDriverPlugin(app);
				setupDrivers(app);
				setupPresetTests(app);
				setupLogger(app);

				app.setVisibility(true);
			}
		});
	}

}
