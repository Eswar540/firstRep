import java.lang.*;
class Student
{
	String name;
	int age;
	String address;
	
	public Student()
	{
		name="unknown";
		age=0;
		address="unknown";
	}
	
	public void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Student 1 name"+" "+name);
		System.out.println("Student 1 age"+" "+age);
		System.out.println("Student 1 address"+" "+address);
	}
}
public class Practice22
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner();
		
		System.out.println("Enter the details of students in one line");
		String data=sc.nextLine();
		
		Student n[]=
	