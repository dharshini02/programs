public class power{
 public static int pow(int b,int p)
  {
    if(p!=0) 
     return b*pow(b,p-1);
    else
      return 1;
 }
 public static void main(String ar[])throws Exception
 {
   int pow=2,base=2;
   int n=pow(base,pow);
   System.out.println(n);
}
}
  