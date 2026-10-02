package com.turing.advancedse8.designpattern.flyweight;

public class CLR implements Platform{

	public CLR()
	{
		System.out.println("CLR Created");
	}
	@Override
	public void execute(String code) {
		System.out.println("Code execute on CLR");
	}

}
