package com.turing.advancedse8.oop;

public class BankAccount {
	
	private int balance;
	
	public BankAccount(int balance)
	{
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}

	void debit(int amount)
	{
		if(this.balance>=amount && amount>=0)
		{
			this.balance -= amount;
		}
		
	}
	void credit(int amount)
	{
		if(amount>=0 )
		{
			this.balance += amount;
		}
		
	}
	
	
	
}
