## **Why Didn't Deadlock Happen?**
Deadlock occurs when two threads hold locks and wait for each other indefinitely. However, in your case, the threads successfully acquired the required locks in sequence. This could have happened due to:
1. **Thread Scheduling by JVM:**  
   - The Java Virtual Machine (JVM) does **not guarantee execution order**.
   - The scheduler might have allowed one thread to complete before switching to the other.
   
2. **Lock Acquisition Order Might Have Matched:**  
   - If `Person1` got both locks before `Person2`, there was no circular waiting.

---

### **How to Force Deadlock?**
To guarantee a **deadlock scenario**, try explicitly making threads wait after acquiring the first lock:
```java
class FlightBooking {
    static final Object flightLock = new Object();
    static final Object hotelLock = new Object();

    void bookFlight() {
        synchronized (flightLock) {
            System.out.println(Thread.currentThread().getName() + " booked Flight");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (hotelLock) {
                System.out.println(Thread.currentThread().getName() + " booked Hotel");
            }
        }
    }

    void bookHotel() {
        synchronized (hotelLock) {
            System.out.println(Thread.currentThread().getName() + " booked Hotel");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (flightLock) {
                System.out.println(Thread.currentThread().getName() + " booked Flight");
            }
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        FlightBooking booking = new FlightBooking();

        Thread person1 = new Thread(() -> booking.bookFlight(), "Person1");
        Thread person2 = new Thread(() -> booking.bookHotel(), "Person2");

        person1.start();
        person2.start();
    }
}
```
### **What’s Changed?**
- **Added `Thread.sleep(100);` after acquiring the first lock**  
  - This increases the chance that `Person1` locks `flightLock` and `Person2` locks `hotelLock` before requesting the second lock.

---

### **Expected Deadlock Output (No Progress, Stuck Forever)**
```
Person1 booked Flight
Person2 booked Hotel
```
- **Now, Person1 waits for hotelLock while holding flightLock.**
- **Person2 waits for flightLock while holding hotelLock.**
- **Both are stuck forever → Deadlock achieved! 🚨**

---

### **Solution to Prevent Deadlock**
1. **Always Acquire Locks in the Same Order**  
   - Ensure all threads lock `flightLock` **before** `hotelLock`.
   
2. **Use `tryLock()` with Timeout (ReentrantLock)**
   - Avoids waiting forever.

---
