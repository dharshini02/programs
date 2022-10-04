class selection_sort{
public static void main(String ar[])throws Exception{ 
int arr[]={5,4,9,2,7};
int l=arr.length;
for(int i=0;i<l;i++)
{
  int min=i;
  for(int j=i+1;j<l;j++)
  {
   if(arr[j]<arr[min])
   {
    min=j;
   }
 }

  int temp=arr[i];
  arr[i]=arr[min];
  arr[min]=temp;
 
 }
for(int i=0;i<l;i++)
 System.out.println(arr[i]);

}
}
