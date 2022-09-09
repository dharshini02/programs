import java.util.*;
public class qur{
   public static void main(String ar[])throws Exception
   {
    double d,a,b,c,r1,r2;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of a:");
     a=sc.nextDouble();
    System.out.println("enter the value of b:");
     b=sc.nextDouble();
    System.out.println("enter the value of c:");
     c=sc.nextDouble();
    d=b*b-4*a*c;
    if(d>0)
    {
      r1=(-b+Math.sqrt(d))/(2.0*a);
      r2=(-b-Math.sqrt(d))/(2.0*a);
      System.out.format("r1= %.2f and r2 %.2f",r1,r2);
    }
   else if(d==0)
   {
     r1=r2=-b/(2*a);
     System.out.format("r1= %.2f and r2=%.2f",r1);
    
   }
   else
   { double real=-b/(2*a);
     double imagi=Math.sqrt(-d)/(2*a);
     System.out.format("r1=%.2f+%.2fi",real,imagi);
     System.out.format("r1=%.2f-%.2fi",real,imagi);
 
 }    
      
    
  
   }
}
