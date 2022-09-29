import java.util.*;
class Maplist {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        List<Integer> keylist=new ArrayList(map.keySet());
         List<String> list=new ArrayList(map.values());
        System.out.println("the value:"+keylist);
        System.out.println("the value:"+list);
    }
}
