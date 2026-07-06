package Collection;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,40,50,5,1,10));
//        Collection<Integer> ts = new TreeSet<>(List.of(10,30,40,50,5,1,10));

        ts.add(25);
        System.out.println(ts.ceiling(27)); //Ceiling return greater than or equal to the given number
        System.out.println(ts.floor(27)); //floor return smaller than or equal to the given number

        System.out.println(ts);
    }
}
