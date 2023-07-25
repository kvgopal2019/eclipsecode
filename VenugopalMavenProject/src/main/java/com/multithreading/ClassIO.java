package com.multithreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassIO 
{
  void fileoperations() throws Exception
  {
	  System.out.println("reading the data from file");
	  FileInputStream fis=new FileInputStream("G:\\java programs\\file1.txt");
	  System.out.println("Connection created");
	  int x;  
	  //int x= fis.read();
	  
	  while((x=fis.read())!=-1)
	  { 
		  System.out.println((char)x);
	  }
	  
		 // System.out.println(x);
	        System.out.println();
	      
		  System.out.println("data retrived");
		  fis.close();
 }
  
	public static void main(String[] args) throws Exception 
	{
		ClassIO aobj=new ClassIO();
		aobj.fileoperations();

	}

}
