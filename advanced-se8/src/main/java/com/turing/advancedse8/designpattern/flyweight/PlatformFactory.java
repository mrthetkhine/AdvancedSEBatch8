package com.turing.advancedse8.designpattern.flyweight;

import java.util.HashMap;

public class PlatformFactory {
	HashMap<String,Platform> cache = new HashMap<>();
	
	Platform getPlatform(String type)
	{
		Platform p= this.cache.get(type);
		if(p == null)
		{
			if(type=="JVM")
			{
				p = new JVM();
			}
			else if(type=="CLR")
			{
				p =new CLR();
			}
			this.cache.put(type, p);
		}
		return p;
		
	}
}
