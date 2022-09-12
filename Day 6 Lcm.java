import java.io.*;
class Lcm
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d= new DataInputStream(System.in);
        System.out.print("Enter the first number=");
        int a=Integer.parseInt(d.readLine());
        System.out.print("Enter the second number=");
        int b=Integer.parseInt(d.readLine());
        int i=(a>b)?a:b
         while(true)
         {
           if(i%a==0 && i%b==0)
             break;
           i++
         }
      System.out.println("Lcm:"+i);
    }
}
