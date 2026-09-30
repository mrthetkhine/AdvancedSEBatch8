package com.turing.advancedse8.designpattern.composite;

public class View extends Widget{

	public View(String name)
	{
		super(name);
	}
	@Override
	public void paint() {
		System.out.println("View "+this.name+" paint");
	}

}
