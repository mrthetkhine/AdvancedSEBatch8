package com.turing.advancedse8.designpattern.adapter.object;

import com.turing.advancedse8.designpattern.adapter.Gateway;


public class ObjectAdapterDemo {
	public static void main(String[]args)
	{
		Gateway gateway = new KBZGatewayAdapter();
		gateway.process();
		
		gateway = new CBGatewayAdapter();
		gateway.process();
	}
}
