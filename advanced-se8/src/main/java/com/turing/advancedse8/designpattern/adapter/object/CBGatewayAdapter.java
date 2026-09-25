package com.turing.advancedse8.designpattern.adapter.object;

import com.turing.advancedse8.designpattern.adapter.CBGateway;
import com.turing.advancedse8.designpattern.adapter.Gateway;

public class CBGatewayAdapter implements Gateway{

	CBGateway gateway = new CBGateway();
	
	@Override
	public void process() {
		this.gateway.doCB();
		
	}

}
