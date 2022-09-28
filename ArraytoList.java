import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class ArraytoList {
  public static void main(String[] args) {

  
    String[] ar= {"Java", "Python", "C"};
    System.out.println("Array: " + Arrays.toString(ar));

    List l= new ArrayList<>(Arrays.asList(ar));

    System.out.println("List: " + l);

  }
}
