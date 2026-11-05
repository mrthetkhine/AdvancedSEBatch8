package com.turing.advancedse8.unittest.pattern;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import org.junit.jupiter.api.Test;

public class CrashTestDummy {

	@Test
	public void testCrash()
	{
		try
		{
			File file = new FullFile("demo");
			file.createNewFile();
			fail();
		}
		catch(IOException e)
		{
			
		}
	}
}
