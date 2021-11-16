//A java program to demonistrate the concepts of classes and objects
/***********
Lab session number		:02
type of lab				:post lab
Problem no				:01
Author					:Eswar
Date					:
Program name			:Practice30.java
Topics covered			:class fundamentals,object fundamentals
*************/
// Import packages
import java.lang.*;
import java.util.Scanner;
class Family
{
	// Creating the instances variables.
	double income;
	int size;
	// Constructor
	Family(double income,int size)
	{
		this.income=income;
		this.size=size;
	}
	// Method to check the Poverty.
	boolean isPoor(double hc,double fc)
	{
	if((hc+fc*size)>(income/2))
	return true;
	else
	return false;
	}
	// Displaying the Output
	String tostring(double hc,double fc)
	{
		String str;
		if(isPoor(hc,fc))
		{
			str="The Family is Poor Family";
			return str;
		}
		else
		{
			str="The Family is Middle class Family";
			return str;
		}
	}
}
public class Practice30 
{
	public static void main(String args[])
	{
		// Creating the local variables.
		int k,i,size;
		double income,hc,fc;
		String out;
		// Creating the scanner object
		Scanner keyboard=new Scanner(System.in);
		System.out.println("How many families details you want to store:");
		k=keyboard.nextInt();
		Family fm[]=new Family[k];
		for(i=0;i<k;i++)
		{
			System.out.println("Enter income and size of family no."+(i+1));
			income=keyboard.nextDouble();
			size=keyboard.nextInt();
			fm[i]=new Family(income,size);
		}
		for(i=0;i<k;i++)
		{
			System.out.println("Enter housing and food cost of family no."+(i+1));
			hc=keyboard.nextDouble();
			fc=keyboard.nextDouble();
			out=fm[i].tostring(hc,fc);
			System.out.println((i+1)+". "+out);
		}
	}
}

