package com.turing.advancedse8.designpattern.composite;

public abstract class Widget {
	String name;
	public Widget(String name)
	{
		this.name = name;
	}
	public abstract void paint();
}
