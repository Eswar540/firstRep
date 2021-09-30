 import java.util.*;
 public class VotingEligibilityException extends Exception
 {
	 
	 public VotingEligibilityException(String message)
	 {
		 super(message);
	 }
	 
 }
 class Demo
 {
	 int age;
	 public static void main(String args[])
	 {
		 
		 Scanner sc=new Scanner(System.in);
		 int numofvotes=0;
		 do
		 {
			 System.out.println("Enter number of votes");
			 numofvotes=sc.nextInt();
			 
			 
		 }while(numofvotes<0&&numofvotes==0);
		 Demo v[]=new Demo[numofvotes];
		 for(int i=0;i<v.length;i++)
		 {
			 v[i]=new Demo();
		 }
		  int x=0;
		 for(int j=0;j<v.length;j++)
		 {
			
			 System.out.println("Enter age of voter["+ ++x +"]");
			 v[j].age=sc.nextInt();
			 String message=check(v[j].age);
			 System.out.println(message);
		 }
	 }
	 public static String check(int age)
	 {
		 try
		 {
		 if(age<18)
			throw new VotingEligibilityException("you are underage");
		 else
			return "your voting coard issued";
		 }
		 catch(VotingEligibilityException e)
		 {
			e.printStackTrace();
		 }
		 return "Thank you";
		 
	 }
 }
 
	 
			
		 
		 
		 
		 
		 
		 
		 
		 
		
		 
		 
 