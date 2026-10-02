package com.turing.advancedse8.designpattern.proxy;

public class CommandExecutorImpl implements CommandExecutor{

	@Override
	public void run(String command) {
		System.out.println("Execute command "+command);
		
	}

}
