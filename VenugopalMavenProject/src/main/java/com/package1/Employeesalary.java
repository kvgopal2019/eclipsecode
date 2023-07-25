package com.package1;

public class Employeesalary {
	
	int bonusamount;
	int yearofservice=6;
	int updatedsalary;
	
	void updatedsalary(int salary,int bonus)
	{
		if(yearofservice>=5)
		{ 	
		bonusamount = ((salary*bonus)/100);
		updatedsalary = bonusamount+salary;
		System.out.println("employee bonus amount:" + bonusamount);
		System.out.println("updated salary:" + updatedsalary);
		}
		else
		{
		 System.out.println("year of service less than 5 years");	
		}
	}

	public static void main(String[] args)
	{
		Employeesalary es = new Employeesalary();
		es.updatedsalary(60000, 5);

	}

}
