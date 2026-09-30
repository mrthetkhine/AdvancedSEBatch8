package com.turing.advancedse8.designpattern.decorator;

public class BasicLogger implements Logger{

	@Override
	public String log(String message) {
		
		return message;
	}

}
