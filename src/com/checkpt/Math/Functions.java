package com.checkpt.Math;

import java.util.ArrayList;

public class Functions
{
	public static ArrayList<Integer> powerSet(int [] set)
	{
		ArrayList<Integer> powerset = new ArrayList<Integer>();
		
		if(set == null || set.length == 0){
			return powerset;
		}
		
		if(set.length == 1){
			powerset.add(set[0]);
			return powerset;
		}
		
		int head = set[0];
		powerset.add(head);
		int [] tail  = new int [set.length -1];
		for (int i=1; i < set.length ; i++)
		{
			tail[i-1] = set[i]; 
		}
		
		ArrayList<Integer> tailPowSet = powerSet(tail);
		
		for (Integer integer : tailPowSet)
		{
			powerset.add(integer);
			powerset.add(head + integer);
		}
		
		return powerset;
	}
	
	public static void main(String[] args)
	{
		int [] set = {2,3,4};
		ArrayList<Integer> powerset = Functions.powerSet(set);
		
		if(powerset.size() == 0){
			System.out.println("empty set ");
		}
		else
		{
			for (Integer integer : powerset)
			{
				System.out.print(integer+ ",");
			}
		}
		
	}

}
