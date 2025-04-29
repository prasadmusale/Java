package Advance_Java;

class Calculation {
    int count;

    // synchronized method will not allow to acccess same data to different threads
    // . As one thread will wait for execution of another thread
    synchronized void increment() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }

    }
}

public class concept8 {
    public static void main(String[] args) {
        Calculation cal = new Calculation();

        // Created new Runnable object having method
        Runnable r1 = () -> {
            cal.increment();
        };

        Runnable r2 = () -> {
            cal.increment();
        };

        // created threads having common data that will affect
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t1.join(); // wait for t2 to complete
            t2.join(); // wait for t1 to complete

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(cal.count);
    }
}
