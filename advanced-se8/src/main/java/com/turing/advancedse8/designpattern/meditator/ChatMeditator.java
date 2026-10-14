package com.turing.advancedse8.designpattern.meditator;

import java.util.ArrayList;
import java.util.List;

public class ChatMeditator {
	List<User> users = new ArrayList<>();
	
	void add(User user)
	{
		this.users.add(user);
	}
	void sendMessage(User sender,String message)
	{
		for(User user:users)
		{
			if(user!=sender)
			{
				user.receive(message);
			}
		}
	}
}
