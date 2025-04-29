package Advance_Java;

//implementing threads using Runnale interface .
//Runnable interface is parent interface for Thread class .
class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }

    }
}

public class concept7 {
    public static void main(String[] args) {
        Runnable obj = new A();
        Runnable obj1 = new B();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
}
