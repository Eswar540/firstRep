import java.util.*;
/*
Lab session number			:02
Type of lab					:Post lab
Problem number				:02
Author						:Eswar
Date						:
Program name				:EmployeTest.java
topics covered				:class fundamentals,object fundamentals.
*/
class Employee
{
	String firstName;
	String lastName;
	double monthlySalary;
	
	public Employee()
	{
		firstName="unknown";
		lastName="unknown";
		monthlySalary=0.0;
	}
	
	public void set(String firstName,String lastName,double monthlySalary)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		if(monthlySalary<0)
		{
			this.monthlySalary=0.0;
		}
		else
		{
		this.monthlySalary=monthlySalary;
		}
	}
	
	public void get()
	{
		System.out.println("Firstname" + firstName);
		System.out.println("Lastname"+lastName);
		System.out.println("Yearly salary"+(12*monthlySalary));
		System.out.println("Yearly salary after 10 perc raise"+(12*monthlySalary+(10.0/100)*12*monthlySalary));
	}
}
public class EmployeTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first name of employee1");
		String fname1=sc.nextLine();

		System.out.println("Enter last name of employee1");
		String lname1=sc.nextLine();
		
		System.out.println("Enter monthly salary of employe1");
		double mon1=sc.nextDouble();
		
		System.out.println("Enter first name of employee2");
		String fname2=sc.nextLine();

		System.out.println("Enter last name of employee2");
		String lname2=sc.nextLine();
		
		System.out.println("Enter monthly salary of employe2");
		double mon2=sc.nextDouble();
		
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.set(fname1,lname1,mon1);
		e2.set(fname2,lname2,mon2);
		e1.get();
		e2.get();
	}
}
		
		