package com.turing.advancedse8.designpattern.memento;

public class CareTaker {
	public static void main(String[]args)
	{
		Originator org = new Originator();
		org.updateState("init");
		
		Memento savedMemento = org.save();
		org.updateState("another");
		
		System.out.println("org "+org);
		org.restore(savedMemento);
		
		System.out.println("org "+org);
	}
}
