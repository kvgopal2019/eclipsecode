package com.multithreading;

public class ClassA1 implements Runnable 
{
	
	  public void run() 
	  { 
		  for(int i=0; i<=3; i++)
		  {
	      System.out.println("run method():"+i); 
	      } 
	  }
	 
	public static void main(String[] args) {
		ClassA1 aobj = new ClassA1();
		Thread t = new Thread(aobj);
		t.start();

	}

}