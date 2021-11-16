public class Demo
{

	
	public static void main(String args[])
	{
		int i;
		String message="Hello! Welcome to CSE Department";
		StringBuffer message1=new StringBuffer(message);
		int count=0;
		int c=0;
		for(i=0;i<message.length();i++)
		{
			if(message.charAt(i)=='e')
			{
				count++;
			}
			
		}
	System.out.println("The number of times e occured in string:"+' '+count);
	String s=message.substring(18,21);
	String s1=s.toLowerCase();
	System.out.println(s1);
	for(i=0;i<message.length();i++)
	{
		if(message.charAt(i)!=' ')
		{
			c++;
		}
	}
	System.out.println("The number of characters in a given string is:"+" "+c);
	String s2=message.replace('o','a');
	System.out.println("string after replacing:"+" "+s2);
	message1.reverse();
	String s4=message1.toString;
	if(s4.equals(message1))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	}
	
	
}

	
		
		
		