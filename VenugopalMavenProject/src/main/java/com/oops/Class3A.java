package com.oops;

public class Class3A 
{

	public static void main(String[] args) 
	{
		A a= new A();
		C c= new C();
		c.method2();
		a=c;
		//a.method3();  //compile time error
		a.method1();

	}

}

