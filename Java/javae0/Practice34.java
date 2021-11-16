//create a java application to copy contents one file to another file using IO stream
/*		
Lab session number		:09
Type of lab			:In lab
Problem no			:01
Author				:Eswar
Date				:27/01/2021
Program name			:Practice34.java
Topics covered			:Fundamentals of files
				Fundamentals fo streams
				types of Streams(Byte Streams and Character streams
				IO streams classes hierarchy
				Handling files						
*/
import java.io.*;
public class Practice34
{
	public static void main(String args[])throws Exception
	{
		try{
		File f=new File("Scores.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		int max;
		String line=br.readLine();
		max=Integer.parseInt(line);
		while(line!=null)
		{
			int next=Integer.parseInt(line);
			if(max<next)
			{
			max=next;
			}
			line=br.readLine();
		}
		br.close();
		System.out.println("maximum score is "+max);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}

			
		