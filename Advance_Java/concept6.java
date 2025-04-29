package Advance_Java;

//Every thread is subclass of Thread class 
//run method executes when we call any thread
class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");
            // sleep method suggests schedular to wait for particular time .
            // Every sleep method throws InterruptedException error so we have to handle it
            // using catch block
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

public class concept6 {
    public static void main(String[] args) {

        // thread is also a class so wew have to make object of thread to call it .
        A obj = new A();
        B obj1 = new B();

        // every thread has priority , and getPriority method gives us it .
        System.out.println(obj.getPriority());

        // MAX_PRIORITY is static variable written in Thread class whose value is 10
        obj.setPriority(5);

        // We can set Priority using setPriority method .
        obj1.setPriority(5);

        obj.start();

        obj1.start();

    }
}
