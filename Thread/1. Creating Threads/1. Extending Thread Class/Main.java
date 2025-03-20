/*
Extending Thread Class

🔹 Explanation:
- We extend the Thread class and override the run() method.
- The start() method starts the thread and internally calls run() asynchronously.
*/

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running using Thread class...");
    }
}
class Main{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Calls run() method and starts the thread
    }
}

/* 
OUTPUT:
-------
Thread running using Thread class...

*/
