package com.turing.advancedse8.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ViewGroup extends Widget{

	List<Widget> children = new ArrayList<>();
	
	public ViewGroup(String name)
	{
		super(name);
	}
	void addChild(Widget child)
	{
		this.children.add(child);
	}
	@Override
	public void paint() {
		System.out.println("View group "+this.name + " paint");
		for(Widget widget : this.children)
		{
			widget.paint();
		}
	}

}
