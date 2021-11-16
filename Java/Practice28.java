import java.util.*;
class Run
{
	String s;
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		s=sc.nextLine();
	}
	public void test()
	{
		int flag=0;
		int s=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)=='p'&&s.charAt(i+1)=='q')
			{
				flag=1;
			}
			if(s.charAt(i)=='p'&&s.charAt(i-1)=='q')
			{
				s=1;
			}
			
			
		}
		if(flag==1)
		{
			System.out.println("balanced,true");
		}
		if(r==1)
		{
			System.out.println("balanced,false");
		}
		
	}
}
public class Practice28
{
	public static void main(String args[])
	{
		Run r=new Run();
		r.getData();
		r.test();
	}
}

	
	
	
	