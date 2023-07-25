package com.oops;
class Super1 
{
	 int value=0;
	 
	 Super1()
	 {
		 addValue();
	 }
	 void addValue()
	 {
		 value+=10;
	 }
	 int getValue()
	 {
		 return value;
	 }
}

class Sub1 extends Super1
{
	  Sub1()
	  {
		  addValue();
	  }
	  void addValue()
	  {
		  value +=20;
	  }

}


public class Class13 
{

	public static void main(String[] args) 
	{
		Super1 b = new Sub1();
		System.out.println(b.getValue());
		
	}

}
