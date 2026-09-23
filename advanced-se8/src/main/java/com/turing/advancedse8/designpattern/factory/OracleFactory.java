package com.turing.advancedse8.designpattern.factory;

import com.turing.advancedse8.designpattern.factorymethod.Database;
import com.turing.advancedse8.designpattern.factorymethod.Oracle;

public class OracleFactory implements DatabaseFactory{

	@Override
	public Database getDatabase() {
		// TODO Auto-generated method stub
		return new Oracle();
	}

}
