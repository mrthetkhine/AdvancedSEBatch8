package com.turing.advancedse8.designpattern.command;

public class CommandDemo {
	public static void main(String[]args)
	{
		Invoker invoker = new Invoker();
		invoker.add(new Copy());
		invoker.add(new Paste());
		invoker.add(new Edit());
		
		System.out.println("Start");
		invoker.executeAll();
	}
}
