import java.util.*;
class set_to_array {
    public static void main(String[] args) {
    
      Set<String>str=new HashSet<>();
      str.add("a");
      str.add("b");
      str.add("c");
      String array[]=new String[str.size()];
      str.toArray(array);
        System.out.println("the array:"+Arrays.toString(array));
 
    }
}
