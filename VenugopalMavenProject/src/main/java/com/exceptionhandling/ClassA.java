package com.exceptionhandling;

import java.util.Scanner;

public class ClassA 
{  
	public void meth1()
	{   Scanner sc= new Scanner(System.in);
	    System.out.println(10);
		try 
		{
			System.out.println("try block executed");
			System.out.println("enter a number");
			System.out.println("====>"+20/sc.nextInt());
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block executed");
		}
		finally 
		{
			System.out.println("Finally block executed");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new ClassA().meth1();

	}

}
