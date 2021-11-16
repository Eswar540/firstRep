import java.util.*;
class SubString
{
	String s;
	
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		s=sc.nextLine();
	}
	public void check()
	{
		int l=0;
		int r=s.length();
	
		
		
		if((s.charAt(0)==s.charAt(s.length()-2))&&(s.charAt(1)==s.charAt(s.length()-1)))
		{
			l=2;
		}
		System.out.println(s.substring(l,r));
	}
	
	
}
public class Practice27
{
	public static void main(String args[])
	{
		SubString s=new SubString();
		s.getData();
		s.check();
	}
	
}


			