import java.util.ArrayList;
import java.util.List;

public class Joinlist{

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<String>();
        l1.add("a");

        List<String> l2 = new ArrayList<String>();
        l2.add("b");

        List<String> Co = new ArrayList<String>();

        Co.addAll(l1);
        Co.addAll(l2);

        System.out.println("The list1: " + l1);
        System.out.println(" The list2: " + l2);
        System.out.println("join list is : " + Co);

    }
}
