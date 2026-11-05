package com.turing.advancedse8.unittest.pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.turing.advancedse8.unittest.Calc;

public class CalcTest {
	@Test
	public void testPlus()
	{
		Calc calc = new Calc();
		assertEquals(5,calc.add(2, 3));
	}
	@Test
	public void testPlus2()
	{
		Calc calc = new Calc();
		assertEquals(7,calc.add(2, 5));
	}
}
