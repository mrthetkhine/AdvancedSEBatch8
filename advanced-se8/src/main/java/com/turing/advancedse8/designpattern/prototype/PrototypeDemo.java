package com.turing.advancedse8.designpattern.prototype;

public class PrototypeDemo {
	public static void main(String[]args)
	{
		GameItem item = new GameItem("state",10,20);
		GameItem p =(GameItem) item.reproduce();
		p.updatePosition(100, 200);
		
		System.out.println("Item "+item);
		System.out.println("P "+p);
	}
}
