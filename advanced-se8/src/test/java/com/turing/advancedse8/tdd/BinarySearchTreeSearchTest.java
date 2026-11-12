package com.turing.advancedse8.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTreeSearchTest {
	BinarySearchTree tree;
	
	BinarySearchTreeSearchTest()
	{
		tree = new BinarySearchTree();
		tree.insert(100);
		tree.insert(60);
		tree.insert(120);
		tree.insert(15);
		tree.insert(70);
	}
	@Test
	public void testSearchRoot()
	{
		Node node = tree.search(100);
		assertEquals(100,node.value);
		
	}
	@Test
	public void testNegative()
	{
		int arr[] = new int[]{101,61,13,16,170};
		for(int item :arr)
		{
			Node current = tree.search(item);
			assertEquals(null,current);
		}
	}
	@Test
	public void testPositive()
	{
		int arr[] = new int[]{100,60,120,15,70};
		for(int item :arr)
		{
			Node current = tree.search(item);
			assertEquals(item,current.value);
		}
	}
}
