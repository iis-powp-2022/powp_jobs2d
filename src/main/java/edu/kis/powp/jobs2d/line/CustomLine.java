package edu.kis.powp.jobs2d.line;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class CustomLine extends AbstractLine
{
  public CustomLine()
  {
    super();
  }

  public CustomLine(Color color, float thickness, boolean dotted)
  {
    super();

    this.color = color;
    this.thickness = thickness;
    this.dotted = dotted;
  }

  public static ILine getLine(Color color, float thickness, boolean dotted)
  {
    return new CustomLine(color, thickness, dotted);
  }

  public void setColor(Color color)
  {
    this.color = color;
  }

  public void setThickness(float thickness)
  {
    this.thickness = thickness;
  }

  public void setDotted(boolean dotted)
  {
    this.dotted = dotted;
  }
}
