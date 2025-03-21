/*
setPriority() (Change Thread Priority)

🔹 Explanation:
setPriority(int) → Changes thread priority (1 to 10, default is 5).
Higher priority doesn’t guarantee execution first, it's just a hint to the scheduler.

*/
class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " priority: " + Thread.currentThread().getPriority());
    }
}

class Main{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.MAX_PRIORITY); // Priority 10
        t3.setPriority(Thread.NORM_PRIORITY); // Deafult priority 5

        t1.start();
        t2.start();
        t3.start();
    }
}

/* 
OUTPUT:
-------
Thread-2 priority: 5
Thread-1 priority: 10
Thread-0 priority: 1

*/
