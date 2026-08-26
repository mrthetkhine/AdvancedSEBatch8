package com.turing.advancedse8.oop;

public class Order {
	SmsSender smsSender;
	
	public Order(SmsSender sender)
	{
		this.smsSender = sender;
	}
	public void order(int orderId)
	{
		this.smsSender.sendSms("Order "+orderId+" Processed");
	}
}
