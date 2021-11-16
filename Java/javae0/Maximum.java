//Import the required packages
import java.util.Scanner;
class Maxreturn 
{
int maxInRange(int[] ar, int lowIndex, int highIndex)
 { 
  if (lowIndex == highIndex)return ar[lowIndex];
  int mid= (lowIndex + highIndex)/2;
  int a = maxInRange(ar, lowIndex, mid);
  int b = maxInRange(ar, mid+1, highIndex);
  if (a > b)
   return a;
  else
   return b;
 }
int max(int[] ar,int len)
 { 
  return maxInRange(ar, 0, len-1); 
 }
}
public class Maximum{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the Length of the array: ");
 int len = sc.nextInt();
 int[] ar = new int[len];
 for(int i=0 ; i<len ; i++)
 {
  System.out.print("Enter element no. " + (i+1) + " in the array: ");
  ar[i] = sc.nextInt();
 }
 System.out.println("\nReminder:The indices starts from zero!!!\n");
 System.out.print("Enter the index from where you want to find the max. element i.e. low index: ");
 int lowIndex = sc.nextInt();
 System.out.print("Enter the index till where you want to find the max. element i.e. high index: ");
 int highIndex = sc.nextInt();Maxreturn obj = new Maxreturn();
 int k = obj.maxInRange(ar, lowIndex, highIndex);
 System.out.println("The maximum element from indices " + lowIndex + " to "+ highIndex + " is: " + k);
 System.out.println("The maximum element in the complete array is: "+obj.max(ar,len));
 }
}
