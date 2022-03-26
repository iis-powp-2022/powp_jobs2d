package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class FigureStarFactory
{
  public static ComplexCommand createDrawCommand(Job2dDriver job2dDriver)
  {
    List<DriverCommand> starCommandsList = new ArrayList<>();
    starCommandsList.add(new SetPositionCommand(job2dDriver, -50, -50));
    starCommandsList.add(new OperateToCommand(job2dDriver, 0, -150));
    starCommandsList.add(new OperateToCommand(job2dDriver, 50, -50));
    starCommandsList.add(new OperateToCommand(job2dDriver, 150, 0));
    starCommandsList.add(new OperateToCommand(job2dDriver, 50, 50));
    starCommandsList.add(new OperateToCommand(job2dDriver, 0, 150));
    starCommandsList.add(new OperateToCommand(job2dDriver, -50, 50));
    starCommandsList.add(new OperateToCommand(job2dDriver, -150, 0));
    starCommandsList.add(new OperateToCommand(job2dDriver, -50, -50));
    return new ComplexCommand(starCommandsList);
  }
}
