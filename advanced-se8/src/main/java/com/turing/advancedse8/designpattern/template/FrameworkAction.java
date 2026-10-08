package com.turing.advancedse8.designpattern.template;

public abstract class FrameworkAction {
	void auth()
	{
		System.out.println("Authenticate");
	}
	abstract void businessLogic();
	void log()
	{
		System.out.println("Log");
	}
	void action()
	{
		this.auth();
		this.businessLogic();
		this.log();
	}
}
