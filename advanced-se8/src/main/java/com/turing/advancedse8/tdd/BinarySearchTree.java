package com.turing.advancedse8.tdd;

public class BinarySearchTree {

	Node root;
	
	public Node insert(int value) {
		Node node = new  Node(value);
		if(this.root== null)
		{
			this.root = node;
		}
		else
		{
			Node current = this.root;
			Node parent = null;
			while(current != null)
			{
				if(value <  current.value)
				{
					parent = current;
					current = current.getLeft();
				}
				else if(value > current.value)
				{
					parent = current;
					current = current.getRight();
				}
			}
			node.setParent(parent);
			if(value< parent.value)
			{
				parent.setLeft(node);
			}
			else if(value > parent.value)
			{
				parent.setRight(node);
			}
			
		}
		return node;
	}
	public Node getRoot() {
		return root;
	}
	public Node search(int value) {
		Node current = this.root;
		while(current != null)
		{
			if(current.value==value)
			{
				return current;
			}
			else if(value <  current.value)
			{
				current = current.getLeft();
			}
			else if(value > current.value)
			{
				current = current.getRight();
			}
		}
		return null;
	}
	
	
}
