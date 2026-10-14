package com.turing.advancedse8.designpattern.iterator;

public interface Iterable<T> {
	T next();
	boolean hasNext();
}
