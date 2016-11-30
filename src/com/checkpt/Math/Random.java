package com.checkpt.Math;

public class Random
{
	public Random(){
		
	}

	public static int get_random(int floor, int ceiling) {
		int rand_num = floor + (int)(Math.random()*(ceiling - floor +1));
		return rand_num;
	}
	
	public static int [] shuffle_arr(int [] arr){
		
		if(arr == null || arr.length <=0){
			System.out.println("Invalid array");
			return null;
		}
		
		if(arr.length == 1){
			System.out.println("Can't shuffle array of size 1");
			return arr;
		}
		
		int i = arr.length -1;
		
		while(i>0){
			int rand_pick = Random.get_random(0, i);
			Random.swap(arr,rand_pick, i);
			i--;
		}
		return arr;
		}
	
	private static void swap(int[]arr, int i, int j){
		int x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
	}
}
