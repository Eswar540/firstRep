/**************** 
Lab session Number	: 09
Type of Lab			: Post Lab 
Problem number		: 01
Programmer			: Eswar
Date				: 27/01/2021
Program Name		: Price.java
Topics Covered		: Fundamentals of IO streams,
					  IO stream classes and methods.
****************/
//import required packages
import java.util.*;
import java.io.*;
//define a class
public class Price
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			FileWriter f=new FileWriter("purchase.txt",true);
			System.out.println("Enter name of the item");
			String s=sc.nextLine();
			System.out.println("Enter cost of each item:");
			int m=sc.nextInt();
			System.out.println("Enter number of items:");
			int p=sc.nextInt();
			String a=String.valueOf(m);
			String b=String.valueOf(p);
			String r=String.valueOf(m*p);
			f.write("\nitem name:");
			f.write(s);
			f.write("\n");
			f.write("Price of item:");
			f.write(a);
			f.write("\n");
			f.write("Number of items:");
			f.write(b);
			f.write("\n");
			f.write("The expenditure is:");
			f.write(r);
			f.write("\n");
			f.write("-------------");
			System.out.println("The expenditure is:"+m*p);
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
