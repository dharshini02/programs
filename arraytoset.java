import java.util.*;
class arraytoset {
    public static void main(String[] args) {
      String ar[]={"a","b","c","d"};
      Set<String>str=new HashSet<>(Arrays.asList(ar));
        System.out.println("the set:"+str);
 
    }
}
