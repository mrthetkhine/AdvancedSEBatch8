package com.turing.advancedse8.designpattern.factorymethod;

public class Oracle implements Database{

	@Override
	public void openConnection() {
		System.out.println("Oracle open connection");
		
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("Oracle execute query");
		
	}

	@Override
	public void closeConnection() {
		System.out.println("Oracle close connection");
		
	}

}
