package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand extends DriverCommand
{
  private int x;
  private int y;

  public SetPositionCommand(Job2dDriver job2dDriver, int x, int y)
  {
    super(job2dDriver);
    this.x = x;
    this.y = y;
  }

  @Override
  public void execute()
  {
    job2dDriver.setPosition(x, y);
  }
}
