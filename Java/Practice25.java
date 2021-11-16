/*
Lab session number			:06
Type of lab					:Post lab
Problem number				:01
Author						:Eswar
Date						:
Program name				:EmployeTest.java
topics covered				:Abstract classes,interfaces
*/
import java.util.*;
interface Shape3D
{
	double getVolume();
}
class Cuboid implements Shape3D
{
	private double length;
	private double height;
	private double breadth;
	
	public Cuboid(double length,double height,double breadth)
	{
		this.length=length;
		this.height=height;
		this.breadth=breadth;
	}
	public double getVolume()
	{
		return length*breadth*height;
	}
}
public class Practice25
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		double length=sc.nextDouble();
		
		System.out.println("Enter the breadth");
		double breadth=sc.nextDouble();
		
		System.out.println("Enter the height");
		double height=sc.nextDouble();
		
		Cuboid c=new Cuboid(length,breadth,height);
		System.out.println("The volume of the cuboid is:" + " " + c.getVolume());
	}
	
}
