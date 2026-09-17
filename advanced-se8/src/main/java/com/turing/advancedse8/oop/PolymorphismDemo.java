package com.turing.advancedse8.oop;

abstract class Shape
{
	abstract void draw();
	void initPen()
	{
		System.out.println("Init pen");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		super.initPen();
		System.out.println("Rectangle draw");
	}
}
class Circle extends Shape
{
	void draw()
	{
		super.initPen();
		System.out.println("Circle draw");
	}
}
public class PolymorphismDemo {
	public static void main(String[]args)
	{
		Shape shape = new Rectangle();
		shape.draw();
		
		shape = new Circle();
		shape.draw();
	}
}
