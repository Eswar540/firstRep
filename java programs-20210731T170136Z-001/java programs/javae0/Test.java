//import required packages
import java.lang.*;	
import java.util.*;

class Meal
{
	//properties of Meal object(Adding Variables)
	double mealCost;
	double tipPercent;
	double taxPercent;
	double tip;
	double tax;
	double totalCost;
	Scanner console=new Scanner(System.in);

	//Adding methods to meal class
	void read()
	{
		System.out.print("enter mealcost: ");
		mealCost=console.nextDouble();

		System.out.print("Tip Percentage: ");
		tipPercent=console.nextDouble();
		
		System.out.print("Tax Percentage: ");
		taxPercent=console.nextDouble();
	}
	void calBill()
	{
		tip=mealCost*(tipPercent/100);
		tax=mealCost*(taxPercent/100);
		totalCost=mealCost+tip+tax;
	}
	void display()
	{
		
		System.out.println("\nTotal cost of meal: "+(int)totalCost);
	}					
}

public class Practise7
{
	public static void main(String args[])
	{
		Meal m1=new Meal();
		m1.read();
		m1.calBill();
		m1.display();
	}
}
