package com.turing.advancedse8.designpattern.meditator;

public class Demo {
	public static void main(String[]args)
	{
		ChatMeditator meditator = new ChatMeditator();
		ChatUser user1 = new ChatUser(meditator,"user1");
		ChatUser user2 = new ChatUser(meditator,"user2");
		ChatUser user3 = new ChatUser(meditator,"user3");
		
		user1.sendMessage("Hello");
		user2.sendMessage("Hi");
	}
}
