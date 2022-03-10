package edu.kis.powp.jobs2d.drivers;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.Color;

public class CustomLine extends AbstractLine {
    public CustomLine(ILine baseLine) {
        this.color = baseLine.getColor();
        this.thickness = baseLine.getThickness();
        this.dotted = baseLine.isDotted();
    }

    public CustomLine() {
    }

    public CustomLine setColor(Color color) {
        this.color = color;
        return this;
    }

    public CustomLine setThickness(float thickness) {
        this.thickness = thickness;
        return this;
    }

    public CustomLine setDotted(boolean dotted) {
        this.dotted = dotted;
        return this;
    }
}
