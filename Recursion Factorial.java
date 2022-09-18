public class FactorialRe{
 static int fact(int n)
   {
      if(n==1)
        return 1;
      else
        return n*fact(n-1);
  }
public static void main(String ar[])throws Exceptions
{
int n=3;
System.out.println(fact(n));
}
}
