package com.turing.advancedse8.designpattern.abstractfactory.android;

import com.turing.advancedse8.designpattern.abstractfactory.Button;
import com.turing.advancedse8.designpattern.abstractfactory.Label;
import com.turing.advancedse8.designpattern.abstractfactory.UIFactory;
import com.turing.advancedse8.designpattern.abstractfactory.ios.IosButton;
import com.turing.advancedse8.designpattern.abstractfactory.ios.IosLabel;

public class AndroidUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		
		return new AndroidButton();
	}

	@Override
	public Label createLabel() {
		// TODO Auto-generated method stub
		return new AndroidLabel();
	}

}
