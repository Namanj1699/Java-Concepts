package Synchronization;

class ATM
{
    synchronized void checkBalance(String name)
    {
        System.out.print(name + " check their account balance.");
        try { Thread.sleep(1000); } catch (Exception e) {}
        System.out.println("If not you please report it.");
    }

    synchronized void withDrawBalance(String name, int balance)
    {
        System.out.print("Dear "+name + " You have withdraw " + balance);
        try { Thread.sleep(1000); } catch (Exception e) {}
        System.out.println(" balance from your account.");
    }
}

class Customer1 extends Thread
{
    ATM a;
    String name;
    int amount;

    public Customer1(ATM a,String name,int amount)
    {
        this.a=a;
        this.name=name;
        this.amount=amount;
    }

    public void useATM()
    {
        a.checkBalance(name);
        a.withDrawBalance(name,amount);
    }

    public void run()
    {
        useATM();
    }
}

class Customer2 extends Thread
{
    ATM a;
    String name;
    int amount;

    public Customer2(ATM a,String name,int amount)
    {
        this.a=a;
        this.name=name;
        this.amount=amount;
    }

    public void useATM()
    {
        a.checkBalance(name);
        a.withDrawBalance(name,amount);
    }

    public void run()
    {
        useATM();
    }
}

class Customer3 extends Thread
{
    ATM a;
    String name;
    int amount;

    public Customer3(ATM a,String name,int amount)
    {
        this.a=a;
        this.name=name;
        this.amount=amount;
    }

    public void useATM()
    {
        a.checkBalance(name);
        a.withDrawBalance(name,amount);
    }

    public void run()
    {
        useATM();
    }
}

class Customer4 extends Thread
{

    ATM a;
    String name;
    int amount;

    public Customer4(ATM a,String name,int amount)
    {
        this.a=a;
        this.name=name;
        this.amount=amount;
    }

    public void useATM()
    {
        a.checkBalance(name);
        a.withDrawBalance(name,amount);
    }

    public void run()
    {
        useATM();
    }
}

class Customer5 extends Thread
{

    ATM a;
    String name;
    int amount;

    public Customer5(ATM a,String name,int amount)
    {
        this.a=a;
        this.name=name;
        this.amount=amount;
    }

    public void useATM()
    {
        a.checkBalance(name);
        a.withDrawBalance(name,amount);
    }

    public void run()
    {
        useATM();
    }
}

public class AtmChallenge {
    public static void main(String[] args) {

        ATM a = new ATM();
        Customer1 c1 = new Customer1(a,"Naman Jain",50000);
        Customer2 c2 = new Customer2(a,"Abhyudaya",40000);
        Customer3 c3 = new Customer3(a,"Manish Yadav",35000);
        Customer4 c4 = new Customer4(a,"Hritik Goel",20000);
        Customer5 c5 = new Customer5(a,"Harsh",40000);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}
