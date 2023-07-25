package com.package1;

public class ClassA {
	int meth1(int a, int b, char c)
	{
		System.out.println(c);
		int result= new ClassA().meth2("java",100,'y');
		return 10+a+result;
	}
	
	int meth2(String s,int a, char c)
	{
		System.out.println(5);
		return 20;
		}
	
	
	public static void main(String[] args)
	{
		//
		System.out.println("hi");
		System.out.println("vvnvnvnvnbv");
		System.out.println(new ClassA().meth1(10, 20, 'x'));
	}
	
}
