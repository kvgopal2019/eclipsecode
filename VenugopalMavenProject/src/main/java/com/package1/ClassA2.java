package com.package1;

public class ClassA2 
{
	int meth1()
	{
	  System.out.println(110);
	  System.out.println(59);
	  return this.meth2(); 
	}
   int meth2()
   {
	   System.out.println(75);
		System.out.println(96);
		return this.meth3();	    
   }
   int meth3()
   {
	   System.out.println(74);
		System.out.println(92);
		return 74-92;   
   }
   ClassA2()
   {
	// this(52);
	 this.meth1();
	 System.out.println(85);	
   }
   ClassA2(int a)
   {
	   System.out.println(a+7);
   }
}
