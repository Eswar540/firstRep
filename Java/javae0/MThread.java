
/*
Lab Session Number	: 11
Type of Lab			: In Lab
Problem No.			: 01
Author				: Eswar
Date				: 09-02-2021
Program Name		: MyThread.java
Topics covered		: Fundamentals of Threads
					 Threads Keywords
					Ways of creating threads
					 Threads Lifecycle 
					
*/

// import the required packages
 import java.io.*;
class pclass extends Thread
{

	public void run()
	 {
	try
	{
	File f = new File("personal.txt");
		
BufferedReaderbr = new BufferedReader(new FileReader(f));   
		
            String line = br.readLine();
		
while(line != null) 
		{
		
	System.out.println("Thread1 " + line);   
			   line = br.readLine();  
				sleep(1000);         
	}
br.close();
	}
	catch(Exception e)
	{
		
System.out.println(e);
	}
      }                   

}
class aclass extends Thread
{

	public void run() 
	 {
	try
	{
	File f = new File("academic.txt");
		
BufferedReaderbr = new BufferedReader(new FileReader(f));   
		
            String line = br.readLine();
		
while(line != null) 
		{
		
	System.out.println("Thread2 " + line); 
			line = br.readLine();   
			sleep(1000);             
	}
		br.close();
	}
	catch(Exception e)
	{
		
		System.out.println(e);	
	}  
       }                   

}
public class MThread
{
	public static void main(String args[])
	{
		pclass p=new pclass();
		aclass a=new aclass();
		try
		{
		p.start();	
		a.start();
		
		}
		catch(Exception e)
		{
		
		System.out.println(e);	
		} 
	}
}
