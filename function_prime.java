import java.util.*;
class function_prime{
   
   public static void primenumber(int low, int high)
    {int s=1;
  
    for(int i=low;i<=high;i++)
    {
       s=1;
        for(int j=2;j<=low/2;j++)
        {
         if(i%j==0){
              s=0;
             break;
         }
           
       }

   if(s==1)
          System.out.println(i+"is prime number");
}
}
public static void main(String ar[])throws Exception
  {
    Scanner sc=new Scanner(System.in);
     int low=sc.nextInt();
     int high=sc.nextInt();
     function_prime obj=new function_prime();
     obj.primenumber(low, high);
     
}
}