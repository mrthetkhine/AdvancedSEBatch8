package com.turing.advancedse8.designpattern.factorymethod;

public class MySQL implements Database{

	@Override
	public void openConnection() {
		System.out.println("MySQL Open Connection");
		
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("MySQL executeQuery");
		
	}

	@Override
	public void closeConnection() {
		System.out.println("MySQL close Connection");
		
	}

}
