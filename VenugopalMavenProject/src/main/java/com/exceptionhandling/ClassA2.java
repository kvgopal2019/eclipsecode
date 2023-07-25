package com.exceptionhandling;
import java.io.FileReader;
public class ClassA2 

{
  int avl_amount=1000;
  void meth1(int wt_amt)
  {
	  if(avl_amount<wt_amt)
	  {
		 throw new ArithmeticException("insufficint funds");
		 
	  }  
	  else
	  {
		  System.out.println("Transaction success");
		  System.out.println("Please take:"+wt_amt);
	  }
  }
  void fileoperation() throws Exception
  {
	  FileReader fr=new FileReader("G:\\java programs\\hi.txt");
	  System.out.println("hello world");
	  
  }
  public static void main(String[] args) throws Exception
  {
	  ClassA2 aobj= new ClassA2();
	//  aobj.meth1(600);
	  aobj.fileoperation();
  }
}
