package com.checkpt.String;

public class Reverse
{
	
	public static String reverseWords(String message){
/*		StringBuffer rev_mssg = new StringBuffer();
		String [] str_arr = message.split(" ");
		
		for (int i=str_arr.length; i>0 ; i--)
		{
			rev_mssg.append(" ").append(str_arr[i-1]);
		}
		rev_mssg.replace(0, 1, "");
		return rev_mssg.toString(); */
		
		char [] arr = message.toCharArray();
		
		for (int i = 0; i < arr.length/2; i++)
		{
			int head = i;
			int tail = arr.length -1;
			
		}
		message = new String("Test string has been changed");
		System.out.println(message);
		return message;
	}
	public static  void print(A a){
		System.out.println(a.name);
		a = new A("b");
		System.out.println(a.name);
		return;
	}
	public static void main(String[] args)
	{
		A mssg = new A("a");
		print(mssg);
		System.out.println(mssg.name);
	}

}

class A{
	public String name;
	A(String a){
		name = a;
	}
}