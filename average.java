public class average {
public static void main(String ar[])throws Exception
{
 double sum=0;
 double n[]={10,11,12,13,14,15};
 int s=n.length;
 for(int i=0;i<s;i++)
   sum=sum+n[i];
 double avg=sum/s;
 System.out.println(avg);
}
}
