import java.util.*;
class Equal
{
public static void main(String args[])
{
 Scanner sha=new Scanner(System.in);
 System.out.println("entre the size of array");
 int n=sha.nextInt();
 System.out.println("entre the array elements");
 int a[]=new int[n];
 for(int i=0;i<n;i++)
 {
  a[i]=sha.nextInt();
 }
 System.out.println("entre the target");
  int t=sha.nextInt();
 checkSum(n,a,t);
 }
 public static void checkSum(int n,int a[],int t)
 {
 for(int i=0;i<n;i++)
 {
  for(int j=i+1;j<n;j++)
  {
   if(a[i]+a[j]==t)
   {
   System.out.println(" by adding array values we got the target value"+i+","+j);
    }
   } 
  }
 }
}










