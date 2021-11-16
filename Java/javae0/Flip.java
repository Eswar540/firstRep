//Create a java program to Implement Collection Framework
/**************************************************************************************
Lab no 			: 12
Author 			: Eswar
Date 			: 16/02/2021
Lab type 		: Post lab
Program no 		: 1
Program name 	: Flip.java
Topics covered 	: fundamentals of collections , collection framework heirarachy , it's methods
**************************************************************************************/
// Import the required packages
import java.util.*;
class Flip
{
@SuppressWarnings("rawtypes")
static ArrayList FlipBox()
{
/*Declaring 2D ArrayList*/
ArrayList<ArrayList<Integer>> al = new
ArrayList<ArrayList<Integer>>();
for(int i=0;i<2;i++)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter values for "+i+" row");
al.add(new ArrayList<Integer>());
for(int j=0;j<3;j++)
{
int n=sc.nextInt();
al.get(i).add(j, n);
}
}
return al;
}
@SuppressWarnings("rawtypes")
static ArrayList Flipping(ArrayList<ArrayList<Integer>> m,char c)
{
if(c=='v')
{
for(int j=0;j<3;j++)
{
int t=m.get(0).get(j);
int u=m.get(1).get(j);
m.get(0).set(j,u); // replacing value
m.get(1).set(j,t);
}
}
if(c=='h')
{
for(int i=0;i<2;i++)
{
int t=m.get(i).get(0);
int u=m.get(i).get(2);
m.get(i).set(0,u);
m.get(i).set(2,t);
}
}
return m;
}
public static void main(String args[])
{
@SuppressWarnings("unchecked")
ArrayList<ArrayList<Integer> > y = FlipBox();
System.out.println(y);
System.out.println("Enter character (v/h)");
Scanner input =new Scanner(System.in);
char c=input.next().charAt(0);
System.out.println(Flipping(y,c));
input.close();
}
}