package com.turing.advancedse8.designpattern.observer;

public class Demo {
	public static void main(String[]args)
	{
		Model model =new Model();
		View v1 =new View("one");
		View v2 = new View("two");
		View v3 = new View("three");
		
		model.attach(v1);
		model.attach(v2);
		model.attach(v3);
		
		model.notify("Update 1");
		
		model.deattach(v3);
		model.notify("Update 2");
	}
}
