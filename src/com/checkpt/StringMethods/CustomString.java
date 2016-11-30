package com.checkpt.StringMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomString 
{
	public String str;
	
	public CustomString()
	{
		
	}
	public CustomString(String s)
	{
		this.str = s;
	}
	
	public List<String> getAllSubStrings()
	{
		List<String> subStrings = null;
		if(str == null || str.length() ==0){
			return null;
		}
		else
		{
			subStrings = new ArrayList<String>();
		}
		
		List<String> newSubStrings = new ArrayList<String>();
	
		for (int i = 0; i < str.length(); i++)
		{
			for (String string : subStrings)
			{
				newSubStrings.add(string+str.charAt(i));
			}
			
			newSubStrings.add("" + str.charAt(i));
			
			for (String string : newSubStrings)
			{
				subStrings.add(string);
			}
			
			newSubStrings.clear();
		}
		
				
		return subStrings;
	}
	
	public List<String> getSubs(){
		List<String> subStrings = new ArrayList<String>();
		
		if(str == null || str.length() == 0){
			return subStrings;
		}
		
		if(str.length() == 1){
			subStrings.add(str);
			return subStrings;
		}
		
		String head = str.substring(0, 1);
		String tail = str.substring(1);
		subStrings.add(head);
		
		List<String> tailSubs = getSubs();
				
		for (String sub : tailSubs)
		{
			subStrings.add(sub);
			subStrings.add(head+sub);
		}
		
		return subStrings;
	}
	
		
	public boolean hasNums()
	{
		boolean hasNums = false;
				
		char [] chars = str.toCharArray();
		
		for (char c : chars)
		{
			try
			{
				int i = Integer.valueOf(""+c);
				hasNums = true;
				break;
								
			} catch (NumberFormatException e)
			{
				
				hasNums = false;
			}
		}
		
		return hasNums;
	}
	public boolean hasCaps()
	{
		char [] chars = str.toCharArray();
		boolean isCaps = false;
		
		for (char c : chars)
		{
			int ascii = (int) c ;
			
			  isCaps =   ascii >=65 && ascii <=97 ? true : false;
			 
			 if(isCaps == true){
				break;
			 }
		}
		
		return isCaps;
	}
	
	
	public static void main(String[] args)
	{
		CustomString str = new CustomString("Asdf23");
		List<String> subStrs= str.getAllSubStrings();
		//List<String> subStrs1 = str.getSubs();
		StringBuffer buffer = new StringBuffer();
		
		if(subStrs != null ){
			for (String string : subStrs)
			{
				buffer.append(string).append(",");
			}
		}
		System.out.println(buffer.toString().length());
		System.out.println("SubString array = {" + buffer.toString() + "}");
		
		/*StringBuffer buffer1 = new StringBuffer();
		if(subStrs1 != null ){
			for (String string : subStrs1)
			{
				buffer1.append(string).append(",");
			}
		}
		
	
		System.out.println("SubString array1 = {" + buffer1.toString() + "}");
		*/
		
		
	}
}
