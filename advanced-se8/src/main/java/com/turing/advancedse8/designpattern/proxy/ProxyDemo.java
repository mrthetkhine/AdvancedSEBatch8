package com.turing.advancedse8.designpattern.proxy;

public class ProxyDemo {
	public static void main(String[]args)
	{
		CommandExecutorProxy proxy = new CommandExecutorProxy("admin1","admin");
		proxy.run("rm --");
	}
}
