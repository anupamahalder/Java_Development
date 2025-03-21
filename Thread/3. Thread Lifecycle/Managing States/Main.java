/* 
Thread Lifecycle in Java
A thread in Java goes through five states in its lifecycle:

New → When a thread is created but not started.
Runnable → After calling start(), the thread is ready to run.
Blocked → If waiting for a resource, the thread enters a blocked state.
Waiting / Timed Waiting → When waiting indefinitely (wait()) or for a specific time (sleep()).
Terminated → When the thread has finished execution.
*/

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is in RUNNING state.");
        
        try {
            Thread.sleep(2000); // Thread goes into TIMED WAITING state
            System.out.println(Thread.currentThread().getName() + " woke up from sleep.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println(Thread.currentThread().getName() + " is TERMINATED now.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        
        System.out.println("Thread state before start: " + t1.getState()); // NEW
        t1.start();
        
        System.out.println("Thread state after start: " + t1.getState()); // RUNNABLE
        
        try {
            Thread.sleep(500); // Main thread waits to let t1 start
            System.out.println("Thread state while sleeping: " + t1.getState()); // TIMED_WAITING
            t1.join(); // Main thread waits for t1 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Thread state after completion: " + t1.getState()); // TERMINATED
    }
}

/*
OUTPUT:
-------
Thread state before start: NEW
Thread state after start: RUNNABLE
Thread-0 is in RUNNING state.
Thread state while sleeping: TIMED_WAITING
Thread-0 woke up from sleep.
Thread-0 is TERMINATED now.
Thread state after completion: TERMINATED

*/
