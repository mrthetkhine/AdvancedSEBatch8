package com.turing.advancedse8.designpattern.adapter.classadapter;
import com.turing.advancedse8.designpattern.adapter.Gateway;
public class ClassAdapterDemo {
	public static void main(String[]args)
	{
		Gateway gateway = new KBZGatewayAdapter();
		gateway.process();
		
		gateway = new CBGatewayAdapter();
		gateway.process();
	}
}
