package com.turing.advancedse8.designpattern.anno;

public class ValidationDemo {
	public static void main(String[]args)
	{
		Human h = new Human("",40);
		Validator validator = new Validator();
		
		Student student = new Student(null,null);
		validator.validate(student);
	}
}
