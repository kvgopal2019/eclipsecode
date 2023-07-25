package com.package1;

public class ClassB2 extends ClassA2
{
	void display()
	{
	System.out.println("hi");
	super.meth3();
	}
	static int show(int a)
	{
		System.out.println(a+a);
		return a+a++;
	}
	ClassB2()
	{  this(show(60));
	   //for(int i=1;; i++)
	   {
		   super.meth3();
		  // break;
	   }  
	   System.out.println("hi");
	   System.out.println(show(55));			
	}
    ClassB2(int a)
    {
    	System.out.println("==>"+(a++ +show(50)));	
    }
    
	public static void main(String[] args) 
	{
		ClassB2 bobj=new ClassB2();
		bobj.display();
	}

}
