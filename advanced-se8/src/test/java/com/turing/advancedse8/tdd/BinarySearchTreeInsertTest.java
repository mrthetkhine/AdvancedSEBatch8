package com.turing.advancedse8.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTreeInsertTest {
	BinarySearchTree tree = new BinarySearchTree();
	
	@Test
	public void insertRoot()
	{
		
		tree.insert(100);
		
		Node root = tree.getRoot();
		assertEquals(100,root.value);
		
		tree = new BinarySearchTree();
		tree.insert(200);
		
		root = tree.getRoot();
		assertEquals(200,root.value);
	}
	@Test
	public void insertLeft()
	{
		
		tree.insert(100);
		Node node = tree.insert(60);
		
		Node root = tree.getRoot();
		assertEquals(100,root.value);
		
		assertEquals(60,root.getLeft().value);
		assertEquals(root,node.getParent());
	}
	@Test
	public void insertRight()
	{
		
		tree.insert(100);
		Node node = tree.insert(120);
		
		Node root = tree.getRoot();
		assertEquals(100,root.value);
		
		assertEquals(120,root.getRight().value);
		assertEquals(root,node.getParent());
	}
	@Test
	public void insertLeftLevel1()
	{
		
		tree.insert(100);
		Node parent = tree.insert(60);
		Node node = tree.insert(15);
		
		assertEquals(15,node.value);
		assertEquals(60,parent.value);
		assertEquals(parent,node.getParent());
		assertEquals(15,parent.getLeft().value);
		
	}
	@Test
	public void insertRightLevel1()
	{
		
		tree.insert(100);
		Node parent = tree.insert(60);
		Node node = tree.insert(70);
		
		assertEquals(70,node.value);
		assertEquals(60,parent.value);
		assertEquals(parent,node.getParent());
		assertEquals(70,parent.getRight().value);
		
	}
}
