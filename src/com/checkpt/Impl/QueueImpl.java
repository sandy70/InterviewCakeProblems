package com.checkpt.Impl;

import com.checkpt.Queue.LinearQueue;

public class QueueImpl
{

	public static void main(String[] args)
	{
		LinearQueue queue  = new LinearQueue();
		
		for (int i = 0; i < 20; i++)
		{
			queue.enqueue(i);
		}
		
		queue.dequeue();
		queue.print();
		
	}
}
