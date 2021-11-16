//Implementation of method overloading and overriding
/*		
Lab session number	:08
Type of lab			:In lab
Problem no			:01
Author				:Eswar
Date				:27/01/2021
Program name		:Practice20.java
Topics covered		:Method overloading and method overriding,Early/static/compile time binding,Late/Dynamic/Runtime binding
					 Polymorphism
					 "super"
*/
//importing required packages
import java.lang.*;
import java.util.*;
class Book
{
	//Book properties
	String data;
	String bookname;
	String authorname;
	//no argument constructor with default values
	public Book()
	{
		data="unknown";
		bookname="unknown";
		authorname="unknown";
	}
	//set data to setup desired values
	public void setData(String data)
	{
		this.data=data;
		String temp[]=data.split(",");
		bookname=temp[0];
		authorname=temp[1];
		
	}
	public void display()
	{
		System.out.println("Name:"+bookname);
		System.out.println("Author name"+authorname);
		
	}
}
class McGrawHill extends Book
{
	double price;
	
	public McGrawHill()
	
	{
		super();
		price=0.0;
	}
	public void setData(String data,double price)
	{
		super.setData(data);
		this.price=price;
	}
	//Implementation of method overriding{
	public void display()
	{
		super.display();
		System.out.println("Price"+price);
	}
	
	
}
class Oxford extends Book
{
	double price;
	
	public Oxford()
	
	{
		super();
		price=0.0;
	}
	public void setData(String data,double price)
	{
		super.setData(data);
		this.price=price;
	}
	//Implementation of method overriding{
	public void display()
	{
		super.display();
		System.out.println("Price"+price);
	}
	
	
}
public class Practice20
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book details in a single line");
		String data=sc.nextLine();
		McGrawHill m=new McGrawHill();
		m.setData(data,400);
		Oxford o=new Oxford();
		o.setData(data,600);
		m.display();
		o.display();
	}
}
		
	
		
		
	
	


	
	
