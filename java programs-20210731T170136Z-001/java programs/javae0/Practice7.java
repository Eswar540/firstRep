//A java program to demonstrate a given problem by implementing variables ,data types,operators and control statements
/*
Lab Session Number		:01
Type of Lab			:In Lab
Problem No.			:01
Author				:Eswar
Date				:21/10/2020
Program Name			:Practice7.java
Topics covered			:Fundamentals of Java Programming
			 	Variables,Datatypes,Operators&Cotrol Statements
*/
//Import required packages
import java.lang.*;
import java.util.*;
 class Meal
{
	//Properties of Meal object(Adding variables)
	String name;	
	String quality;	
	static double baseCost=50;
	double tipPercent;
        double taxPercent;
	double tip;
	double tax;
	double totalCost;
	
	Scanner console=new Scanner(System.in);
	
	
	//Adding methods to a Meal class
	void read()
	{
		System.out.println("Enter the Customer Name:");
		name=console.nextLine();
		
		System.out.println("enter the quality of meal:");
		quality=console.nextLine();
		
	
		System.out.println("Tip Percentage:");
		tipPercent=console.nextDouble();
		
		
		System.out.println("Tax Percentage:");
		taxPercent=console.nextDouble();

		
		

		
		
		

	}
		
	
	void calBill()
	{
		tip=baseCost*(tipPercent/100);
		tax=baseCost*(taxPercent/100);
		totalCost=baseCost+tip+tax;
	}
	void display()
	{
		System.out.println("Customer Name:"+name);
		System.out.println("Meal base cost:"+baseCost);
		System.out.println("Tip Percentage:"+tipPercent);
		System.out.println("Tax Percentage:"+taxPercent);
		System.out.println("Tip cost:"+tip);
		System.out.println("Tax cost:"+tax);
		System.out.println("Total cost of Meal:"+totalCost);
		System.out.println("Quality of meal:"+quality);
		
		
	}
}
 public class Practice7
{
	public static void main(String args[])
	{
	
		Meal m1=new Meal();
		
	
	
		m1.read();
		m1.calBill();
		m1.display();
		
		
		
}	
	
}	
	
		
		
		
	