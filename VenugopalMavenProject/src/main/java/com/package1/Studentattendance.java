package com.package1;

public class Studentattendance {
	
	
	static int numberofclasses=120;
	
	int attendance;
	int percentage;
	void attended(int attendedclasses)
	{
	
			 percentage = ((attendedclasses*100)/numberofclasses);
			 if(percentage>=75) 
			 {
			      System.out.println("percentage of classes attended:" + percentage);
			      System.out.println("numbe of classes attended:" + attendedclasses);
			      System.out.println("students are  allowed");  
			 }
		else {
		      System.out.println("percentage of classes attended:" + percentage);
		      System.out.println("numbe of classes attended:" + attendedclasses);
			  System.out.println("students are not allowed");
		     }
			
	}

	public static void main(String[] args) {
		
		System.out.println("number of classes:" + numberofclasses);
		Studentattendance sa= new Studentattendance();
		sa.attended(90);
		
	}

}
