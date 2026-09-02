package com.turing.advancedse8.tdd.kata;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

//https://tddbuddy.com/katas/balanced-brackets/
public class BalanceBracketTest {

	BracketChecker checker = new BracketChecker();
	
	@Test
	void testEmptyCase()
	{
		assertTrue(checker.check(""));
	}
	@Test
	void testBaseCase()
	{
		assertTrue(checker.check("[]"));
		assertTrue(checker.check("[][]"));
		assertTrue(checker.check("[[]]"));
		assertTrue(checker.check("[[[][]]]"));
	}
	@Test
	void testNegativeCase()
	{
		assertFalse(checker.check("]["));
		assertFalse(checker.check("][]["));
		assertFalse(checker.check("[][]]["));
	}
	@Test
	void testPositiveParaenthesis()
	{
		assertTrue(checker.check("()"));
		assertTrue(checker.check("[()]"));
		assertTrue(checker.check("[]()[]()"));
		
	}
	@Test
	void testNegativeParaenthesis()
	{
		assertFalse(checker.check("("));
		assertFalse(checker.check("]"));
		assertFalse(checker.check("]("));
		assertFalse(checker.check("]()"));
		assertFalse(checker.check("()["));
	}
}
