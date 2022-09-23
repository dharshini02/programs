
public class carray{
 public static void main(String ar[])throws Exception
 {
 int a[]={10,11,13,12,14};
 int b[]={15,16,17,18,19};
 int a1=a.length;
 int b1=b.length;
 int len=a1+b1;
 int res[]=new int[len];
 for(int i=0;i<a1;i++)
 {
  res[i]=a[i];
 }
 for(int i=0;i<b1;i++)
 {
  res[a1+i]=b[i];
 }
for(int i=0;i<len;i++)
{
System.out.println(res[i]);
}
}
}
