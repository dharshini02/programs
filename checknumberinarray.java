class checknumberinarray {
  public static void main(String[] args) {

    int[] num = {10, 12, 30, 24, 7};
    int num1 = 70;
    int found = 0;

    for (int i=0;i< num.length;i++) {
      if (num[i] == num1) {
        found = 1;
        break;
      }
    }
    
    if(found==1)
      System.out.println( "number is availabe");
    else
      System.out.println( "number is not availabe");
  }
}
