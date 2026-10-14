package com.turing.advancedse8.designpattern.state;

public class RegDemo {
	//0+1+
	static boolean isValid(String str)
	{
		int state = 0;
		
		for(int i=0;i< str.length();i++)
		{
			char ch = str.charAt(i);
			switch(state)
			{
				case 0:
					if(ch=='0')
					{
						state = 1;
					}
					else
					{
						return false;
					}
				case 1:
					if(ch=='0')
					{
						state= 1;
					}
					else if(ch=='1')
					{
						state = 2;
					}
					else
					{
						return false;
					}
				break;
				case 2:
					if(ch=='1')
					{
						state = 2;
					}
					else
					{
						return false;
					}
				break;
			}
		}
		return state==2;
		
	}
	public static void main(String[]args)
	{
		System.out.println("01 isValid "+isValid("01"));
		System.out.println("0 isValid "+isValid("0"));
		System.out.println("0001 isValid "+isValid("0001"));
		System.out.println("01111 isValid "+isValid("01111"));
		System.out.println("000 isValid "+isValid("000"));
		System.out.println("1111 isValid "+isValid("1111"));
	}
}
