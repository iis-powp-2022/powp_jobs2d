package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    List<DriverCommand> comms = new ArrayList<>();

    @Override
    public void execute(Job2dDriver driver) {
        comms.forEach( (n) -> n.execute(driver));
    }

    public void addComm(DriverCommand comm){
        comms.add(comm);
    }

    public void loadComms(List<DriverCommand> comms){
        this.comms.addAll(comms);
    }

    public void clearComms(){
        comms.clear();
    }

    public ComplexCommand getComms(){
        return this;
    }

}
