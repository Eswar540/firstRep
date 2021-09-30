import java.util.Scanner;
public class SomeProg
{
  public static void main(String[] args)
      {
	Scanner keyboard=new Scanner(System.in);
	double YEAR,bornIn;
	int age;

	System.out.println("Enter the current Year");
	YEAR=keyboard.nextInt();

	System.out.println("How old are you this year?");
	age=keyboard.nextInt();

	

	bornIn=YEAR-age;
	System.out.println("I think you are born in:" + bornIn);
       }
}