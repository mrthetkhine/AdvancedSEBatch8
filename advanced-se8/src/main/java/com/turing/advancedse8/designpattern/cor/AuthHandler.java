package com.turing.advancedse8.designpattern.cor;

public class AuthHandler implements Handler{

	@Override
	public void handle(Request request) {
		if(!request.headers.containsKey("Authorization"))
		{
			throw new RuntimeException("Not Authenticated");
		}
		else
		{
			System.out.println("Auth ok");
		}
		
	}

}
