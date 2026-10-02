package com.turing.advancedse8.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Model implements Observable{

	List<Observer> observers = new ArrayList<>();
	
	@Override
	public void attach(Observer observer) {
		this.observers.add(observer);
		
	}

	@Override
	public void deattach(Observer observer) {
		this.observers.remove(observer);
		
	}

	@Override
	public void notify(String message) {
		System.out.println("Observer notify "+message);
		for(Observer obs :  this.observers)
		{
			obs.update(message);
		}
		
	}

}
