package com.turing.advancedse8.designpattern.abstractfactory.ios;

import com.turing.advancedse8.designpattern.abstractfactory.Button;
import com.turing.advancedse8.designpattern.abstractfactory.Label;
import com.turing.advancedse8.designpattern.abstractfactory.UIFactory;

public class IosUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		
		return new IosButton();
	}

	@Override
	public Label createLabel() {
		// TODO Auto-generated method stub
		return new IosLabel();
	}

}
