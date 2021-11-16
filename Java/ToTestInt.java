/*
Lab session number			:06
Type of lab					:In lab
Problem number				:02
Author						:Eswar
Date						:
Program name				:EmployeTest.java
topics covered				:Abstract classes,interfaces
*/
import java.util.*;
interface Test
{
	double square();
}
class Arthemetic implements Test
{
	double num;
	public Arthemetic(double num)
	{
		this.num=num;
	}
	public double square()
	{
		return Math.pow(num,2);
	}
}
public class ToTestInt
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double num=sc.nextDouble();
		Arthemetic a=new Arthemetic(num);
		System.out.println("The square of the number is:" + " " + a.square());
	}
}

