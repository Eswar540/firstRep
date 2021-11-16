import java.util.*;
public class Employee

{
	String Employee_name;
	String ID;
	double basicPay;
	double payroll;
	
	
	public void compute()
	{
		if(basicPay<=10000)
		{
			payroll=basicPay+(basicPay*0.04)+(basicPay*0.08)+(basicPay*0.1);
		}
		else if(basicPay<=20000)
		{
			payroll=basicPay+(basicPay*0.08)+(basicPay*0.16)+(basicPay*0.2);
		}
		else
		{
			payroll=basicPay+(basicPay*0.05)+(basicPay*0.24)+(basicPay*0.3);
		}
	}
	public void display()
	{
		System.out.println("Employee name:" + Employee_name);
		System.out.println("Employee Id:" + ID);
		System.out.println("Basic pay:" + basicPay);
		System.out.println("Payroll:" + payroll);
	}

		
			
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		Employee e1=new Employee();

		System.out.println("enter basicpay");
		double basicPay=sc.nextDouble();
		
		System.out.println("enter employee name");
		String Employe=sc.nextLine();

		System.out.println("enter id");
		String ID=sc.nextLine();
		
		
		e1.compute();
		e1.display();
		
	}
}
	
	

	
		
