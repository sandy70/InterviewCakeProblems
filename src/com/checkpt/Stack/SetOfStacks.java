package com.checkpt.Stack;

import java.util.LinkedHashMap;
import java.util.Map;

public class SetOfStacks<E>
{
	public static final int MAX_SIZE = 2;
	private Map<String, Stack<E>> stackSet = new LinkedHashMap<String, Stack<E>>();
	
	public E pop()
	{
		Stack<E> stack = getCurrentStack();
		if(stack == null ){
			return null;
		}
		
		E e = stack.pop();
		
		if(e == null){
			stackSet.remove(stackSet.size() -1 + "");
			stack = getCurrentStack();
			e = stack.pop();
		}
		
		return e;
	}
	
	public void push(E o)
	{
		Stack<E> stack = getCurrentStack();
		
		if(stack == null){
			stack = new Stack<E>();
			stackSet.put("0", stack);
			
		}
		
		if(stack.size()>= MAX_SIZE )
		{
			stackSet.put("" + stackSet.size(), new Stack<E>());
			stack = stackSet.get("" + (stackSet.size() -1));
		}
		
		stack.push(o);
	}
	
	private Stack<E> getCurrentStack(){
		int size = stackSet.size();
		Stack <E> stack = null;

		if(size != 0)
		{
			stack = stackSet.get("" + (stackSet.size()-1 ));
			
		}
				
				
		return stack;
	}
	
	public E popAt(int index){
		
		if(index <0  || index > stackSet.size() -1 || stackSet.size() == 0){
			return null;
		}
		
		Stack <E> stack = stackSet.get("" + index);
		E e = stack.pop();
		if(stack.size() == 0){
			stackSet.remove(index);
		}
		return e;
	}
	
	public static void main(String[] args)
	{
		SetOfStacks<Integer> stacks = new SetOfStacks<Integer>();
		
		for (int i = 0; i < 6; i++)
		{
			stacks.push(i);
		}
		
		stacks.popAt(1);
		stacks.popAt(0);
		
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 4; i++)
		{
			buffer.append("" + stacks.pop()).append(",") ;
		}
		
		System.out.println("POPED = " + buffer.toString());
	}
}
