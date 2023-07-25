package com.package1;

public class Methodoverloading2 
{ 
	void empdetails(String dept)

	{    empdetails(29000, "venu");
	     //this.empdetails(29000, "venu");
	 
	      System.out.println("department:"+dept);
		 //empdetails(29000, "venu");
	}
  void empdetails(int sal, String name)
   {
	 System.out.println("employee details");
	 System.out.println("salary:"+sal);
	 System.out.println("name:"+name); 
   }
  public static void main(String[] args)
  {
	  Methodoverloading2 mo= new Methodoverloading2();
	 // mo.empdetails(29000, "venu");
	  mo.empdetails("hghgfgcb");
	  
  }
}