package com.multithreading;
import java.lang.*;

public class ClassA2 implements Runnable 
{  
	//@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for(int i=1;i<=4;i++)
		{
			System.out.println(name+"("+priority+")"+"has executed run():"+i);
		}
	}

	public static void main(String[] args) 
	{
		ClassA2 aobj= new ClassA2();
		Thread t1   = new Thread(aobj);
		Thread t2   = new Thread(aobj);
		
		t1.setName("first thrd");
		t2.setName("second thrd");
		
		t1.setPriority(11);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
	}

}
