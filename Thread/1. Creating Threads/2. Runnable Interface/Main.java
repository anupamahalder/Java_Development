/*
Implementing Runnable Interface

🔹 Explanation:
- We implement Runnable and define run().
- We pass an instance of MyRunnable to a Thread object and start it.
- Preferred when the class needs to extend another class (since Java doesn't support multiple inheritance).

*/

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable interface...");
    }
}
public class Main{
    public static void main(String[] args){
        Thread t1 = new Thread(new MyRunnable()); // Creating a thread with Runnable
        t1.start();
    }
}

/* 
OUTPUT:
-------
Thread running using Runnable interface...

*/
