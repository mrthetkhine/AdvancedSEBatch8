package com.turing.advancedse8.unittest.pattern;

import java.io.File;
import java.io.IOException;

public class FullFile extends File{
	String name;
	private static final long serialVersionUID = 1L;
	public FullFile(String name) {
		super(name);
		this.name= name;
	}

	@Override
	public boolean createNewFile()throws IOException
	{
		if(name.equals("demo"))
		{
			throw new IOException("IO Exception");
		}
		return true;
	}

}
