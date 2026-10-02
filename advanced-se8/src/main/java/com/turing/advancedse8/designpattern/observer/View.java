package com.turing.advancedse8.designpattern.observer;

public class View implements Observer{

	String name;
	public View(String name)
	{
		this.name = name;
	}
	@Override
	public void update(String message) {
		System.out.println("View "+this.name+" got update "+message);
		
	}

}
