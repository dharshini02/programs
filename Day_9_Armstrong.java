class Day_9_Armstrong{
 public static void main(String arg[])throws Exception
 {
  int num=153,s=0;
   int n=num;
    while(num!=0)
    {
     int r=num%10;
     s=s+(r*r*r);
     num=num/10;
    }
if(s==n)
    System.out.println(s+"Armstrong number");
else
 System.out.println(s+" Not Armstrong number");
  
}
}
