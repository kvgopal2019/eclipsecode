package com.oops;

public class Class4 
{
  static String value="abc";
  public static void changeValue(String a)
  {
	  String data=a.concat(value);
	  data=value;
	  
  }
  public static void main(String[] args) 
  {
	  value="java";
	  changeValue(value);
	  System.out.println(value);
	  
  }
}
