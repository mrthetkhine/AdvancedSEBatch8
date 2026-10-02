package com.turing.advancedse8.designpattern.flyweight;

public class IntegerCacheDemo {
	public static void main(String[]args)
	{
		Integer a = 127;
		Integer b= 127;
		
		System.out.println("a==b "+(a==b));
		
		Integer c = 128;
		Integer d = 128;
		System.out.println("c==d "+(c==d));
	}
}
