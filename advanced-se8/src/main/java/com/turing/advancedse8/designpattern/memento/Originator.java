package com.turing.advancedse8.designpattern.memento;

public class Originator {
	String state;
	
	public void updateState(String state)
	{
		this.state = state;
	}
	public Memento save()
	{
		return new Memento(this.state);
	}
	public void restore(Memento memento)
	{
		this.state = memento.getState();
	}
	@Override
	public String toString() {
		return "Originator [state=" + state + "]";
	}
	
	
}
