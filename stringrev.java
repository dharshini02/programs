public class stringrev{
 public static String strrev(String str)
{
 int n=str.length();
 if(str==null||n<=1)
  return str;
 else
  return strrev(str.substring(1))+str.charAt(0);
 }
public static void main(String ar[])throws Exception
 {
  String str="Java Program";
  System.out.println(strrev(str));
}
}