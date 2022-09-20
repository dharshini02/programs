import java.util.*;
public class matrixadd{
 public static void main(String ar[])throws Exception
 { 
  
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the first matrix row value:");
  int n=sc.nextInt();
  System.out.println("enter the first matrix column value:");
  int m=sc.nextInt();
  System.out.println("enter the second matrix row value:");
  int p=sc.nextInt();
  System.out.println("enter the second matrix row value:");
  int q=sc.nextInt();
  int a[][]=new int[n][m];
  int b[][]=new int[p][q];
  int c[][]=new int[p][q]; 
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<m;j++)
   {
    a[i][j]=sc.nextInt();
    }
 }
 for(int i=0;i<p;i++)
  {
   for(int j=0;j<q;j++)
   {
    b[i][j]=sc.nextInt();
    }
 }
for(int i=0;i<n;i++)
 {
  for(int j=0;j<m;j++)
   {
    System.out.println(a[i][j]+" ");
  }
 }
for(int i=0;i<p;i++)
 {
  for(int j=0;j<q;j++)
   {
    System.out.println(b[i][j]+" ");
  }
 }
if(n==p&& m==q)
{
for(int i=0;i<n;i++)
 {
  for(int j=0;j<p;j++)
  {
   for(int k=0;k<m;k++)
    c[i][j]=a[i][j]+b[i][j];
 }
}
for(int i=0;i<n;i++)
 {
  for(int j=0;j<p;j++)
   {
    System.out.println(c[i][j]+" ");
  }
 }
}
else
 System.out.println("addition is not possible");
}
}