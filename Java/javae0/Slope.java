//Implement handling exceptions to given application
/****************
Lab session Number  	: 10
Type of Lab 			: Postlab
Problem number 			: 01
Programmer		  		: Eswar
Date 			 		: 03-02-2021
Program Name    	  	: Slope.java
Topics Covered     	    : Exception handling,Exception fundamentals,
						  Exception keywords (try,catch,finally,throw,throws),
					      types of exceptions,exception hierarchy.
****************/
//import required packages
import java.lang.*;
import java.util.*;

class Point
{
	int x,y;
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int slope(int p,int q)
	{
		int slope=0;
		try
		{
			slope=(q-y)/(p-x);
			return slope;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			return -1;
		}
	}
}

public class Slope
{
	public static void main(String[] args)
	{
		int slope=0;
		int x1=0,y1=0,x2=0,y2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 value:");
		x1=sc.nextInt();
		System.out.println("Enter y1 value:");
		y1=sc.nextInt();
		System.out.println("Enter x2 value:");
		x2=sc.nextInt();
		System.out.println("Enter y2 value:");
		y2=sc.nextInt();
		Point p =new Point(x1,y1);
		slope=p.slope(x2,y2);
		if(slope!=-1)
		{
			System.out.println("Slope is "+slope);
		}
	}
}
