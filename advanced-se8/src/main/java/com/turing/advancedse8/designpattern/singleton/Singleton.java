package com.turing.advancedse8.designpattern.singleton;

public final class Singleton {
	private static Singleton instance;
	
	private Singleton()
	{
		System.out.println("Singleton created");
	}
	public synchronized static Singleton getInstance()
	{
		if(instance==null)
		{
			instance = new Singleton();
		}
		return instance;
	}
	void businessLogic()
	{
		System.out.println("Business Logic");
	}
}
