/*
Starvation (Low-Priority Threads Never Get CPU Time)

💡 Real-World Example: Bank Transactions
High-priority customers keep making transactions.
Low-priority customers keep waiting and never get access.

🛑 Low-priority customer (Normal Customer) may never run!
🚨 Solution: Use Fair Locks (ReentrantLock(true)) or Thread Scheduling.
*/

class BankTransaction implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is processing transaction.");
        try { 
            Thread.sleep(1000); 
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        }
    }
}

public class StarvationExample { 

    public static void main(String[] args) {
        Thread high1 = new Thread(new BankTransaction(), "VIP Customer 1");
        Thread high2 = new Thread(new BankTransaction(), "VIP Customer 2");
        Thread high3 = new Thread(new BankTransaction(), "VIP Customer 3");
        Thread low = new Thread(new BankTransaction(), "Normal Customer");

        // Assign high priorities to VIP customers
        high1.setPriority(Thread.MAX_PRIORITY);
        high2.setPriority(Thread.MAX_PRIORITY);
        high3.setPriority(Thread.MAX_PRIORITY);

        // Assign low priority to Normal Customer
        low.setPriority(Thread.MIN_PRIORITY);

        high1.start();
        high2.start();
        high3.start();
        low.start();  // This thread may starve because high-priority threads dominate CPU time.
    }
}

/*
OUTPUT:
-------
VIP Customer 1 is processing transaction.
VIP Customer 2 is processing transaction.
Normal Customer is processing transaction.
VIP Customer 3 is processing transaction.

*/
