package com.turing.advancedse8.designpattern.adapter.classadapter;

import com.turing.advancedse8.designpattern.adapter.Gateway;
import com.turing.advancedse8.designpattern.adapter.KBZGateway;

public class KBZGatewayAdapter extends KBZGateway implements Gateway{

	@Override
	public void process() {
		super.doKBZ();	
	}

}
