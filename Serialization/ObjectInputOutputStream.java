package Serialization;

import java.io.*;

class Student2 implements Serializable
{
    String name;
    String dept;
    int rollNo;
}

public class ObjectInputOutputStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("Output2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student2 s = new Student2();

        s.name = "Manish Yadav";
        s.dept = "Computer Science";
        s.rollNo = 6;

        oos.writeObject(s);

        fos.close();
        oos.close();

        FileInputStream fis = new FileInputStream("Output2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student2 st2 = (Student2)ois.readObject();
        System.out.println(st2.name + " " + st2.dept + " " + st2.rollNo);

        fis.close();
        ois.close();
    }
}
