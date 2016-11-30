package com.checkpt.Stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<E>
{
	private List<E> stackArray ;
	//private Integer min= -9999999;
	
	public Stack(){
		this.stackArray = new ArrayList<E>();
	}
	
	public void push(E o){
		if(o == null){
			System.out.println("Cannot push a null object");
			return;
		}
		
		this.stackArray.add(0,  o);
		//this.min = this.min == -9999999 ? (Integer)o : Math.min(this.min, (Integer)o);
	}
	
	public E pop(){
		
		if(this.stackArray.size() == 0){
			System.out.println("Stack Empty, POP failed");
			return null;
		}
		
		return this.stackArray.remove(0);
	}
	
	public void print(){
		
		if(this.stackArray.size() == 0){
			System.out.println("Stack Empty");
		}
		
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < this.stackArray.size(); i++)
		{
			buffer.append(this.stackArray.get(i) + ",");
		}
		
		System.out.println(buffer.substring(0, buffer.lastIndexOf(",")));
	}

	public int size(){
		return this.stackArray.size();
	}
	
	public boolean isEmpty(){
		if(this.stackArray == null){
			return false;
		}
		
		return this.stackArray.size() == 0 ? true : false;
	}
/*	public int min(){
		return this.min;
	}*/
	
	public void sort()
	{
		
	}
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 2; i < 10; i++)
		{
			stack.push(i);
		}
		
		stack.pop();
		stack.pop();
				
		stack.print();
	//	System.out.println("" + stack.min());
	}
}
