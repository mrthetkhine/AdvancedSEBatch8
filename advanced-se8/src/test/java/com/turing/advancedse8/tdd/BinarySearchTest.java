package com.turing.advancedse8.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {
	
	BinarySearch algo =new BinarySearch();
	@Test
	void testEmpty()
	{
		
		assertEquals(-1,algo.search(null,1));
		assertEquals(-1,algo.search(new int[]{},1));
	}
	@Test
	void testOne()
	{
		
		int arr[] = {5};
		assertEquals(0,algo.search(arr,5));
		assertEquals(-1,algo.search(arr,10));
		assertEquals(-1,algo.search(arr,3));
	}
	@Test
	void testTwoElement()
	{
		
		int arr[] = {2,5};
		assertEquals(0,algo.search(arr,2));
		assertEquals(1,algo.search(arr,5));
		assertEquals(-1,algo.search(arr,10));
		assertEquals(-1,algo.search(arr,3));
	}
	@Test
	void testMoreElement()
	{
		
		int arr[] = {2,5,10};
		assertEquals(0,algo.search(arr,2));
		assertEquals(1,algo.search(arr,5));
		assertEquals(2,algo.search(arr,10));
		assertEquals(-1,algo.search(arr,1));
		assertEquals(-1,algo.search(arr,3));
		assertEquals(-1,algo.search(arr,15));
	}
	@Test
	void testMoreElements()
	{
		
		int arr[] = {2,5,10,15};
		assertEquals(0,algo.search(arr,2));
		assertEquals(1,algo.search(arr,5));
		assertEquals(2,algo.search(arr,10));
		assertEquals(3,algo.search(arr,15));
		assertEquals(-1,algo.search(arr,1));
		assertEquals(-1,algo.search(arr,13));
		assertEquals(-1,algo.search(arr,3));
		assertEquals(-1,algo.search(arr,18));
	}
}
