package com.turing.advancedse8.designpattern.anno;

public class Human {
	@NotNullOrEmpty(message="Name should not be empty")
	String name;
	
	int age;
	
	Human(String name,int age)
	{
		this.name= name;
		this.age = age;
	}
}
