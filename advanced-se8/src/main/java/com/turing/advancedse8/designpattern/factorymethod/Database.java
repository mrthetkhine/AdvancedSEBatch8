package com.turing.advancedse8.designpattern.factorymethod;

public interface Database {
	void openConnection();
	void executeQuery(String query);
	void closeConnection();
}	
