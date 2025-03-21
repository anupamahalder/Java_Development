/*
yield() (Give Other Threads a Chance)

🔹 Explanation:
yield() → Hints to the CPU scheduler that this thread can pause and let others run first.

*/

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started.");
        Thread.yield(); // Hint to the scheduler to let another thread execute
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

public class Main{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // Set the thread name
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

/* 
OUTPUT:
-------
Thread-2 started.
Thread-2 finished.
Thread-1 started.
Thread-1 finished.
Thread-3 started.
Thread-3 finished.

*/
