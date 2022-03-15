package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.legacy.drawer.shape.line.BasicLine;
import edu.kis.legacy.drawer.shape.line.DottedLine;
import edu.kis.legacy.drawer.shape.line.SpecialLine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {
    private int startX = 0, startY = 0;
    private ILine line = null;

    public LineDrawerAdapter(ILine line) {
        super();
        this.line = line;
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
        setPosition(x, y);
    }

    @Override
    public String toString() {
        if(line instanceof BasicLine)
            return "Basic Driver";
        else if(line instanceof DottedLine)
            return "Dotted Driver";
        else if(line instanceof SpecialLine)
            return "Special Driver";
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }
}
