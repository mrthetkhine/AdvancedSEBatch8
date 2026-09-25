package com.turing.advancedse8.designpattern.builder;

public class Text {
	String label;
	String color;
	String background;
	String font;
	int fontSize;
	
	public Text(TextBuilder builder)
	{
		this.label = builder.label;
		this.color = builder.color;
		this.background= builder.background;
		this.font = builder.font;
		this.fontSize = builder.fontSize;
	}
	
	@Override
	public String toString() {
		return "Text [label=" + label + ", color=" + color + ", background=" + background + ", font=" + font
				+ ", fontSize=" + fontSize + "]";
	}

	public static class TextBuilder
	{
		String label;
		String color;
		String background;
		String font;
		int fontSize;
		
		TextBuilder label(String label)
		{
			this.label = label;
			return this;
		}
		TextBuilder color(String color)
		{
			this.color = color;
			return this;
		}
		TextBuilder background(String background)
		{
			this.background = background;
			return this;
		}
		TextBuilder font(String font)
		{
			this.font = font;
			return this;
		}
		TextBuilder fontSize(int fontSize)
		{
			this.fontSize = fontSize;
			return this;
		}
		Text build()
		{
			return new Text(this);
		}
	}
}
