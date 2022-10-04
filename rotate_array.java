public class rotate_array{
 public static void rotate(int[] arr,int k)
 {
  int n=arr.length;
  k=k%n;
  reverse(arr,0,k-1);
  reverse(arr,k,n-1);
  reverse(arr,0,n-1);
 
 }
public static void reverse(int[] arr,int left,int right)
{
 while(left<right)
 {
  int temp=arr[right];
  arr[right]=arr[left];
  arr[left]=temp;
 
 left++;
 right--;
}
}
static void printarray(int arr[])
{
 for(int i=0;i<arr.length;i++)
  System.out.println(arr[i]+" ");
}
public static void main(String arg[])throws Exception
{
 int arr[]={1,2,3,4,5,6};
 int k=3;
 rotate(arr,k);
 printarray(arr);
}
}  
