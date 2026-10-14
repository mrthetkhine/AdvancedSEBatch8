package com.turing.advancedse8.designpattern.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IteratorDemo {
	public static void main(String[]args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		
		for(Integer i: list)
		{
			System.out.println("I "+i);
		}
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(200);
		
		for(Integer i: set)
		{
			System.out.println("set item "+i);
		}
		Range range = new Range(1,6);
		for(Integer i: range)
		{
			System.out.println("Range "+i);
		}
	}
}
