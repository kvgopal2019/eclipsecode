package com.package1;

public class Methodoverloading 
{
	public final static void meth1()
	{
		System.out.println(10);
	}
	int meth1(int a)
	{
		System.out.println(20);
		return a;
	}
	private final static void meth1(int a, String s)
	{
		System.out.println(30);
	}
	static String meth1(String s, int a)
	{
		System.out.println(40);
		return s;
	}
	static protected void meth1(String s)
	{
		System.out.println(50);
	}
	char meth1(StringBuffer sb)
	{
		System.out.println(60);
		return sb.charAt(0);
	}
	void meth1(byte a)
	{
		System.out.println(70);
	}
	public static void main(String[] args) 
	{
		Methodoverloading mo=new Methodoverloading();
		System.out.println("implementing methodoverloading");
		mo.meth1();
		mo.meth1(0);
		mo.meth1(0, "venu");
		mo.meth1("venu",0);
		mo.meth1("vejhghghgf");
		mo.meth1(new StringBuffer("java"));
		mo.meth1((byte)10);
		System.out.println("-----------");
        main();
        main("java is awesome");
	}
	public static void main() 
	{
		System.out.println("1st main method");
	}
	public static void main(String s) 
	{
		System.out.println("2nd main method");
	}
}
