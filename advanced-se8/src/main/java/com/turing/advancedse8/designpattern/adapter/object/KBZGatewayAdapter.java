package com.turing.advancedse8.designpattern.adapter.object;

import com.turing.advancedse8.designpattern.adapter.Gateway;
import com.turing.advancedse8.designpattern.adapter.KBZGateway;

public class KBZGatewayAdapter implements Gateway{

	KBZGateway gateway = new KBZGateway();
	
	@Override
	public void process() {
		this.gateway.doKBZ();
		
	}
	

}
