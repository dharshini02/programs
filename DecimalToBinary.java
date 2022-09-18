
class DecimalToBinary 
{
    static void dectobin(int n)
    {
  
        int[] Num = new int[100];
   
        int i = 0;
        while (n > 0) 
        {
            Num[i] = n % 2;
            n = n / 2;
            i++;
        }
  
        for (int j = i - 1; j >= 0; j--)
            System.out.println(Num[j]);
    }
      
    public static void main (String[] args) 
    {
        int n = 8;
        System.out.println("Binary");
          dectobin(n);
    }
}
  
