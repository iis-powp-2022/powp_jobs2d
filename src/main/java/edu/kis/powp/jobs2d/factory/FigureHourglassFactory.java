package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class FigureHourglassFactory
{
  public static ComplexCommand createDrawCommand(Job2dDriver job2dDriver)
  {
    List<DriverCommand> hourglassCommandsList = new ArrayList<>();
    hourglassCommandsList.add(new SetPositionCommand(job2dDriver, 50, -100));
    hourglassCommandsList.add(new OperateToCommand(job2dDriver, -50, 100));
    hourglassCommandsList.add(new OperateToCommand(job2dDriver, 50, 100));
    hourglassCommandsList.add(new OperateToCommand(job2dDriver, -50, -100));
    hourglassCommandsList.add(new OperateToCommand(job2dDriver, 50, -100));
    return new ComplexCommand(hourglassCommandsList);
  }
}
