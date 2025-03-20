/*
join() (Waiting for a Thread to Finish)

🔹 Explanation:
join() → Forces the main thread to wait until t1 finishes execution.

*/


class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}
public class Main{
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();

        t1.join(); // Main thread waits for t1 to finish
        System.out.println("Main thread finished execution.");
    }
}

/* 
OUTPUT:
-------
Thread-0 started.
Thread-0 finished.
Main thread finished execution.

*/
