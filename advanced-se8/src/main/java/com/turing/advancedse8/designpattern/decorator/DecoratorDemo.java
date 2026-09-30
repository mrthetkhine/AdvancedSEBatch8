package com.turing.advancedse8.designpattern.decorator;

public class DecoratorDemo {
	public static void main(String[]args)
	{
		Logger logger =new HtmlDecorator(new TimeDecorator( new BasicLogger()));
		
		String message = logger.log("Hello log");
		System.out.println("Message "+message);
	}
}
