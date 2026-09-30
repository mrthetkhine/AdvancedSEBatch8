package com.turing.advancedse8.designpattern.decorator;

public class HtmlDecorator implements Logger{

	Logger logger;
	public HtmlDecorator(Logger logger)
	{
		this.logger = logger;
	}
	@Override
	public String log(String message) {
		
		return "<h1>"+ this.logger.log(message)+"</h1>";
	}

}
