package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    private ArrayList<ComplexCommandStore> commands = new ArrayList<>();

    public void addToList(ComplexCommandStore commandToAdd){
        commands.add(commandToAdd);
    }

    @Override
    public void execute() {
        for(ComplexCommandStore c : commands) {
            try {
                c.getSet().execute();
            } catch (NullPointerException e){
                c.getOp().execute();
            }
        }
    }
}
