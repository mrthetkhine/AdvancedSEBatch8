package com.turing.advancedse8.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class LearningTest {
	
	@Test
	public void testAdd()
	{
		Calc calc = new Calc();
		int result = calc.add(1,2);
		assertEquals(3,result);
	}
	boolean isFriday(LocalDate date)
	{
		return date.getDayOfWeek() == DayOfWeek.FRIDAY;
	}
	@Test
	public void testIsFriday()
	{
		LocalDate thursday = LocalDate.of(2026,8,20);
		assertFalse(isFriday(thursday));
		
		LocalDate friday = LocalDate.of(2026,8,21);
		assertTrue(isFriday(friday));
	}
}
