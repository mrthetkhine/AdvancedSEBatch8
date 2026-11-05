package com.turing.advancedse8.unittest.pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.turing.advancedse8.oop.Car;
import com.turing.advancedse8.oop.Engine;

public class SelfShunt extends Engine{
	boolean started = false;
	
	public void start()
	{
		System.out.println("Engine start");
		this.started = true;
	}
	@Test
	void testEngineStart()
	{
		Car car = new Car(this);
		car.start();
		
		assertTrue(started);
	}
}
