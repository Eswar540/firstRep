//import required packages
import java.lang.*;
class Bank
{
	//properties of Savings object
	double amount=100000;
	double interestRate;
	double interest;
	int i;
	//Adding Methods
	void calculate()
	{
	    	for(i=1;i<=12;i++)
		{
		if(amount <= 110000)
		 interestRate = 0.01;
		else if(amount > 110000 && amount <= 125000)
		 interestRate  = 0.015;
		else
		 interestRate = 0.02;
		
		interest = amount*interestRate;
		amount = amount+interest;
		if(i!=12)
		{
			System.out.println(i+"\t"+interestRate+"\t\t"+String.format("%.2f",interest)+"\t\t\t"+String.format("%.2f",amount));

		}
		else
		{
			
               		 System.out.println(i+"\t"+interestRate+"\t\t"+String.format("%.2f",interest)+"\t\t\t"+String.format("%.2f",amount+1000));

		}
		amount=amount+1000;
		}
	}
}
public class SavingsAccount
{
	public static void main(String args[])
	{
		Bank b1=new Bank();
       		System.out.println("Month\tInterest Rate\tAmount of interest\tBalance");
		 b1.calculate();
	}
} 
