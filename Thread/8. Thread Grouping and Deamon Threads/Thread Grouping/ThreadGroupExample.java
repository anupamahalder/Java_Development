/*
Thread Grouping in Java

🔹 What is Thread Group?
A Thread Group allows managing multiple threads together, like setting priorities or interrupting all at once.
Example: Managing Multiple Threads with ThreadGroup

🔹 Explanation
We create a thread group (myGroup) and associate multiple threads with it.
All threads print their name and the group they belong to.
After 2 seconds, all threads in the group are interrupted using myGroup.interrupt().
*/


class MyTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running in group: " + Thread.currentThread().getThreadGroup().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}

public class ThreadGroupExample { 
    public static void main(String[] args) {
        // Create a thread group
        ThreadGroup myGroup = new ThreadGroup("MyThreadGroup");

        // Create multiple threads in the group
        Thread t1 = new Thread(myGroup, new MyTask(), "Thread-1");
        Thread t2 = new Thread(myGroup, new MyTask(), "Thread-2");
        Thread t3 = new Thread(myGroup, new MyTask(), "Thread-3");

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        // Display information about the thread group
        System.out.println("Active Threads in Group: " + myGroup.activeCount());

        // Interrupt all threads in the group after 2 seconds
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        myGroup.interrupt();
    }
}
/*
OUTPUT:
-------
Active Threads in Group: 3
Thread-1 is running in group: MyThreadGroup
Thread-3 is running in group: MyThreadGroup
Thread-2 is running in group: MyThreadGroup

*/
