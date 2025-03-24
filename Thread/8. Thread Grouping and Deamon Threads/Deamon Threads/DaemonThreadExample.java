/*
Daemon Threads in Java

🔹 What is a Daemon Thread?

Daemon threads run in the background for tasks like garbage collection.
They automatically stop when all user threads finish.
Example: Creating a Daemon Thread

🔹 Explanation
We create a thread (daemonThread) and mark it as daemon using setDaemon(true).
The daemon thread continuously prints "Daemon thread running...".
Once the main thread finishes, the daemon thread automatically stops.
*/

class DaemonTask implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Daemon thread running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Daemon thread interrupted.");
            }
        }
    }
}

public class DaemonThreadExample { 
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonTask(), "Daemon-Thread");
        daemonThread.setDaemon(true);  // Mark as daemon thread
        daemonThread.start();

        // Main thread runs for 2 seconds
        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        System.out.println("Main thread finished, daemon thread will stop.");
    }
}
/*
OUTPUT:
-------
Daemon thread running...
Daemon thread running...
Daemon thread running...
Daemon thread running...
Main thread finished, daemon thread will stop.

*/
