package com.turing.advancedse8.designpattern.factory;

import com.turing.advancedse8.designpattern.factorymethod.Database;

public class FactoryDemo {
	public static void main(String[]args)
	{
		DatabaseFactory factory = new MySQLFactory();
		factory = new OracleFactory();
		Database db = factory.getDatabase();
		
		db.openConnection();
		db.executeQuery("SQL");
		db.closeConnection();
	}
}
