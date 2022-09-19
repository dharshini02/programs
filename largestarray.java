class largestarray {
    public static void main(String[] args) {
         int a[]={20,12,13,15,11};
         int num=a[0];
         int n=a.length;
         for(int i=1;i<n-1;i++)
         {
             if(a[i]>num)
              num=a[i];
         }
         
        System.out.println("largest"+num);
    }
}
