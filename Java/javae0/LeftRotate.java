import java.util.Scanner;
class Left 
{
Scanner scan = new Scanner(System.in);
void Create(int[] a, int n) 
{
int j;
for(int i=0 ; i<n ; i++) 
{
j = i+1;
System.out.print("Enter the element number " + j +" in the array: ");
a[i] = scan.nextInt();
}
}
void Rotate(int[] a, int num) 
{
int i;int j;
for( i=0 ; i<num ; i++)
 {
int temp = a[0];
for( j=0 ; j<a.length-1 ; j++)
a[j] = a[j+1];
a[j] = temp;
}
}
}
public class LeftRotate
{
public static void main(String args[])
 {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int size = sc.nextInt();
System.out.println("");
int[] arr = new int[size];
Left obj = new Left();
obj.Create(arr , size);
System.out.print("\nEnter the number of times to be rotated: ");
int num = sc.nextInt();
obj.Rotate(arr , num);
System.out.print("\nArray elements after rotation are: ");
for(int i=0; i<size; i++)
{
System.out.print(arr[i] + " ");
}
System.out.println();
}
}
