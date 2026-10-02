package com.turing.advancedse8.designpattern.cor;

import java.util.Date;

public class LoggingHandler implements Handler{

	@Override
	public void handle(Request request) {
		Date date =new Date();
		System.out.println(date+ " url "+request.url);
		
	}

}
