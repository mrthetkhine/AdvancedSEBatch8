package com.turing.advancedse8.designpattern.bridge;

public abstract class Shape {
	
	DrawingApi api;
	Shape(DrawingApi api)
	{
		this.api = api;
	}
	public abstract void draw();
}
