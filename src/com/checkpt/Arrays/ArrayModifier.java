package com.checkpt.Arrays;

import java.util.StringJoiner;

public class ArrayModifier
{

	public ArrayModifier()
	{

	}

	public int[] leftShift(int[] arr, int shiftPosition)
	{

		for (int i = 0; i < shiftPosition; i++)
		{
			int firstVal = arr[0];

			for (int j = 0; j < arr.length - 1; j++)
			{
				arr[j] = arr[j+1];
			}

			arr[arr.length - 1] = firstVal;
			
		}

		return arr;

	}

	public int [] rightShift(int [] arr , int shiftPosition){
		for (int i = 0; i < shiftPosition; i++)
		{
			int lastVal = arr[arr.length -1];

			for (int j = arr.length-1; j > 0; j--)
			{
				arr[j] = arr[j-1];
			}

			arr[0] = lastVal;
			
		}

		return arr;
	}
	public static void main(String[] args)
	{
		int [] arr = {1,2,3,4,5};
		ArrayModifier modifier = new ArrayModifier();
		int [] a = modifier.leftShift(arr, 2);
		
		StringJoiner joiner = new StringJoiner(",");
	
		for (int i : a)
		{
			joiner.add(""+i);
		}
		

		System.out.println("LeftShift->" + joiner.toString());
		
		StringJoiner joiner2 = new StringJoiner(",");
		int [] b = modifier.rightShift(arr, 2);
		for (int i : b)
		{
			joiner2.add(""+i);
		}
		System.out.println(joiner2.toString());
	}
}
