import java.util.*;
class prime{
  public static void main(String ar[])
  {
    int s=0;
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    for(int i=2;i<=n/2;i++)
    {
      if(n%i==0)
        s=1;
      s++;
    }
    if(s==2)
    {
     System.out.println(n+"is prime number");
    }
    else
      System.out.println("not a prime number");
  }
}
