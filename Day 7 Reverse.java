import java.util.*;
class Reserve{
  public static void main(String  ar[])throws Exception
  {
    int s=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n!=0)
    {
      int r=n%10;
      s=s*10+r;
      n=n/10;
    }
    System.out.println("The reverse of number "+n+" is "+s);
  }
}
    
