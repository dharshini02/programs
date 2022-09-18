public class BinarytoDecimal
{
 public static int btod(int n)
 {
  int num=n;
 int dec=0,base=1;
  int temp=num;
   while(temp>0)
   {
    int l=temp%10;
    temp=temp/10;
   dec=dec+l*base;
   base=base*8;
}
return dec;
}
public static void main(String ar[])throws Exception
{
  int number=50;
  System.out.println(btod(number));
}
}