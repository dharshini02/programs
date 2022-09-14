import java.util.*;
class prime{
  public static void main(String ar[])
  {
    int s=0;
     Scanner sc=new Scanner(System.in);
     int low=sc.nextInt();
     int high=sc.nextInt();
    for(int i=low;i<=high;i++)
    {
        for(int j=2;j<=low/2;j++)
        {
      if(i%j==0)
         
            s=0;
             break;
         
        
        }
        if(s==1)
          System.out.println(low+"is prime number");
    }
}
}
