package com.turing.advancedse8.designpattern.bridge;

public class SvgApi implements DrawingApi{

	@Override
	public void drawCircle() {
		System.out.println("Draw SVG Circle");
		
	}

	@Override
	public void drawRectangle() {
		System.out.println("Draw SVG Rectangle");
		
	}

}
