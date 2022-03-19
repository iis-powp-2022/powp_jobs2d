package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerAdapterDriver;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapterDriver;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapterAbstractDriver;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListenerJane1;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListenerJoe1;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListenerJoe2;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestJobs2dPatterns {
    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Setup test concerning preset figures in context.
     *
     * @param application Application context.
     */
    private static void setupPresetTests(Application application) {
        SelectTestFigureOptionListenerJoe1 selectTestFigureOptionListener = new SelectTestFigureOptionListenerJoe1(
                DriverFeature.getDriverManager());
        SelectTestFigureOptionListenerJoe2 selectTestFigureOptionListener2 = new SelectTestFigureOptionListenerJoe2(
                DriverFeature.getDriverManager());
        SelectTestFigureOptionListenerJane1 selectTestFigureOptionListener3 = new SelectTestFigureOptionListenerJane1(
                DriverFeature.getDriverManager());

        application.addTest("Figure Joe 1", selectTestFigureOptionListener);
        application.addTest("Figure Joe 2", selectTestFigureOptionListener2);
        application.addTest("Figure Jane 1", selectTestFigureOptionListener3);
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

        Job2dDriver testDriver = new DrawerAdapterDriver();
        DriverFeature.addDriver("Buggy Simulator", testDriver);
        Job2dDriver testDriverSpecialLine = new LineDrawerAdapterDriver(LineFactory.getSpecialLine());
        DriverFeature.addDriver("Buggy Simulator Special Line", testDriverSpecialLine);
        AbstractDriver testDriverJane = new LineDrawerAdapterAbstractDriver(0,0, LineFactory.getSpecialLine());
        DriverFeature.addDriver("Buggy Simulator Abstract Line", testDriverJane);
        DriverFeature.updateDriverInfo();
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

                DriverFeature.setupDriverPlugin(app);
                setupDrivers(app);
                setupPresetTests(app);
                setupLogger(app);

                app.setVisibility(true);
            }
        });
    }

}
