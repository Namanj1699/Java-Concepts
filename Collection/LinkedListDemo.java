package Collection;
import java.lang.*;
import java.util.LinkedList;
import java.util.List;

//In Java Collection uses Doubly Linkedlist
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll1= new LinkedList<>(List.of(10,20,30,40));

        ll1.addFirst(0);
        ll1.addLast(100);
        System.out.println(ll1.peek());//return the first element inside linkedlist
        System.out.println(ll1.poll());//remove the first element inside linkedlist
//        System.out.println(ll1.remove()); //remove the first element inside linkedlist
        System.out.println(ll1);
    }
}
