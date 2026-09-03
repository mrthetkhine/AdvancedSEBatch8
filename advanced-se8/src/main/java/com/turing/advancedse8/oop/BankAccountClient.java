package com.turing.advancedse8.oop;

public class BankAccountClient {
	public static void main(String[] args)
	{
		BankAccount acc = new BankAccount(1000);
		
		acc.debit(500);
		acc.credit(2000);
		
		System.out.println("Balance "+acc.getBalance());
		
	}
}
