import java.util.*;
interface Test
{
	double square();
}
class Arthemetic
{
	double num;
	public double square()
	{
		return Math.pow(num,2);
	}
}
public class ToTestInt
{
	public static void main(String args[])
	{
		Arthemetic a=new Arthemetic();
		System.out.println("The square of the number is:" + " " + a.square());
	}
}

