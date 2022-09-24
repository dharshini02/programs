public class millitosec
{
 public static void main(String ar[])throws Exception
 {
  long milli=1000000;
  long min=(milli/1000);
  System.out.println("minute="+min);
  long sec=(milli/1000)/60;
  System.out.println("second="+sec);
}
}  
