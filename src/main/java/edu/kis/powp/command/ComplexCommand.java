package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand{

	private ArrayList<DriverCommand> commands = new ArrayList<>();

	public void addToList(DriverCommand commandToAdd){
		commands.add(commandToAdd);
	}

	@Override
	public void execute() {
		System.out.println("TEST");
		for(DriverCommand c : commands) {
			c.execute();

		}
	}
}
