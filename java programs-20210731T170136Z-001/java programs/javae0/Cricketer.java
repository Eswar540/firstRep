//java program to display details of a cricketer
/****
case study		:4
programmer	:Eswar
Date		:14/10/2020
program name	:data types
*/
//importing lang package
import java.lang.*;
//declaring class
public class Cricketer
             {
	        String name;
		int runs_in_match;
		byte age;
		short runs_in_test;
		long runs_in_all_formats;
		float avg;
		double strikerate;
		boolean attended;
		char gender;
		static String cricket_team="India";
	
	
         void display()
          {
	 System.out.println("name"+ name);
	 System.out.println("total runs in a match"+runs_in_match);
	 System.out.println("age of the cricketer"+age);
	 System.out.println("total runs in test"+runs_in_all_formats);
	 System.out.println("batting avg"+avg);
	 System.out.println("batting strikerate"+strikerate);
	 System.out.println("whether attended or not"+attended);
	 System.out.println("gender"+gender);
	 System.out.println("Cricket_team"+cricket_team);
 
        }
}
 class Driver
      {
          public static void main(String args[])
            {
             Cricketer c1=new Cricketer();
                        c1.name="virat";
			c1.runs_in_match=100;
                        c1.age=31;
			c1.runs_in_test=7000;
			c1.runs_in_all_formats=25000;
			c1.avg=45;
			c1.strikerate=99;
			c1.attended=true;
			c1.gender='m';
			c1.display();
		
        	   

            }
}	