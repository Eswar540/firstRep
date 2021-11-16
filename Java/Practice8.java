//A java program to demonstrate a given problem gussing a number by implementing variables ,data types,operators and control statements
/*
Lab Session Number		:01
Type of Lab			:post Lab
Problem No.			:2
Author				:Eswar
Date				:22/10/2020
Program Name			:Practice8.java
Topics covered			:Fundamentals of Java Programming
				 Variables,escape sequences&Cotrol Statements
*/
//import required packages
import java.lang.*;
import java.util.*;
class GuessNumber
{
      
//adding a method to determine the guess number with secret number

	public String determineGuess(int userNumber,int secretNumber,int count)
          {
                        
	   if(userNumber<0 || userNumber>100)
	{
	                  return "Your guess is invalid";
	   }
	  else if(userNumber==secretNumber)
	{
		return "Correct!!You won\nTotal Guess"+count;
	
	}
	  else if(userNumber<secretNumber)
	{
		return "Your guess is too low,try again \n Try number:"+count;

	}
	 else if(userNumber>secretNumber)
	{
		return "Your guess is too high,try again \n Try number:"+count;

	}
	  else
	{
		return "Your guess is incorrect\n Try number:"+count;

	}

       }
}
public class Practice8
{
	public static void main(String args[])
		{
			Scanner console=new Scanner(System.in);
			int secretNumber=(int)(Math.random()*100)+1;
			int userNumber=0;
			int count=1;
			GuessNumber gn=new GuessNumber();
			
			while(userNumber!=secretNumber)
			{
				System.out.println("Enter the guess b/n 1 and 100");
				userNumber=console.nextInt();
				String result=gn.determineGuess(userNumber,secretNumber,count);
				System.out.println(result);
				count++;
			}
	
		}
}	
					

