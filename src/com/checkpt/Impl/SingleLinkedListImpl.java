package com.checkpt.Impl;

import com.checkpt.LinkedList.SingleLinkedList;

public class SingleLinkedListImpl
{
	public static void main(String[] args)
	{
		SingleLinkedList list = new SingleLinkedList();
		list.addNode(10);
		list.addNode(20);
/*		list.deleteNode(20);
		list.deleteNode(10);*/
		list.addNode(45);
		list.addNode(23);
		System.out.println(list.getSize());
		list.printListFrom(0);	
		list.printListFrom(4);
		
	}

}
