package com.turing.advancedse8.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	List<Command> commands = new ArrayList<>();
	
	void add(Command command)
	{
		this.commands.add(command);
	}
	void executeAll()
	{
		for(Command c : this.commands)
		{
			c.execute();
		}
	}
}
