public class empty{
 public static void main(String ar[])throws Exception
  {
   String str="";
   if(str==null)
    System.out.println("null");
   else if(str.trim().isEmpty())
     System.out.println("empty");
   else 
     System.out.println("not null and  empty");
}
}
