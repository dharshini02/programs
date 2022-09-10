import java.util.*;
class largest{
  public static void main(String ar[])throws Exception
  {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of a:");
    a=sc.nextInt();
    System.out.println("enter the value of b:");
    b=sc.nextInt();
    System.out.println("enter the value of c:");
    c=sc.nextInt();
    if(a>=b && a>=c)
       System.out.println(a+" is greater");
    else if(c>=a && c>=b)
      System.out.println(c+" is greater");
    else
      System.out.println(b+" is greater");
  }
}
    
       
    
