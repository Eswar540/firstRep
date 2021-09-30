//creating and accessing the packages
/*
Lab Session Number			:07
Type of Lab				:In Lab
Problem No.				:
Author					:Eswar
Date					:20/1/2021
Program Name				:No_Of_Placements.java
Topics covered				:creating,accessing ,adding classess, benifits,types of package,setting classpath
*/
//creating a package syntax
package Placements;
//Accessing a classes inside a package
import java.util.Scanner;
public class No_Of_Placements

{
	public String yearPlacements;
	public int year;
	public int placements;

	public void readData()
	{
		try
		{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter year and placements");
		yearPlacements=sc.nextLine();

		String temp1=yearPlacements.substring(0,4);
		year=Integer.parseInt(temp1);

		String temp2=yearPlacements.substring(5);
		placements=Integer.parseInt(temp2);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}

	}
}

	




