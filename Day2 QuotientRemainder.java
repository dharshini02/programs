
import java.io.*;
class quotientRemainder
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the dividend=");
        int n=Integer.parseInt(d.readLine());
        System.out.print("Enter the divisor=");
        int div=Integer.parseInt(d.readLine());
        int qu=n/div;
        int remain=n%div;
        System.out.println("The Quotient is="+qu);
        System.out.println("The Remainder is="+remain);
    }
}
