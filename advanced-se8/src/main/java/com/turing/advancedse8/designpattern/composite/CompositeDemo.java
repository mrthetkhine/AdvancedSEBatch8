package com.turing.advancedse8.designpattern.composite;

public class CompositeDemo {
	public static void main(String[]args)
	{
		ViewGroup parent = new ViewGroup("parent1");
		View textBox = new View("textbox");
		parent.addChild(textBox);
		
		ViewGroup subGroup = new ViewGroup("parent1 sub group");
		subGroup.addChild(new View("subgroup textbox"));
		
		parent.addChild(subGroup);
		
		parent.paint();
	}
}
