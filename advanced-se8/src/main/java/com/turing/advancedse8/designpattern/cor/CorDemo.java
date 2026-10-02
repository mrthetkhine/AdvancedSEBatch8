package com.turing.advancedse8.designpattern.cor;

public class CorDemo {
	public static void main(String[]args)
	{
		Framework framework =new Framework();
		
		framework.use(new LoggingHandler());
		framework.use(new AuthHandler());
		framework.use(new Controller());
		
		Request request = new Request("/hello");
		//request.addHeader("Authorization", "Bearer token");
		
		framework.process(request);
	}
}
