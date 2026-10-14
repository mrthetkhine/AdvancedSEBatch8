package com.turing.advancedse8.designpattern.state;

public class Demo {
	 public static void main(String[] args) {
	        StateContext context = new StateContext(new HungryState());
	        context.doAction();
	        context.doAction();
	        context.doAction();
	}
}
