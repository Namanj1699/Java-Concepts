package Collection;

import java.util.*;

//Set -- Contain Unique element only, Duplicacy not allowed.
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(16,.5f);

        hs.add(10);
        hs.add(50);
        hs.add(10);
        hs.add(30);
        hs.add(40);
        hs.add(40);
        hs.add(40);
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        hs.add(500);

        System.out.println(hs);
//        Output: [50, 20, 40, 10, 30]

    }
}
