package com.turing.advancedse8.designpattern.bridge;

public class Rectangle extends Shape{

	public Rectangle(DrawingApi api) 
	{
		super(api);
	}
	@Override
	public void draw() {
		this.api.drawRectangle();
	}

}
