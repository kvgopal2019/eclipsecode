package com.multithreading;

public class ClassA extends Thread
{ 
    public void run()
    {
    	for(int i=0; i<=4; i++)
    	{
    		System.out.println("run method():"+i);
    	}
    }
	public static void main(String[] args) 
	{
		ClassA aobj=new ClassA();
		Thread t =new Thread(aobj);
		t.start();
		

	}

}
