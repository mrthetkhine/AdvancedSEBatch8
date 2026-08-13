package com.turing.advancedse8.oop;

public class Car {
	Engine engine;
	
	public Car(Engine engine)
	{
		this.engine = engine;
	}
	void start()
	{
		System.out.println("Car start");
		this.engine.start();
	}
}
