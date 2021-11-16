//Implement Handling exceptions to a given application
/*		
Lab session number		:10
Type of lab				:In lab
Problem no				:01
Author					:Eswar
Date					:0232021
Program name			:Practice31.java
Topics covered			:Exception fundamentals,types of Exceptions,Exception keywords,custom exceptions ,types of exceptions ,try,catch and finally keywords
*/
//import the required packages
import java.lang.*;
import java.util.*;
class GameException extends Exception
{
	public GameException(String message)
	{
		super(message);
		
	}
}
class Game
{
	Random r=new Random();
	int secretcode=10000+r.nextInt(90000);		
	Scanner sc=new Scanner(System.in);
	int sum=0,digit=0,count=0;
	int n,t,g;
	
	public void check()
	{
		System.out.println("Your secret code is generated");
		System.out.println(secretcode);
		System.out.println("Enter guess code");
		n=sc.nextInt();
		int temp=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		try
		{
			//usage of throw keyword
			if(count!=5)
			{
				throw new GameException("Invalid guess code");
			}
			else
			{
				while(temp>0)
				{
					t=temp%10;
					g=secretcode%10;
					if(t==g)
					{
						digit++;
						sum=sum+t;
					}
						temp=temp/10;
						secretcode=secretcode/10;
				}
			}
		if(digit==0)
				{
					throw new GameException("you lost");
				}
				else
				{
					System.out.println(" "+digit+"and"+" "+sum);
				}
		
								
	
		}
				
		catch(GameException e)
		{
		e.printStackTrace();
		}
	}
}
public class Practice31
{
	public static void main(String args[])
	{
		Game g=new Game();
		g.check();
			
	}
}



