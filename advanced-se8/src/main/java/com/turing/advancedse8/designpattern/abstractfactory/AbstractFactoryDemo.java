package com.turing.advancedse8.designpattern.abstractfactory;

import com.turing.advancedse8.designpattern.abstractfactory.android.AndroidUIFactory;
import com.turing.advancedse8.designpattern.abstractfactory.ios.IosUIFactory;

public class AbstractFactoryDemo {
	public static void main(String[]args)
	{
		UIFactory factory = new AndroidUIFactory();
		factory = new IosUIFactory();
		
		Button button  =factory.createButton();
		button.paint();
		
		Label label = factory.createLabel();
		label.paint();
	}
}
