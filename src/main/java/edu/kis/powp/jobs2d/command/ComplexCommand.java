package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand extends DriverCommand
{
  private List<DriverCommand> driverCommandList;

  public ComplexCommand(Job2dDriver job2dDriver)
  {
    super(job2dDriver);
  }

  public ComplexCommand(Job2dDriver job2dDriver, List<DriverCommand> driverCommandList)
  {
    super(job2dDriver);
    driverCommandList.forEach(driverCommand ->
        this.driverCommandList.add(new ComplexCommand(driverCommand.job2dDriver)));
  }

  @Override
  public void execute()
  {
    driverCommandList.forEach(DriverCommand::execute);
  }
}
