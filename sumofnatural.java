import java.util.*;
public class sumofnatural{
  public static int number(int num)

  {
    if(num==1)
       return 1;
    else
      return num+number(num-1);
  }
  public static void main(String ar[])throws Exception
  { int n;
   Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
   System.out.println(number(n));
}
}
