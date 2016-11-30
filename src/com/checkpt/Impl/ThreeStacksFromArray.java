package com.checkpt.Impl;

import java.util.ArrayList;
import java.util.List;

import com.checkpt.LinkedList.Node;

public class ThreeStacksFromArray
{
	Object [] arr = new Object[30];
	int [] heads = {-1,-1,-1};

		
	public static void main(String[] args)
	{
		//Book [] books = {new Book("book1"), new Book("book2"), new Book("book3")}; 
		Movie [] movies = {new Movie("movie1"), new Movie("movie2"), new Movie("movie3")}; 
		Mobile [] mobiles = {new Mobile("mobile1"), new Mobile("mobile2"), new Mobile("mobile3")}; 
		ThreeStacksFromArray arrayStacks = new ThreeStacksFromArray();
		//arrayStacks.push(books[0],0);
		arrayStacks.push(movies[1], 1);
		arrayStacks.push(movies[2], 1);
		arrayStacks.push(mobiles[2], 2);
		arrayStacks.print();
		

	}

	public void push(Object obj, int stackNum){
		
		if(heads[stackNum] == -1){
			
			heads[stackNum] = heads[stackNum] + 1 + stackNum*10; 
			arr[heads[stackNum]] = obj;
			return;
		}
		if(stackNum >= 0 && stackNum <=2)
		{
			heads[stackNum] = (heads[stackNum]  + 1 ) ;
			arr[heads[stackNum]] = obj;
			
		}
		else
		{
			return;
		}
	}
	
	public void print(){
		StringBuffer buffer = new StringBuffer();
		for (Object object : arr)
		{
			if(object instanceof Movie){
				buffer.append(((Movie)object ).name).append("->");
			}
			/*else if (object instanceof Book)
			{
				buffer.append(((Book)object ).name).append("->");
			}*/
			else if (object instanceof Mobile)
			{
				buffer.append(((Mobile)object ).name).append("->");
			}
			else
			{
				buffer.append("NULL ->");
			}
		}
		
		System.out.println(buffer.toString());
	}

	
}

class Movie{
	public String name;

	public Movie(String name)
	{
		super();
		this.name = name;
	}
}

class Mobile{
	public String name;

	public Mobile(String name)
	{
		super();
		this.name = name;
	}
}