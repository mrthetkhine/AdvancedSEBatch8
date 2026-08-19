package com.turing.advancedse8.oop;

public class Employee {
	int id;
	public Employee(int id)
	{
		this.id = id;
	}
	void work()
	{
		System.out.println("Employee "+id+" work");
	}
}
