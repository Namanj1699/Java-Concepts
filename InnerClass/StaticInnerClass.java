package InnerClass;

class Outer1
{
    int x=10;
    static int y=20;

    static class Inner1{
        void display()
        {
//            System.out.println(x);
            // we can only use static variables inside static class
            System.out.println(y);
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer1.Inner1 oi = new Outer1.Inner1();
        oi.display();
    }
}
