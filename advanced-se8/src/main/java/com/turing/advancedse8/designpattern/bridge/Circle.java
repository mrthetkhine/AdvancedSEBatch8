package com.turing.advancedse8.designpattern.bridge;

public class Circle extends Shape{

	public Circle(DrawingApi api)
	{
		super(api);
	}
	@Override
	public void draw() {
		this.api.drawCircle();
	}

}
