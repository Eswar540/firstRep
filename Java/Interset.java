//import required packages
import java.lang.*;
import java.util.Scanner;
class Bank
{
        //properties of Bank object
	double amount;
	char cname;
	double result;
	double interest;
	int flag;
	Scanner console =new Scanner(System.in);
//adding methods to Bank class
        void read()
	{
	  System.out.print("enter the amount: ");
	  amount=console.nextDouble();
	  System.out.print("enter company name: ");
	  cname=console.next().charAt(0);	
	}
	boolean bankCheck()
	{
		switch(cname)
		{
			case 'a':case 'A': interest=1.5;break;
			case 'b':case 'B': interest=2;break;
			case 'c':case 'C': interest=1.5;break;
			case 'x':case 'X': interest=5;break;
			default:flag=1;
		}
		if(flag==0)
		return true;
		else
		return false;
		
	}
	void calculate()
	{
		result=(interest*amount)/100;
	}
	void display()
	{
		System.out.println("Amount: "+amount);
		System.out.println("bank account: "+cname);
		System.out.println("The amount of money that can be earned in one year as interest: "+result);
	}
	
}

public class Interest
{
	public static void main(String args[])
	{
		Bank i=new Bank();
		i.read();
		i.bankCheck();
		if(i.bankCheck())
		{
			i.calculate();
	     		i.display();
		}
		else
		{
			System.out.println("enter bank account correctly");
		}	
	}
}
