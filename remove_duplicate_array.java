class remove_duplicate_array{
   public int remove_duplicate (int arr,int n)
{
    
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j]=arr[i];
                j++;
            }
        }
        arr[j]=arr[n-1];
         return j;
}

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3};
        int n=arr.length;
       int arr1=remove_duplicate(arr,n);
        for(int i=0;i<arr1;i++){
        System.out.println(arr[i]);
        }
    }
}
