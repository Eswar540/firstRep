//java program to print perimeter and area of rectangle 
/****
case study		:5
Programmer		:eswar
Date			:16/10/2020
Program name		:perimeter of rectangle
*/
//importing java lang package
import java.lang.*;
//declaring class 
public class Perimeter
      {
//instance variables
                  int length;  
	int breadth;
 	double area;
	double perimeter;
//function to calculateArea
        void calculateArea()
          {
             area=length*breadth;
       } 
          void calculatePerimeter()
           {
               perimeter=2*(length+breadth);
          }
            void display()
            {
                 System.out.println("Area of rectangle"+area);
		System.out.println("perimeter of rectangle"+perimeter);
	
          }
}
class Rectangle2
{
    public static void main(String args[])
             {
                    Perimeter p1=new Perimeter();
	
	p1.length=2;
	p1.breadth=3;
	p1.calculateArea();
	p1.calculatePerimeter();
	p1.display();
	}
}  	