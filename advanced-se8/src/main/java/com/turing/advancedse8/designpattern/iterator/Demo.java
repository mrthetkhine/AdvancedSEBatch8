package com.turing.advancedse8.designpattern.iterator;

public class Demo {
	public static void main(String[]args)
	{
		StringContainer con =new StringContainer("Hello World");
		
		char[] arr = new char[] {'A','B','C'};
		ArrayContainer con2 = new ArrayContainer(arr);
		
		Iterable<Character> iterator = con2.createIterator();
		while(iterator.hasNext())
		{
			System.out.println("Next "+iterator.next());
		}
	}
}
