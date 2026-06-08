package Serialization;
// DataInput and Output stream is use for storing object into its real datatypes unlike PrintStream where integer is store in the form of String.

import java.io.*;

class Student1
{
    String name;
    String dept;
    int rollNo;
}

public class DataInputOutputStream {

    public static void main(String arg[]) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("Output1.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        Student1 s = new Student1();

        s.name = "Abhyudaya Mittal";
        s.dept = "Computer Science";
        s.rollNo = 4;

        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        dos.writeInt(s.rollNo);

        fos.close();
        dos.close();

        FileInputStream fis = new FileInputStream("Output1.txt");
        DataInputStream dis = new DataInputStream(fis);

        s.name = dis.readUTF();
        s.dept = dis.readUTF();
        s.rollNo = dis.readInt();

        System.out.println(s.name + " " + s.dept + " " + s.rollNo);

        fis.close();
        dis.close();
    }

}
