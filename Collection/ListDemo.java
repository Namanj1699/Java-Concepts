package Collection;
import java.util.*;

public class ListDemo {
    public static void main(String[] args)
    {
        ArrayList<Integer> al1=new ArrayList<>(20);
        ArrayList<Integer> al2=new ArrayList<>(List.of(30,40,50,60,70));

        al1.add(20);
        al1.add(0,10);
        al1.addAll(al2);
        al1.addAll(0,al2);
        al1.set(0,20);

        System.out.println(al1.lastIndexOf(40));
        System.out.println(al1.indexOf(40));
        System.out.println(al1.get(4));
        System.out.println(al2.contains(40)); //return boolean
        System.out.println(al1); //print all the elements inside al1

//        for(int i=0;i<al1.size();i++)
//        {
//            System.out.println(al1.get(i));
//        }

//        for(var x: al1 )
//        {
//            System.out.println(x);
//        }

//        al1.forEach((x) -> {
//            System.out.println(x);
//        });
    }
}
