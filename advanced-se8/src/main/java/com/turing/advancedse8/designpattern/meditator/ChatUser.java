package com.turing.advancedse8.designpattern.meditator;

public class ChatUser implements User{
	
	ChatMeditator meditator;
	String name;
	
	public ChatUser(ChatMeditator meditator,String name)
	{
		this.meditator = meditator;
		this.name = name;
		this.meditator.add(this);
	}
	
	@Override
	public void receive(String message) {
		System.out.println("ChatUser "+this.name+" received "+message);
		
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("User "+this.name+" send "+message);
		this.meditator.sendMessage(this, message);
	}

}
