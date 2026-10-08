package com.turing.advancedse8.designpattern.strategy;

public class SortingAlgorithm {
	ComparableStrategy strategy;
	
	void sort()
	{
		System.out.println("Loop ");
		this.strategy.compare();
	}
	void setStrategy(ComparableStrategy strategy)
	{
		this.strategy = strategy;
	}
	
}
