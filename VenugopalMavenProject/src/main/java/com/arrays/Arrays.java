package com.arrays;

public class Arrays
{
  void meth1(int []arr)
  { 
	 for(int i=0;i<arr.length;i++)
     {
	  arr[i]=i*arr.length-3;
     }
	  System.out.println(arr[2]);
  }
	public static void main(String[] args) 
	 {  
		new Arrays().meth1(new int[new int[6].length]);
		

	}

}
