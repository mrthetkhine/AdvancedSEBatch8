package com.turing.advancedse8.designpattern.observer;

public interface Observable {
	void attach(Observer observer);
	void deattach(Observer observer);
	void notify(String message);
}
