package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class JaneDriver extends AbstractDriver
{
  private final Job2dDriver job2dDriver;

  public JaneDriver(Job2dDriver job2dDriver)
  {
    super(0, 0);
    this.job2dDriver = job2dDriver;
  }

  public static AbstractDriver toAbstractDriver(Job2dDriver job2dDriver)
  {
    return new JaneDriver(job2dDriver);
  }
  // todo: setPosition wywołuje się tylko dla AbstractDriver

  @Override
  public void operateTo(int x, int y)
  {
//    line.setStartCoordinates(getX(), getY());
//    line.setEndCoordinates(x, y);
//
//    DrawerFeature.getDrawerController().drawLine(line);
//    setPosition(x, y);
    job2dDriver.operateTo(x, y);
  }

  @Override
  public String toString()
  {
    return "Abstract Simulator";
  }
}
