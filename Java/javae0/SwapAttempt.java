import java.util.Scanner;
public class SwapAttempt
{
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		int x,y;
		System.out.println("Enter value for x");
		x=keyboard.nextInt();
		
		System.out.println("Enter value for y");
		y=keyboard.nextInt();
		 
		x=x+y;
		y=x-y;
		x=x-y;
		
		
		System.out.println("value of x after swap:" + x);
		System.out.println("value of y after swap:" + y);
		
	}
}
