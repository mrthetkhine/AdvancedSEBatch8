package com.turing.advancedse8.designpattern.adapter.classadapter;

import com.turing.advancedse8.designpattern.adapter.CBGateway;
import com.turing.advancedse8.designpattern.adapter.Gateway;

public class CBGatewayAdapter extends CBGateway implements Gateway{

	@Override
	public void process() {
		super.doCB();
		
	}

}
