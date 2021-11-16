//create a java application to implement collection framework
/*		
Lab session number		:12
Type of lab				:In lab
Problem no				:01
Author					:Eswar
Date					:16/2/2021
Program name			:CheckIMEI.java
Topics covered			:fundamental of collections,collection framework hierarchy 
						Its method
													
*/
import java.util.*;
public class CheckIMEI
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size=15;
		int x=0;
		//create an arraylist collection
		System.out.println("enter imei number");
		ArrayList<Integer> imei=new ArrayList<Integer>(size);
		//append the elements at the end of the list
		for(int i=0;i<size;i++)
		{
			x=sc.nextInt();
			imei.add(x);
		}
		Integer[] temp=new Integer[imei.size()];
		for(int j=0;j<temp.length;j++)
		{
			temp[j]=imei.get(j);
		}
		for(int y:temp)
		{
			System.out.print(" "+y);
		}
		if(temp.length!=15)
		{
			System.out.println("invalid input");
		}
		else
		{
			int d=0,sum=0;
			for(int i=size-1;i>=0;i--)
			{
				d=temp[i];
				if(i%2==1)
				{
					d=2*d;
				}
				sum=sum+sumDig(d);			
			}
			System.out.println();
			System.out.println(sum);
			System.out.println();
			
		
			if(sum%10==0)
			{
			System.out.println("valid imei number");
			}
		
			else
			{
				System.out.println("\ninvalid imei number");
			}
		}
	}
		public static int sumDig(int n)
		{
			int r=0;
			while(n>0)
			{
				r=r+n%10;
				n=n/10;
			}
			return r;
		}			
		
		
	
}



