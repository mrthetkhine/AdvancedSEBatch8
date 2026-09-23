package com.turing.advancedse8.untestable;

import com.turing.advancedse8.designpattern.singleton.Singleton;

public class SingletonTest {
	public static void main(String[]args)
	{
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println("Obj 1 ==obj2 "+(obj1==obj2));
	}
}
