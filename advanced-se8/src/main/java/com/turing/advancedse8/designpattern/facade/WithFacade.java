package com.turing.advancedse8.designpattern.facade;

class Computer
{
	Cpu cpu = new Cpu();
	Memory memory = new Memory();
	HardDisk hd = new HardDisk();
	
	void start()
	{
		hd.loadBootSector();
		memory.loadIntoMemory();
		cpu.execute();
	}
}
public class WithFacade {
	public static void main(String[]args)
	{
		Computer com = new Computer();
		com.start();
	}
}
