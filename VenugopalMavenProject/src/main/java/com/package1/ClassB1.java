package com.package1;

public class ClassB1 extends ClassA1
{
	void meth2()
	{    System.out.println("class B method");
		super.meth1();
		this.meth3();
	}
	void meth3()
	{
		System.out.println("java is awesome");
		
	}
	ClassB1()
	{
		super(500);
		this.meth2();
		//this("java";)
		System.out.println("class B default constructor");
	}
	ClassB1(String s)
	{
		super();
		System.out.println("class B parameterized constructor:"+s);
	}

	public static void main(String[] args) 
	{
		ClassB1 bobj=new ClassB1();
		bobj.meth2();

	  
	}

}
