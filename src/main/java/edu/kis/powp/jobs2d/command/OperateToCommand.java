package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand extends DriverCommand
{
  private int x;
  private int y;

  public OperateToCommand(Job2dDriver job2dDriver, int x, int y)
  {
    super(job2dDriver);
    this.x = x;
    this.y = y;
  }

  @Override
  public void execute()
  {
    job2dDriver.operateTo(x, y);
  }
}
