package com.turing.advancedse8.designpattern.memento;

public class Memento {
	String state;
	public Memento(String state)
	{
		this.state = state;
	}
	public String getState()
	{
		return this.state;
	}
}

