//Import the required packages
import java.util.Scanner;
class Statistics
{
double mean(double[] arr, int n)
{
double total=0;
for(int i=0;i<n;i++)
{
total=total+arr[i];
}
return total/n;
}
double sd(double[] arr, int n)
{
double variance=0;
double u=mean(arr, n);
for(int i=0; i<n; i++)
{
variance=variance+(arr[i]-u)*(arr[i]-u);
}
variance=variance/n;
return Math.sqrt(variance);
}
int[] stat=new int[10];
void freq(double[] arr, int n)
{
for(int i=0; i<n; i++)
{
if(arr[i]>=0 && arr[i]<10)
{
stat[0]++;
}
else if(arr[i]>=10 && arr[i]<=19)
{
stat[1]++;
}
else if(arr[i]>=20 && arr[i]<=29)
{
stat[2]++;
}
else if(arr[i]>=30 && arr[i]<=39)
{
stat[3]++;
}
else if(arr[i]>=40 && arr[i]<=49)
{
stat[4]++;
}
else if(arr[i]>=50 && arr[i]<=59)
{
stat[5]++;
}
else if(arr[i]>=60 && arr[i]<=69)
{
stat[6]++;
}
else if(arr[i]>=70 && arr[i]<=79)
{
stat[7]++;
}
else if(arr[i]>=80 && arr[i]<=89)
{
stat[8]++;
}
else if(arr[i]>=90 && arr[i]<=100)
{
stat[9]++;
}
}
}
}
public class StudentGrades
{
public static void main(String...args)
{
Statistics obj = new Statistics();
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of students: ");
int len = sc.nextInt();
double[] arr = new double[len];
for(int i=0;i<len;i++)
 {
System.out.print("Enter marks of student no. " + (i+1) + " : ");
arr[i]=sc.nextDouble();
}
double Mean=obj.mean(arr, len);
System.out.println("Mean marks of all students is "+Mean);
double StandardDeviation=obj.sd(arr, len);
System.out.println("Standard Deviation in marks of students is "+StandardDeviation);
obj.freq(arr, len);
System.out.println("Distribution table for the marks is..");
for(int k=0;k<10;k++)
 {
System.out.println("\tPercentageof scores in range "+(k*10)+" to "+(k*10+9)+" is "+ (100*((double)obj.stat[k]/len)));
}
}
}
