package com.package1;

public class ClassB {

	void meth1()
	{
		int a=10;
				int b=20;
				//a=a+b-(b=a);
				System.out.println("a="+a+ ", b="+b);
	}
	
	public static void main(String[] args)
	{
		new ClassB().meth1();
		
	}
	
}
