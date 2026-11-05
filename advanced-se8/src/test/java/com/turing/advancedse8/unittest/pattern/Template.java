package com.turing.advancedse8.unittest.pattern;

public class Template {
	void auth()
	{
		System.out.println("Auth");
	}
	void order()
	{
		System.out.println("order");
	}
	void another()
	{
		System.out.println("Another");
	}
	void process()
	{
		this.auth();
		this.order();
		this.another();
	}
}
