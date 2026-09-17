package com.turing.advancedse8.oop;

interface Flyable
{
	void fly();
}
class Bird implements Flyable
{
	public void fly()
	{
		System.out.println("Bird Fly");
	}
}
class Aeroplane implements Flyable
{
	public void fly()
	{
		System.out.println("Aeroplane Fly");
	}
}
public class InterfaceDemo {
	public static void main(String[]args)
	{
		Flyable flyable = new Bird();
		flyable.fly();
		
		flyable = new Aeroplane();
		flyable.fly();
	}
	
}
