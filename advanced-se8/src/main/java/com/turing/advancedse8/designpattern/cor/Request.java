package com.turing.advancedse8.designpattern.cor;

import java.util.HashMap;

public class Request {
	String url;
	HashMap<String,String> headers = new HashMap<>();
	
	public Request(String url)
	{
		this.url=url;
	}
	void addHeader(String name, String value)
	{
		this.headers.put(name, value);
	}
}
