package com.turing.advancedse8.concurrency;


class IncThread extends Thread
{
	Data data;
	public IncThread(Data data)
	{
		this.data = data;
	}
	public void run()
	{
		for(int i=0;i<100_000;i++)
		{
			synchronized(this.data)
			{
				this.data.value ++;
			}
			
		}
	}
}

public class MutualExclusion {
	public static void main(String[]args)
	{
		Data data = new Data();
		IncThread t1 = new IncThread(data);
		IncThread t2 = new IncThread(data);
		IncThread t3 = new IncThread(data);
		
		t1.start();
		t2.start();
		t3.start();
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
			
			System.out.println("Data "+data.value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
