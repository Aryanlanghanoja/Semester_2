/*  Write a program by creating an 'Employee' class having the following methods and print
the final salary. 
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as
parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per
day is more than 6 hours. */

import java.util.*;

class Employee
{
	int Salary ;
	int No_Of_Hours ;

	public void getInfo(int Salary,int No_Of_Hours)
	{
		this.Salary = Salary ;
		this.No_Of_Hours = No_Of_Hours ;
	}

	public int AddSal(int Salary)
	{
		if(Salary < 500)
		{
			Salary = Salary + 10 ;
		}

		return Salary ;
	}

	public int AddWork(int Salary, int No_Of_Hours)
	{
		if(No_Of_Hours >= 6)
		{
			Salary = Salary + 5 ;
		}
		
		return Salary ;
	}
}

public class Programm_4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in) ;
		Employee E = new Employee();
		int Salary , No_Of_Hours ;

		System.out.print("Enter The Salary Of An Employee:-");
		Salary = sc.nextInt();

		System.out.print("Enter The No of Hours Of Daily Work:-");
		No_Of_Hours = sc.nextInt();

		getInfo(Salary,No_Of_Hours);

		if(Salary < 500 && No_Of_Hours > 6)
		{
			Salary = E.AddSal(Salary) + E.AddWork(Salary) - Salary ;
		}
		
		else if (No_Of_Hours > 6)
		{
			Salary = E.AddWork(Salary);
		}

 		else if(Salary < 500)
		{
			Salary = E.AddSal(Salary);
		}

		System.out.print("The Salary Of Employee Is " + Salary);
		
	}
}
