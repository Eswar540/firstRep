class Employee
{
	String firstName;
	String lastName;
	double monthlySalary;
	
	public Employee()
	{
		firstName="unknown";
		lastName="unknown";
		monthlySalary=0.0;
	}
	
	public void set(String firstName,String lastName,double monthlySalary)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		if(monthlySalary<0)
		{
			this.monthlySalary=0.0;
		}
		this.monthlySalary=monthlySalary;
	}
	
	public void get()
	{
		System.out.println("Firstname" + firstName);
		System.out.println("Lastname"+lastName);
		System.out.println("Yearly salary"+(12*monthlySalary));
		System.out.println("Yearly salary after 10 perc raise"+(12*monthlySalary+(10.0/100)*12*monthlySalary));
	}
}
public class EmployeTest
{
	public static void main(String args[])
	{
		
		
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.set("Eswar","Reddy",50000);
		e2.set("kranthi","priya",5000);
		e1.get();
		e2.get();
	}
}
		
		