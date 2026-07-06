package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//This class represent both TreeMap n HashMap Demo
// IMP : The implementation provides guranteed log(n) cost
public class TreeMapnHashMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"A",1,"B",3,"D"));
        HashMap<Integer,Character> hm = new HashMap<>(Map.of(0,'A',1,'B',3,'D'));

        tm.put(4,"E");
        System.out.println(tm);

        System.out.println(tm.ceilingEntry(2).getValue());

        System.out.println(tm.get(1));

        System.out.println(hm);
    }
}
