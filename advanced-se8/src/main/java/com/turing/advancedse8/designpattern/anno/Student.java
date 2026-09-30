package com.turing.advancedse8.designpattern.anno;

public class Student {
	
	@NotNullOrEmpty(message="Name should not be empty")
	String name;
	
	@NotNullOrEmpty(message="School should not be empty")
	String school;
	
	public Student(String name,String school)
	{
		this.name = name;
		this.school = school;
	}
}
