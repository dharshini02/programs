class lexicalorder{
 public static void main(String ar[])throws Exception
  {
   String str[]={"hello","world","print"};
  String temp;
   for(int i=0;i<str.length;i++)
   {
    for(int j=i+1;j<str.length;j++)
   {
     if(str[i].compareTo(str[j])>0)
     {
     temp=str[i];
     str[i]=str[j];
     str[j]=temp;
     }
}
}
for(int i=0;i<str.length;i++)
{
System.out.println(str[i]);
}
}
}
