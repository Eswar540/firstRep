/*
Lab Session Number		:05
Type of Lab				:Post Lab
Problem No.				:01
Author					:Eswar
Date					:
Program Name			:TestInheritence.java
Topics covered			:
*/
import java.lang.*;
class Degree

{
	public void getDegree()
	{
		System.out.println("I got the degree");
	}
}
class UnderGraduate extends Degree
{
	public void getDegree()
	{
		System.out.println("I am undergraduate");
	}
}
class PostGraduate extends Degree
{
	public void getDegree()
	{
		System.out.println("I am postgraduate");
	}
}
public class TestMethodOverriding
{
	public static void main(String args[])
	{
		Degree d=new Degree(); 
		d.getDegree();
		Degree d1=new UnderGraduate();
		d1.getDegree();
		Degree d2=new PostGraduate();
		d2.getDegree();
	}
}
