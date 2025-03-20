/*
isAlive() (Check if a Thread is Still Running)

🔹 Explanation:
isAlive() → Returns true if the thread is still running, false otherwise.

*/

class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
public class Main{

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Is thread alive? " + t1.isAlive()); // Should print true before it finishes
        try{
            t1.join();
        }
        catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }
        System.out.println("Is thread alive? " + t1.isAlive()); // Should print false after completion
        System.out.println("Thread finished execution");
    }
}

/*
OUTPUT:
-------
Is thread alive? true
Is thread alive? false
Thread finished execution

*/
