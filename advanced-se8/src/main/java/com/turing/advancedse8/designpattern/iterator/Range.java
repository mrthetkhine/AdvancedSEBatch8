package com.turing.advancedse8.designpattern.iterator;
import java.util.Iterator;
import java.lang.Iterable;
public class Range implements Iterable<Integer>{
	int from,to;
	public Range(int from,int to)
	{
		this.from = from;
		this.to = to;
	}
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new RangeIterator();
	}
	class RangeIterator implements Iterator<Integer>
	{

		int value = from;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return value<=to;
		}

		@Override
		public Integer next() {
			return value++;
		}
		
	}
	
}
