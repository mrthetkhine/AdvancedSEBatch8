package com.turing.advancedse8.designpattern.proxy;

public class CommandExecutorProxy implements CommandExecutor{

	boolean isAdmin= false;
	CommandExecutor executor = new CommandExecutorImpl();
	
	public CommandExecutorProxy(String username,String password)
	{
		if("admin".equals(username) && "admin".equals(password))
		{
			isAdmin = true;
		}
	}
	
	@Override
	public void run(String command) {
		if(this.isAdmin)
		{
			this.executor.run(command);
		}
		else
		{
			if(command.startsWith("rm"))
			{
				throw new RuntimeException("Invalid access right");
			}
			else
			{
				this.executor.run(command);
			}
		}
			
		
	}

}
