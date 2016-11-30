package com.checkpt.Impl;

public class InShuffleGameImp
{
	
	
	public static void main(String[] args)
	{
		int floor = 5;
		int ceiling = 10;
		int [] count_array = new int [ceiling - floor +1];
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		com.checkpt.Math.Random.shuffle_arr(arr);
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+ ",");
		}
		
		
		for (int i = 0; i < 10000000; i++)
		{
			int rand_num = com.checkpt.Math.Random.get_random(floor, ceiling);
			count_array[rand_num- floor] =count_array[rand_num - floor] + 1;
			
		}
		
		for (int i : count_array)
		{
			System.out.println((double)i/10000000);	
		}
		
		
	}

}
