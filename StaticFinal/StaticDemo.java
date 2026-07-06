package StaticFinal;

//Imp Note: Static Data members is common and shared with all the objects created for the class.
class Super
{
    //static member
    static int x=10;

    //nonStatic Member
    int y=20;

    static void fun()
    {
//        y is not accessible inside method fun because it is static method and we can't access non static member inside static method.
//        System.out.println(y);
        System.out.println("Inside function fun"+x);
    }

    void display()
    {
        //we can access both static and non static members inside display method
        System.out.println(x);
        System.out.println(y);
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        Super obj1 = new Super();
        Super obj2 = new Super();

        obj1.x=100;

        System.out.println(obj2.x);

        System.out.println(Super.x);
        Super.fun();
        obj1.display();
    }
}
