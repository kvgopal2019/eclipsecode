package com.package1;

public class ClassD
{
	void meth1()  //calling from main()
	{
		System.out.println(10);
		System.out.println(64);
		System.out.println("end");
		
	}

	int meth2(int a, int b, int c)
	{
		System.out.println(a);
		ClassD bobj=new ClassD();
		String S=bobj.meth5(100,"java is awesome");
		return a-b;
		
		
	}
	String meth3(String s, int b, int d)
	{
		
		System.out.println(b+d);
		return s;
	}
	
	int meth4(int C,int K)   //calling from main()
	{
		System.out.println(K);
		ClassD bobj=new ClassD();
		int result =bobj.meth2(50, 50, 50);
		System.out.println(result);
		return K+10;
	}
	
	String meth5(int a,String L)   //calling from meth2
	{
		System.out.println(a+a);
		ClassD bobj=new ClassD();
		String S=bobj.meth3("hi", 15, 10);
		System.out.println(S);
		return L;
	}
	public static void main(String[] args)
	{
		ClassD bobj=new ClassD();
		System.out.println("start");
		int result=bobj.meth4(20,10);
		System.out.println(result);
		bobj.meth1();
		
	}
}
