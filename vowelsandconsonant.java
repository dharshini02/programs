class vowelsandconsonant {
    public static void main(String[] args) {
        String str="engineering";
      int  count=0;
      int count1=0;
     String ch=str.toLowerCase();
     
        for(int i=0;i<str.length();i++)
        {
            if(ch.charAt(i)=='a'||ch.charAt(i)=='e'|| ch.charAt(i)=='i'|| ch.charAt(i)=='o'||ch.charAt(i)=='u')
            {
                count++;
            }
            else if(ch.charAt(i)>='a'&& ch.charAt(i)=="z")
            {
                conut1++;
            }
        }
        System.out.println("vowels are:"+count);
        System.out.println("Consonant are:"+count1);
    }
}
