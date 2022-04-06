package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import java.awt.*;

public class LineDrawerDriverAdapter extends DrawPanelController implements Job2dDriver {
    private int startX = 0, startY = 0;
    private ILine line;

    public LineDrawerDriverAdapter(ILine lineType) {
        super();
        this.line = lineType;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        DrawerFeature.getDrawerController().drawLine(line);
        setPosition(x,y);
    }

    @Override
    public String toString() {
        if (line.isDotted()) {
            return "Dotted line. Start cord: x = " + this.startY + " y = " + this.startY;
        } else if (line.getColor() == Color.CYAN) {
            return "Special line. Start cord: x = " + this.startY + " y = " + this.startY;
        } else {
            return "Normal line. Start cord: x = " + this.startY + " y = " + this.startY;
        }
    }
}