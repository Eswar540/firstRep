/*
Lab Session Number			:06
Type of Lab					:In Lab
Problem No.					:03
Author						:Eswar
Date						:
Program Name				:Practice24.java
Topics covered				:Abstract classes,Interfaces
*/
import java.util.*;
interface EmployeDetails
{
	public abstract void readData();
	public abstract void display();
}
class UserSelection implements EmployeDetails
{
	String Employee_name;
	String Employee_id;
	double Employee_Salary;
	public void readData()
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data");
		String data=sc.nextLine();
		String temp[]=data.split(",");
		Employee_name=temp[0];
		Employee_id=temp[1];
		int s=Integer.parseInt(temp[2]);
		Employee_Salary=(double)s;
		}
		catch(Exception e)
		{
			System.out.println("Invalid nubmer of arguments");
			System.exit(0);
		}
	}
	public void display()
	{
		System.out.println("Employee name" +" "+ Employee_name);
		System.out.println("Employee id" +" " + Employee_id);
		System.out.println("Emplyee salary"+ " "+Employee_Salary);
	}
}
public class Practice24
{
	public static void main(String args[])
	{
		
	UserSelection u=new UserSelection();
	u.readData();
	u.display();
	}
}

