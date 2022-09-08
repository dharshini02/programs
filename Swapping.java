import java.io.*;
class Swap
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the value=");
        int a=Integer.parseInt(d.readLine());
        System.out.print("Enter the value=");
        int b=Integer.parseInt(d.readLine());
        int c=a;
        a=b;
        b=c;
        System.out.println("swap values of a="+a);
        System.out.println("swap values of b="+b);

    }
}
