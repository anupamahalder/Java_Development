/*
ReentrantLock in Java
🔹 ReentrantLock is a class in java.util.concurrent.locks package used for explicit locking in multithreading.
🔹 Unlike synchronized, it provides more flexibility (e.g., tryLock(), fairness policy, interruptibility).
🔹 Allows the same thread to acquire the lock multiple times without getting blocked (reentrancy).

Using ReentrantLock for Thread Synchronization
💡 Scenario: Two threads try to increment a shared counter using ReentrantLock.

📝 Explanation:
ReentrantLock lock = new ReentrantLock(); → Creates a ReentrantLock instance.
lock.lock(); → Thread acquires the lock before modifying the shared variable.
try-finally block → Ensures lock.unlock(); always executes, even if an exception occurs.
Two threads (t1 and t2) increment the shared count using the increment() method.
Ensures thread safety → Only one thread modifies count at a time.
*/

import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock(); // Creating ReentrantLock

    // Method to increment count
    public void increment() {
        lock.lock();  // Acquiring the lock
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " -> Count: " + count);
        } finally {
            lock.unlock();  // Releasing the lock
        }
    }
}

class Worker extends Thread {
    SharedResource resource;

    Worker(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {  // Each thread increments 3 times
            resource.increment();
            try {
                Thread.sleep(100);  // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        SharedResource resource = new SharedResource();
        Thread t1 = new Worker(resource);
        Thread t2 = new Worker(resource);

        t1.start();
        t2.start();
    }
}
/*
OUTPUT:
-------
Thread-0 -> Count: 1
Thread-1 -> Count: 2
Thread-0 -> Count: 3
Thread-1 -> Count: 4
Thread-0 -> Count: 5
Thread-1 -> Count: 6

*/
