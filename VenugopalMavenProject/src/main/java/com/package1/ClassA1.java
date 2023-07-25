package com.package1;

public class ClassA1 
{
	void meth1()
	{
		System.out.println("class A method");
	}
  ClassA1()
  {
	  System.out.println("class A default constructor");
	  this.meth1();
  }
  ClassA1(int a)
  {
	  this();
	  System.out.println("clss A parameterized constructor"+a);
  }
}
