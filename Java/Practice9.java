//java program for accessing members
/*
Lab session number	:02
Type of lab		:Inlab
Problem number		:3
Author			:Eswar
Date			:26/10/2020
Program name		:Practice9.java
topics covered		:class fundamentals,object fundamentals.
*/
import java.lang.*;
import java.util.*;
public class Customer
{
	int customernumber;
	String customername;
	double price;
	double qty;
	double discount;
	double totalPrice;
	double netprice;
	
	
	void read()
	{
	Scanner console=new Scanner(System.in);
	
	System.out.println("enter the customername");
	 customername=console.nextLine();
	
	
	System.out.println("enter the customernubmer");
	 customernumber=console.nextInt();
	
		
	System.out.println("enter the price");
	 price=console.nextDouble();
	
	System.out.println("enter the quantity");
	qty=console.nextDouble();
	

	 
	
	}
	void calDiscount()
	{
	     totalPrice=price*qty;
	     if(totalPrice>=50000)
	      {
	      discount=totalPrice*(25.0/100);
	      } 
	     else if(totalPrice>=25000 && totalPrice<50000)
	      {
	       
	      discount=totalPrice*(15.0/100);
	      }
	     else
		{
		
	      discount=totalPrice*(10.0/100);
		}
		netprice=totalPrice-discount;
	}
	void display()
	{
		
	System.out.println("Name of the customer" + customername);
	System.out.println("Number of the customer" + customernumber);
	System.out.println("price" + price);
	System.out.println("Quantity" + qty);
	System.out.println("Discount" + discount);
	System.out.println("Totalprice" + totalPrice);
	System.out.println("Netprice" + netprice);
	
		
	}



	public static void main(String...eswar)
		{
		Customer c=new Customer();
		c.read();
		c.calDiscount();
		c.display();
		}
		
}