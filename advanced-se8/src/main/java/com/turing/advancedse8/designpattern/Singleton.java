package com.turing.advancedse8.designpattern;

public class Singleton {
	private static Singleton instance;
	
	private Singleton()
	{
		System.out.println("Singleton created");
	}
	public static Singleton getInstance()
	{
		if(instance==null)
		{
			instance = new Singleton();
		}
		return instance;
	}
}
