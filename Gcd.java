public class Gcd{
public static int recursiongcd(int a,int b);
 {
   if(b!=0)
     return recursiongcd(b,a%b);
   else
     return a ;
  }
public static void main(String []ar)throws Exception
{
 int n1=32,n2=7;
 int gcd=recursiongcd(n1,n2);
 System.out.println(gcd);
}
}
