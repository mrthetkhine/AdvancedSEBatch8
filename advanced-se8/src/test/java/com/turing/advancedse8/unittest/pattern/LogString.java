package com.turing.advancedse8.unittest.pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LogString extends Template{
	String log = "";
	void auth()
	{
		log = "auth ";
		System.out.println("Auth");
	}
	void order()
	{
		log += "order ";
		System.out.println("order");
	}
	void another()
	{
		log += "another";
		System.out.println("Another");
	}
	@Test
	public void testLogString()
	{
		LogString t= new LogString();
		t.process();
		
		assertEquals("auth order another",t.log);
	}
}
