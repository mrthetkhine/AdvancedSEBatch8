package com.turing.advancedse8.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LearningTest {
	
	@Test
	public void testAdd()
	{
		Calc calc = new Calc();
		int result = calc.add(1,2);
		assertEquals(3,result);
	}
}
