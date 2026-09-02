package com.turing.advancedse8.untestable;

abstract class Shape
{
	abstract float area();
}
class Circle extends Shape
{

	int radius;
	public Circle(int r)
	{
		this.radius = r;
	}
	@Override
	float area() {
		
		return (float)(Math.PI*this.radius*this.radius);
	}
}
class Rectangle extends Shape
{
	int width,height;
	
	public Rectangle(int width,int height)
	{
		this.width = width;
		this.height= height;
	}

	@Override
	float area() {
		
		return this.width * this.height;
	}
}
public class InstanceOf {

	/*
	float computeArea(Shape shape)
	{
		if(shape instanceof Circle)
		{
			return shape.area();
		}
		else if(shape instanceof Rectangle)
		{
			return shape.area();
		}
		else
		{
			return 0;
		}
	}*/
	//solution
	float computeArea(Shape shape)
	{
		return shape.area();
	}
}
