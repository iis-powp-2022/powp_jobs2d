package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class AbstractLineDrawerAdapter extends AbstractDriver
{
  private final Job2dDriver job2dDriver;

  public AbstractLineDrawerAdapter(Job2dDriver job2dDriver)
  {
    super(0, 0);
    this.job2dDriver = job2dDriver;
  }

  public static AbstractDriver toAbstractDriver(Job2dDriver job2dDriver)
  {
    return new AbstractLineDrawerAdapter(job2dDriver);
  }
  // todo: no way to reimplement setPosition for Job2d drivers (especially for LoggerDriver)

  @Override
  public void operateTo(int x, int y)
  {
    job2dDriver.operateTo(x, y);
  }

  @Override
  public String toString()
  {
    return "Abstract Line Drawer";
  }
}
