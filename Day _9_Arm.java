class arm{
 public static void main(String arg[])throws Exception
 {
  int low=150, high=160,s=0;
  for(int i=low;i<=high;i++)
  {
   int num=i;
    s=0;
    while(num!=0)
    {
     int r=num%10;
     s=s+(r*r*r);
     num=num/10;
    }
if(s==i)
    System.out.println(s);
  
  } 
}
}