import java.util.*;
class calculator{
  public static void main(String  ar[])throws Exception
  {
   Double n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value 1:");
    Double a=sc.nextDouble();
    System.out.println("enter the value 2:");
    Double b=sc.nextDouble();
    System.out.println("enter the operator:");
    char operator=sc.next().charAt(0);
    switch (operator){
     case '+':
        n=a+b;
        System.out.println(n);
        break;
     case '-':
        n=a-b;
        System.out.println(n);
        break;
     case '*':
        n=a*b;
        System.out.println(n);
        break;
    case '/':
        n=a/b;
        System.out.println(n);
        break;
}
}
}
                
    
   