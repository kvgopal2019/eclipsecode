
package com.oops;

public class Test11 implements InfA
{

	public String getName() {
		// TODO Auto-generated method stub
		return "Java is Awesome";
	}
   public static void main(String[] args)
   {
	   Test11 t= new Test11();
	   System.out.println(t.getName().length());
   }
}
