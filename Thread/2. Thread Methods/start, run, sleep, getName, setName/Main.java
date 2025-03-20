/*
start(), run(), sleep(), getName(), setName()

🔹 Explanation:
start() → Calls run() method and starts execution in a separate thread.
run() → The code inside run() is executed when the thread starts.
sleep(ms) → Puts thread to sleep for ms milliseconds.
getName() → Gets the thread’s name.
setName() → Sets the thread’s name.
*/

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
        try {
            Thread.sleep(2000); // Makes the thread sleep for 2 seconds
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " finished execution.");
    }
}
public class Main{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("Worker-1"); // Setting thread name
        t1.start(); // Starts thread execution
    }
}

/* 
OUTPUT:
-------
Worker-1 is running...
Worker-1 finished execution.

*/
