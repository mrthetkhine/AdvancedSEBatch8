package com.turing.advancedse8.designpattern.flyweight;

public class FlyweightDemo {
	public static void main(String[]args)
	{
		PlatformFactory factory = new PlatformFactory();
		Platform p = factory.getPlatform("JVM");
		p.execute("Code");
		
		p = factory.getPlatform("CLR");
		p.execute("code");
		
		p = factory.getPlatform("JVM");
		p.execute("Code");
	}
}
