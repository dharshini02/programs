import java.util.Scanner;

public class Ducknumber {

    public static void main(String args[])
       {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        String nst = sc.nextLine();
 
        int len = nst.length();  
        int ct = 0;  
        char ch;
 
        for(int i=1;i<len;i++)
        {
            ch= nst.charAt(i); 
            if(ch=='0')
                ctr++;
        }
 
        char f = nst.charAt(0); 
 
        if(ct>0 && f!='0')
            System.out.println("Duck number");
        else
            System.out.println("Not a duck number");
    }
}
