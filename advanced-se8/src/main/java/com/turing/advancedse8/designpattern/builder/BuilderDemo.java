package com.turing.advancedse8.designpattern.builder;

public class BuilderDemo {
	public static void main(String[]args)
	{
		Text text = new Text.TextBuilder() 
							.label("Hello")
							.color("green")
							//.font("Times new Roman")
							.build();
		System.out.println("Text "+text);
	}
}
