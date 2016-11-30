package com.checkpt.String;

import java.util.Scanner;

import com.checkpt.Stack.Stack;

public class BracketBalancer
{
	public static final char NORMAL_OPEN = '(';
	public static final int FLOWER_OPEN = '{';
	public static final int SQUARE_OPEN = '[';
	
	public static final char NORMAL_CLOSE = ')';
	public static final int FLOWER_CLOSE = '}';
	public static final int SQUARE_CLOSE = ']';
	
	
	public boolean isBalanced(String str)
	{
		boolean isBalanced = false;
		Stack<Character> stack = new Stack<Character>();
		
		char [] chars = str.toCharArray();

		for (int i = 0; i < chars.length; i++)
		{
			if(( chars[i]) == (NORMAL_OPEN) || (chars[i]) == (FLOWER_OPEN) ||
					(chars[i]) == (SQUARE_OPEN) ){
				stack.push(chars[i]);
			}
			else if (chars[i]==(NORMAL_CLOSE) || chars[i]==(FLOWER_CLOSE) ||
					chars[i] == (SQUARE_CLOSE))
			{
				Character popedChar = stack.pop();
				
				if(popedChar!=null && !popedChar.equals(getImage(chars[i]))){
					return false;
				}
			}
			else
			{
				return false;
			}
				
		}
		
		isBalanced = stack.isEmpty() ? true : false;
		return isBalanced;
	}

	public char getImage(char c)
	{
		Character mirror;
		if(c == NORMAL_CLOSE){
			mirror = NORMAL_OPEN;
		}
		else if (c == FLOWER_CLOSE)
		{
			mirror= FLOWER_OPEN;
		}
		else if (c == SQUARE_CLOSE)
		{
			mirror = SQUARE_OPEN;
		}
		else
		{
			mirror = null;
		}
			
		return mirror;
	}
	public static void main(String[] args)
	{
		BracketBalancer balancer = new BracketBalancer();
		String braces = "{{[(])}}";
		System.out.println(balancer.isBalanced(braces));
		Scanner scanner = new Scanner("Enter String" + System.in);
		System.out.println(scanner.next());
		System.out.println();
	}
}
