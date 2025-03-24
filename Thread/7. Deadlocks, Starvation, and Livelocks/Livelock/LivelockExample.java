/*
Livelock (Threads Keep Changing States Without Progress)

💡 Real-World Example: Two Friends Avoiding a Collision
Two people walking toward each other in a narrow hallway.
Both move left at the same time.
Both move right at the same time.
They never pass each other! (Livelock)

🔄 Both threads keep adjusting but never proceed!
🚨 Solution: Implement a timeout or random wait to break the cycle.
*/

class Friend {
    private boolean stepAside = false;

    public synchronized void move(Friend other) {
        while (!stepAside) {
            System.out.println(Thread.currentThread().getName() + " moves aside...");
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
            stepAside = true;
            other.allowPass();
        }
    }

    public synchronized void allowPass() {
        stepAside = false;
    }
}

// public class LivelockExample { 
public class Main{
    public static void main(String[] args) {
        Friend personA = new Friend();
        Friend personB = new Friend();

        Thread t1 = new Thread(() -> personA.move(personB), "Person A");
        Thread t2 = new Thread(() -> personB.move(personA), "Person B");

        t1.start();
        t2.start();
    }
}
/*
OUTPUT:
-------
Person A moves aside...
Person B moves aside...

*/
