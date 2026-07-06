package Collection;
import java.util.*;

//Follow Queue and Stack Principle. We can insert and delete element from both end.
// It is faster than Stack and Queue itself (Stack + Queue --> Legacy Class)
//Stack --> LIFO
//Queue --> FIFO
public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        //Queue
        dq.offerLast(1);
        dq.offerLast(2);
        dq.offerLast(3);
        dq.offerLast(4);

//        System.out.println(dq);
//        dq.poll();
//        System.out.println(dq);
//        dq.poll();
//        System.out.println(dq);
//        dq.pollFirst();
//        System.out.println(dq);

        //Stack
//        dq.offerFirst(1);
//        dq.offerFirst(2);
//        dq.offerFirst(3);
//        dq.offerFirst(4);
//
//
//        System.out.println(dq);
//        dq.poll();
//        System.out.println(dq);
//        dq.poll();
//        System.out.println(dq);
//        dq.pollFirst();
//        System.out.println(dq);

        System.out.println(dq);
    }
}
