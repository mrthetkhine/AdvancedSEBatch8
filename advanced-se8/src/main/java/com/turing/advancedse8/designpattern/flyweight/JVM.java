package com.turing.advancedse8.designpattern.flyweight;

public class JVM implements Platform{

	public JVM()
	{
		System.out.println("JVM Created");
	}
	@Override
	public void execute(String code) {
		System.out.println("Code execute on JVM");
	}

}
