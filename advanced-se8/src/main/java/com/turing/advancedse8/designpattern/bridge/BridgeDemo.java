package com.turing.advancedse8.designpattern.bridge;

public class BridgeDemo {
	public static void main(String[]args)
	{
		DrawingApi api = new SvgApi();
		api = new CanvasApi();
		Shape shape = new Circle(api);
		
		shape.draw();
		
		shape = new Rectangle(api);
		shape.draw();
	}
}
