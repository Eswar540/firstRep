import java.io.*;
public class ReadFile
{
	public static void main(String args[])
	{
		FileReader r=null;
		try
		{
			
		File f=new File("input.txt");
		r=new FileReader(f);
		int i=0;
		while((i=r.read())!=-1)
		
		{
			System.out.println((char)i);
		}
	
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File doesnt exist");
			
			
			
			
		}
		catch(IOException e)
		{
			
			
			
			System.out.println("file not read");
		}
		finally
		{
			try
			{
			r.close();
			}
			catch(IOException e)
			{
				System.out.println("Not responding");
			}
			
		}
			
		
		
	}
}

		