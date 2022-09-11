
public class fibo{
   public static void main(String ar[])throws Exception
   {
    int a=0,b=1,sum;
int n=10;
for(int i=1;i<=n;i++)
{
  System.out.println(a+",");
 sum=a+b;
 a=b;
 b=sum;
}
}
}
