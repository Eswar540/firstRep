//import required packages

import java.lang.*;
import java.util.*;
class Items
{
	//the items in vending machine
	int choice;
	byte a=0,b=0,c=0,d=0;
	/***
	  a for gum
	  b for chocolate
	  c for popcorn
	  d for juice
	****/
	//reading methods
	void read()
	{
		System.out.println("enter the item number: ");
		Scanner console = new Scanner(System.in);
		choice=console.nextInt();
	}
	void calculate()
	{
			switch(choice)
			{
				case 1:System.out.println("Here is your gum"); 
					a++;
					break;
				case 2:System.out.println("Here is your chocolate");
					b++;
					break;
				case 3: System.out.println("Here is your popcorn");
					c++;
					break;
				case 4:System.out.println("Here is your juice");
					d++;
					break;
				case 5:	display();
					break;
				case 6: System.exit(0);
				default:System.out.println("Error,options 1-6 only!");
			}
		
	}
	void display()
	{
		System.out.println(a+" items of gum sold");
		System.out.println(b+" items of chocolate sold");
		System.out.println(c+" items of popcorn sold");	
		System.out.println(d+" items of juice sold");
	}	
}
public class Vmachine
{
	static int j=1;	
	public static void main(String []args)
	{
		Items v=new Items();
        	System.out.println("-----Vending Machine Options-----");
       		System.out.println("[1] Get gum");
        	System.out.println("[2] Get chocolate");
        	System.out.println("[3] Get popcorn");
        	System.out.println("[4] Get juice");
        	System.out.println("[5] Display total sold so far");
        	System.out.println("[6] Quit");
		while(j==1)
		{
		v.read();
		v.calculate();
		}
	}
}
