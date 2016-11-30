package com.checkpt.Queue;

import java.util.ArrayList;
import java.util.List;

public class LinearQueue
{
	private List<Integer> queue ;
	
	
	public LinearQueue(){
		this.queue = new ArrayList<Integer>();
	}

	public void enqueue(int n){
		
		this.queue.add(n);
	}
	
	public Integer dequeue(){
		
		if(this.queue.size() == 0){
			System.out.println("Queue empty");
			return null;
		}
		
		return  this.queue.remove(0);
	}
	
	public int size(){
		return this.queue.size();
	}
	
	public void print(){
		
		if(this.queue.size() == 0){
			System.out.println("Size of queue is 0");
			return;
		}
		
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < this.queue.size(); i++)
		{
			buffer.append(this.queue.get(i) + ",");
		}
		
		System.out.println(buffer.substring(0, buffer.lastIndexOf(",")));
	}
	
}
