import java.util.*;
class count{
 public static void main(String ar[])throws Exception
 {
     int co=0;
  Scanner sc=new Scanner(System.in);
   int n1=sc.nextInt();
  while(n1!=0)
  {
  int n=n1%10;
   ++co;
   n1=n1/10;
  }
  System.out.println("number of digit:"+co);
  }
}
    
