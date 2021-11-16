
/*			
Lab session number		:07
Type of lab			:In lab
Problem no			:02
Author				:Eswar
Date				:
Program name			:Area1.java
Topics covered			:Packages	
*/
import Shape.Triangle;
import Shape.Rectangle;
import Shape.Square;
import java.util.*;
public class Area1
{	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length");
		double length=sc.nextDouble();
		
		System.out.println("Enter the width");
		double width=sc.nextDouble();
		
		
		Triangle t=new Triangle();
		System.out.println("The area of tringle is "+t.triangleArea(length,width));
		
		Rectangle r=new Rectangle();
		System.out.println("The area of rectangle is"+r.rectangleArea(length,width));
		
		Square s=new Square();
		if(length==width)
		{
		System.out.println("The area of square is"+s.squareArea(length));
		}
		else
		{
		System.out.println("The area of the square cannot be calculated for the given inputs");
		}

		
	}
}
		
		
