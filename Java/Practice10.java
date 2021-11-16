class Person
{
int age;


Person()
{
   
	
	



}
}
class Employee extends Person

{
	String ename;
	int eid;
	//no argument constructor
	Employee()
	{
		super();
		System.out.println("I am in no argument constructor");
	}
	//parameterised constructors
	
	Employee(String name)
	{
		this();
		ename=name;
	}
	
	Employee(String name,int id)
	{
		this(name);
		eid=id;
	
	}
	void display()
	{
		System.out.println(ename);
		System.out.println(eid);
		System.out.println(age);
	}
}
public class Practice10
{
    public static void main(String args[])
		{
			Employee e1=new Employee("pratap",23);
			Employee e2=new Employee("mukesh",13);
		                   e1.display();
			e2.display();
		}
}
			
	
	
	