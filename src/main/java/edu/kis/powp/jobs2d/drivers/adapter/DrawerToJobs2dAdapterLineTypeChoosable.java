package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class DrawerToJobs2dAdapterLineTypeChoosable extends DrawerToJobs2dAdapter{
    private final ILine lineType;

    public DrawerToJobs2dAdapterLineTypeChoosable(ILine lineType){
        super();
        this.lineType=lineType;
    }

    @Override
    public void operateTo(int x, int y) {
        lineType.setStartCoordinates(this.startX, this.startY);
        lineType.setEndCoordinates(x, y);
        setPosition(x,y);
        DrawerFeature.getDrawerController().drawLine(this.lineType);
    }
}
