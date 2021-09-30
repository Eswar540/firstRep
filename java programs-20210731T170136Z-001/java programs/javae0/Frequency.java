//Import the required packages
import java.util.Scanner;
public class Frequency
{
public static void main(String[] args)
 {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of array: ");
int k= sc.nextInt();
int [] a = new int [k] ;
int i = 0;
int j = 0;
for (i=0 ; i<k ; i++)
{
System.out.print("Enter element no. " + (i+1) + " in the array: ");
a[i] = sc.nextInt();
}
int [] fr = new int [k];
int vis = -99;
for(i = 0; i < k; i++)
{
int count =1;
for( j = i+1; j < k; j++)
{
if(a[i] == a[j])
{
count++;fr[j] = vis;
}
}
if(fr[i] != vis)
fr[i] = count;
}
for( i = 0; i < k; i++)
{
if(fr[i] != vis)
System.out.println("Frequency of " + a[i] + " is " + fr[i]);
}
}
}
