package com.turing.advancedse8.designpattern.singleton;

public class SingletonDemo {
	public static void main(String[]args)
	{
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println("instance==instance2 "+(instance==instance2));
		
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		
		System.out.println("r1==r2 "+(r1==r2));
		
	}
}
