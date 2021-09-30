
/*			
Lab session number		:04
Type of lab			:In lab
Problem no			:01
Author				:Eswar
Date				:06/01/2021
Program name			:Practice13.java
Topics covered			:Strings methods	
*/
// import classes
import java.lang.*;
import java.util.*;
class PatternString
{
	String m_string;
	String t_string;
	String result="";
	// Add 2 parameterised constructors
	public PatternString(String m,String t)
	{
		m_string=m;
		t_string=t;
	}
	public String mAndTString()
	{
		int m_string_len = m_string.length();
		int t_string_len = t_string.length();
		for(int i=0;i<m_string_len-t_string_len+1;i++)
		{
			String temp=m_string.substring(i,i+t_string_len);
			if(i>0&&temp.equals(t_string))
				result+=m_string.substring(i-1,i);
			if(i<m_string_len-t_string_len && temp.equals(t_string))
				result+=m_string.substring(i+t_string_len,i+t_string_len+1);
			
		}
		return result;
	}
	public void display()
	{
		System.out.println("the given m_string : "+m_string);
		System.out.println("the given m_string : "+t_string);
		System.out.println("the new_string : "+result);
	}
	
	
	
}	
public class Practice13
{
	public static void main(String a[])
	{
		String m_string="weablcoabmeab";
		String t_string="ab";
		// object creation 
		PatternString ps=new PatternString(m_string,t_string);
		ps.mAndTString();
		ps.display();
		
	
	}
}	