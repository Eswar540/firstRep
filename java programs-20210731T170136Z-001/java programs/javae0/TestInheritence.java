/*
Lab Session Number		:05
Type of Lab			:In Lab
Problem No.			:01
Author				:Eswar
Date				:
Program Name			:TestInheritence.java
Topics covered			:
*/
import java.lang.*;
import java.util.*;
class Automobile
{
	
String make;
String yearmodel;
public Automobile()
{
make="unknown";
yearmodel="unknown";
}

public void display()
{
	System.out.println(make);
	System.out.println(yearmodel);
}

}
public class TestInheritence
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the make of the car");
		String make=sc.nextLine();

		System.out.println("Enter the yearmodel of the car");
		String yearmodel=sc.nextLine();

		
		System.out.println("Enter the Platenumber");
		String plateNumber=sc.nextLine();

		System.out.println("Enter the number of wheels");
		int numofWheels=sc.nextInt();

		System.out.println("Enter the fuel");
		int fuel=sc.nextInt();

		System.out.println("Enter the speed");
		int speed=sc.nextInt();

		System.out.println("Enter the Price");
		double price=sc.nextDouble();
		
		Car c=new Car(make,yearmodel,plateNumber,numofWheels,fuel,speed,price);
		c.computeTotalPrice();
		c.display();
	}
}
		
		
		
		
		
		
		
	


class Vehicle extends Automobile
{
	String plateNumber;
	int numofWheels;
	int fuel;
	int speed;
	static int makespeed=100;
	public Vehicle()
	{
		plateNumber="unkown";
		numofWheels=0;
		fuel=0;
		speed=0;
	}
	public Vehicle(String make,String yearmodel,String plateNumber,int numofWheels,int fuel,int speed)
	{
		super.make=make;
		super.yearmodel=yearmodel;
		this.plateNumber=plateNumber;
		this.numofWheels=numofWheels;
		this.fuel=fuel;
		this.speed=speed;
		
	}
	//Display the details of the vehicle
	public void display()
	{
		
		super.display();
		System.out.println("Platenumber:"+plateNumber);
		System.out.println("Number of wheels:"+numofWheels);
		System.out.println("Fuel:"+fuel+":in Litres");
		System.out.println("Maximum speed"+Vehicle.makespeed);
		System.out.println("speed"+speed);
		
	
	}
}
class Car extends Vehicle
{
	double price;
	double totalPrice;
	public Car()
	{
		price=0.0;
		totalPrice=0.0;

	}
	//Add parameterised constructor
	public Car(String make,String yearmodel,String plateNumber,int numofWheels,int fuel,int speed,double price)
	
	{
		super(make,yearmodel,plateNumber,numofWheels,fuel,speed);
		this.price=price;
		
	}
	public void computeTotalPrice()
	{
		String year=yearmodel.substring(0,4);
		int y=Integer.parseInt(year);
		if(y>=2000&&y<=2020)
		{
			if(y>=2000&&y<=2010)
			{
				totalPrice=price-(price*0.15);
			}
			else if(y>2010&&y<=2018)
			{
				totalPrice=price-(price*0.07);
			}
			else
			{
				totalPrice=price;
			}
		}
		else
		{
			System.out.println("Invalid Model");
		}
		
		
		
	}
	public void display()
	{
		super.display();
		System.out.println("Actual Price of the car"+price);
		System.out.println("Invoice of car after discount"+totalPrice);
		
	}
	
}
	
	
		
	
	
		
		
	
		