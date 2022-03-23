package edu.kis.powp.command;
import java.util.ArrayList;
import java.util.List;

// wzorzec kompozyt
public class ComplexCommand implements DriverCommand{

    List<DriverCommand> commandList;

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    @Override
    public void execute() {
        for(DriverCommand command : commandList){
            command.execute();
        }
    }
}
