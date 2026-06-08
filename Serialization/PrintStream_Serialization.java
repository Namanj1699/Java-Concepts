package Serialization;
//serialization -- problem of storing objects inside file. We have proposed 3 solutions of it. PrintStream is 1st & old solution

import java.io.*;

class Student
{
    String name;
    String dept;
    int rollNo;
}

public class PrintStream_Serialization {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("Output.txt");
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();

        s.name = "Naman Jain";
        s.dept = "Computer Science";
        s.rollNo = 8;

        ps.println(s.name);
        ps.println(s.dept);
        ps.println(s.rollNo);

        fos.close();
        ps.close();

        FileInputStream fis = new FileInputStream("output.txt");
        //for converting Stream to Reader we have use InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        s.name = br.readLine();
        s.dept = br.readLine();
        s.rollNo = Integer.parseInt(br.readLine());

        System.out.println(s.name + " " + s.dept + " " + s.rollNo);

        fis.close();
        fos.close();


        //FileOutputStream writing Methods

//FileOutputStream- write string n char into file
//        String str = "Java Programming";
//        byte[] b = str.getBytes();


//1.
//        fos.write(str.getBytes());

//2.
//        for(byte x: b)
//            fos.write(x);

//3.
//        fos.write(b,5,str.length()-5);
    }
}
