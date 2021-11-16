//java program to read input from keyboard
/*****
case study		:6
Date			:20/10/2020
Programmer		:Eswar
program name		:read input 

*/
import java.lang.*;
import java.util.Scanner;

 public class UserInputDemo
{
         public static void main(String args[])
            {
                   Scanner console=new Scanner(System.in);

		System.out.println("Enter your name:");
		String name=console.nextLine();

		System.out.println("Hello!!How old are you");
		int age=console.nextInt();
	
	int retirement=60-age;

		System.out.println("enter your salary");
		double salary=console.nextDouble();

	System.out.println("Hello" + " " + name + " " + "You have" + " " + retirement + " " + "of years to retire");
	System.out.println("your" + " " +"salary" + " " + "is" + " " + salary);
	}
}