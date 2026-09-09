package com.turing.advancedse8.concurrency;

import java.util.concurrent.locks.ReentrantLock;

class IncLockThread extends Thread
{
	Data data;
	ReentrantLock rLock;
	
	public IncLockThread(Data data, ReentrantLock rLock)
	{
		this.data = data;
		this.rLock = rLock;
	}
	public void run()
	{
		for(int i=0;i<100_000;i++)
		{
		
			this.rLock.lock();
			this.data.value ++;
			//this.rLock.unlock();
			
		}
	}
}
public class DeadLoackDemo {
	public static void main(String[]args)
	{
		Data data = new Data();
		ReentrantLock rLock = new ReentrantLock();
		IncLockThread t1 = new IncLockThread(data,rLock);
		IncLockThread t2 = new IncLockThread(data,rLock);
		IncLockThread t3 = new IncLockThread(data,rLock);
		
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
