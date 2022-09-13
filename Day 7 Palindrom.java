import java.util.*;
class palindrom{
  public static void main(String  ar[])throws Exception
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String strreve="";
    int len=str.length();
    for(int i=len-1;i>=0;i--)
    {
      strreve=strreve+str.CharAt(i);
    
    }
    if(str.equals(strreve))
    {
    System.out.println("palidrom ");
  }
    else
       System.out.println(" not palidrom ");
}
}
