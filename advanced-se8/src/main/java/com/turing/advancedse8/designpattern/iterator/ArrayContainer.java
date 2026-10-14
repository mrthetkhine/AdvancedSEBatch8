package com.turing.advancedse8.designpattern.iterator;

public class ArrayContainer implements Iterator<Character>{
	char[]elements;
	ArrayContainer(char[]arr)
	{
		this.elements = arr;
	}
	
	@Override
	public Iterable<Character> createIterator() {
		
		return new ArrayContainerIterator();
	}
	class ArrayContainerIterator implements Iterable<Character>
	{
		int index = 0;
		
		@Override
		public Character next() {
			
			return elements[index++];
		}
		@Override
		public boolean hasNext() {
			
			return index< elements.length;
		}
	}
}
