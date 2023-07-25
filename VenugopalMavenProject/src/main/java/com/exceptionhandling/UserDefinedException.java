package com.exceptionhandling;

import java.util.Scanner;

public class UserDefinedException 
{
   static double current_balance=179;
   
   public static void main(String[] args )
   {   Scanner sc= new Scanner(System.in);
	   System.out.println("enter amount you wish to withdraw");
	  // Scanner sc= new Scanner(System.in);
	   int n= sc.nextInt();
	   
	   try
	   {
		   if(current_balance<n)
		   {
			   throw new MinimumAccountBalance("insufficient funds!your current balance is :"+current_balance);
		   }
		   else
		   {
			   System.out.println("please take money:"+n);
		   }
		   
	   }
		   catch(MinimumAccountBalance e)
		   {
			   e.printStackTrace();
			   sc.close();
		   }
	}
 }

