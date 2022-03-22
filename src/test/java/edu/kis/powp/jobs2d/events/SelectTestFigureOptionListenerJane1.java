package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionListenerJane1 implements ActionListener{


    private DriverManager driverManager;
    private String selectedImg;

    public SelectTestFigureOptionListenerJane1(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            FiguresJane.figureScript((AbstractDriver) driverManager.getCurrentDriver());
    }
}
