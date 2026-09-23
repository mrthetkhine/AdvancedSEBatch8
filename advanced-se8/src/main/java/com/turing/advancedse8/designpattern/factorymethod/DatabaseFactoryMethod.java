package com.turing.advancedse8.designpattern.factorymethod;

public class DatabaseFactoryMethod {
	Database getDatabase(String type)
	{
		if(type=="MySQL") 
		{
			return new MySQL();
		}
		else
		{
			return new Oracle();
		}
	}
}
