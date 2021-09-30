//java program to print area of rectangle 
/****
case study		:5
Programmer		:eswar
Date			:16/10/2020
Program name		:area of rectangle
*/
//importing java lang package
import java.lang.*;
//declaring class 
public class Area
      {
//instance variables
                int length;  
		int breadth;
		double area;
//function to calculateArea

          void calculateArea()
           {
               area=length*breadth;
          }
	  void display()
            {
                 System.out.println("Area of rectangle"+area);
          }
          
}
class Rectangle1
{
    public static void main(String args[])
             {
                 Area a1=new Area();
                a1.length=2;
		a1.breadth=3;
		a1.calculateArea();
		a1.display();

	}
}  	