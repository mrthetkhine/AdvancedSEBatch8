package com.turing.advancedse8.designpattern.decorator;

import java.util.Date;

public class TimeDecorator  implements Logger{

	Logger logger;
	public TimeDecorator(Logger logger)
	{
		this.logger = logger;
	}
	@Override
	public String log(String message) {
		Date date = new Date();
		return date.toString()+ this.logger.log(message);
	}

}
