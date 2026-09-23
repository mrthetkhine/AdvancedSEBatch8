package com.turing.advancedse8.designpattern.factorymethod;
/*
 * Problem
 * Database
interface Database
{
    openConnection();
    executeQuery();
    closeConnection();
}
DatabaseFactory
{
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
class MySQL
{
    void openMySQLConnection();

    void closeMySQLConnection();

    void executeMySQLQuery();
}
class Oracle
{
    void openOracleConnection();

    void closeOracleConnection();

    void executeOracleQuery(String sql);
}
	MySQL mysql = new MySQL();
	mysql.openMySQLConnection();
	mysql.executeMySQLQuery();
	mysql.closeMySQLConnection();
	
	simple factory method
    
 * */
public class SimpleFactoryDemo {
	public static void main(String[]args)
	{
		DatabaseFactoryMethod factory = new DatabaseFactoryMethod();
		Database db = factory.getDatabase("Oracle");
		
		db.openConnection();
		db.executeQuery("SELECT");
		db.closeConnection();
	}
}
