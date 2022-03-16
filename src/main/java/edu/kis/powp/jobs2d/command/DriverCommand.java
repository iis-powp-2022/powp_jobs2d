package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public abstract class DriverCommand
{
  public Job2dDriver job2dDriver;

  public DriverCommand(Job2dDriver job2dDriver)
  {
    this.job2dDriver = job2dDriver;
  }

  public abstract void execute();
}
