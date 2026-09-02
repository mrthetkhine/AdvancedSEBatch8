package com.turing.advancedse8.tdd.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BracketChecker {

	List<Character> openingChars = new ArrayList<>();
	List<Character> closingChars = new ArrayList<>();
	
	BracketChecker()
	{
		this.openingChars.add('(');
		this.closingChars.add(')');
		
		this.openingChars.add('[');
		this.closingChars.add(']');
	}

	Stack<Character> stack = new Stack<>();
	
	boolean isOpening(Character ch)
	{
		return this.openingChars.contains(ch);
	}
	boolean isClosing(Character ch)
	{
		return this.closingChars.contains(ch);
	}
	//(,) ->true
	boolean isBalance(Character opening,Character closing)
	{
		int openingIndex = this.openingChars.indexOf(opening);
		int closingIndex = this.closingChars.indexOf(closing);
		
		return openingIndex == closingIndex;
	}
	public boolean check(String input) {
		
		for(int i=0;i< input.length();i++)
		{
			char ch = input.charAt(i);
			
			if(isOpening(ch))
			{
				stack.push(ch);
			}
			else if(isClosing(ch))
			{
				/*To check case like there is closing char
				 * but no opening pushed like ][
				 * 
				 * */
				if(stack.isEmpty())
				{
					return false;
				}
				else
				{
					/*
					 * if poped character is '('
					 * closing should be ')'
					 * */
					Character openingChar = stack.pop();
					boolean isBalance = this.isBalance(openingChar, ch);
					if(!isBalance)
					{
						return false;
					}
					
				}
				
			}
		}
		
		return stack.isEmpty();
	}

}
