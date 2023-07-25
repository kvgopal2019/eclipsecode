package com.exceptionhandling;

public class ClassA1 
{ 
	void meth1()
	{ 
	String s=null;
	 try
	 {
		 System.out.println("try block xecuted");
		 System.out.println(s.length());
		 
	 }
	 catch(NullPointerException npe)
	 {
		 System.out.println("catch block executed");
		 System.out.println("===>"+npe.getMessage());
		 System.out.println("===>"+npe.toString());
		 npe.printStackTrace();
	 }
	 finally
	 {
		 System.out.println("Finally block executed");
	 }
	 System.out.println("java is awesome");
  }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new ClassA1().meth1();

	}

}
