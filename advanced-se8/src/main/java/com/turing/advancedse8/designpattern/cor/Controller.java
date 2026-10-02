package com.turing.advancedse8.designpattern.cor;

public class Controller implements Handler{

	@Override
	public void handle(Request request) {
		System.out.println("Controller Logic");
		
	}

}
