
class frequency {
    public static void main(String[] args) {
        String str="engineering";
      int  count=0;
       char ch='e';
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                count++;
            }
        }
        System.out.println(""+count);
    }
}
