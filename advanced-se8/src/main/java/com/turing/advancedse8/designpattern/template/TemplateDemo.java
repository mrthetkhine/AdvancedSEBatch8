package com.turing.advancedse8.designpattern.template;

public class TemplateDemo {
	public static void main(String[]args)
	{
		FrameworkAction action = new OrderAction();
		action.action();
		
		action = new InvoiceAction();
		action.action();
		
	}
}
