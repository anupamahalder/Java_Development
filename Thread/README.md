# **🚀 Threads in Java**

## **1️⃣ Introduction to Threads**
### **What is a Thread?**
A **thread** is the smallest unit of execution in a program. Java provides **multithreading**, which allows multiple tasks to run **concurrently** to improve performance.

### **Why Use Threads?**
- 🏎 **Faster Execution** – Perform multiple operations at once.  
- 💻 **Efficient CPU Utilization** – Threads use multi-core processors effectively.  
- ⚡ **Non-Blocking UI** – Ensures smooth performance in GUI applications.  
- ⏳ **Parallel Processing** – Enables background tasks while the main program runs.  

---

## **2️⃣ Types of Threads**
### **1. User Threads**  
- Created by the developer for application logic.  
- Example: A thread that downloads a file in the background.

### **2. Daemon Threads**  
- Runs in the background and terminates when all user threads finish.  
- Example: Java **Garbage Collector**.

---

## **3️⃣ Ways to Create Threads in Java**
Java provides **two** ways to create a thread:

### **✅ Method 1: Extending `Thread` Class**
```java
class MyThread extends Thread {
    public void run() {  // Define task
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();  // Create thread
        t1.start();  // Start execution
    }
}
```
📌 **Key Points**:  
- `run()` contains the code to be executed.  
- `start()` begins execution in a separate thread.  

---

### **✅ Method 2: Implementing `Runnable` Interface**
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable Thread is running...");
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);  // Create thread using Runnable
        t1.start();
    }
}
```
📌 **Why `Runnable`?**  
- Java does not support multiple inheritance.  
- `Runnable` allows a class to extend another class while using multithreading.

---

## **4️⃣ Thread Lifecycle (States of a Thread)**
A thread **moves through different states** during execution.

| **State**        | **Description** |
|-----------------|----------------|
| **New**        | Created but not started (`new Thread()`). |
| **Runnable**   | Ready to run, waiting for CPU (`start()`). |
| **Blocked**    | Waiting for a resource (e.g., a locked file). |
| **Waiting**    | Waiting indefinitely for another thread. |
| **Timed Waiting** | Waiting for a fixed time (`sleep()`, `join()`). |
| **Terminated** | Execution is completed. |

### **✅ Example of Thread Lifecycle**
```java
class ThreadLifecycle extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running...");
            Thread.sleep(2000);
            System.out.println("Thread execution completed.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }

    public static void main(String[] args) {
        ThreadLifecycle t1 = new ThreadLifecycle();
        System.out.println("Thread State: " + t1.getState()); // NEW
        t1.start();
        System.out.println("Thread State after start(): " + t1.getState()); // RUNNABLE
    }
}
```

---

## **5️⃣ Thread Methods in Java**
| **Method**         | **Description** |
|------------------|----------------|
| `start()`       | Starts a thread. |
| `run()`         | Defines the task for the thread. |
| `sleep(ms)`     | Pauses the thread for a given time. |
| `join()`        | Makes one thread wait for another. |
| `yield()`       | Gives CPU time to another thread. |
| `isAlive()`     | Checks if a thread is still running. |
| `setPriority()` | Changes the thread priority. |

### **✅ Example: Using `sleep()` and `join()`**
```java
class SleepJoinDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepJoinDemo t1 = new SleepJoinDemo();
        SleepJoinDemo t2 = new SleepJoinDemo();

        t1.start();
        try {
            t1.join(); // Main thread waits for t1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start(); // Starts after t1 completes
    }
}
```
📌 **`join()` ensures `t1` completes before `t2` starts.**  

---

## **6️⃣ Thread Synchronization**
🔴 **Problem:** If multiple threads access the same resource, it may cause inconsistent results (**race condition**).  

### **✅ Solution: Use `synchronized` keyword**
```java
class SharedResource {
    synchronized void printNumbers(int n) { // Synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

class Thread1 extends Thread {
    SharedResource obj;
    Thread1(SharedResource obj) { this.obj = obj; }
    public void run() { obj.printNumbers(5); }
}

class Thread2 extends Thread {
    SharedResource obj;
    Thread2(SharedResource obj) { this.obj = obj; }
    public void run() { obj.printNumbers(10); }
}

public class SyncExample {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);

        t1.start();
        t2.start();
    }
}
```
📌 **Ensures one thread executes `printNumbers()` at a time.**

---

## **7️⃣ Multithreading Example**
```java
class MultiTasking extends Thread {
    String task;
    MultiTasking(String task) { this.task = task; }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(task + " - Step " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }

    public static void main(String[] args) {
        MultiTasking task1 = new MultiTasking("Cooking");
        MultiTasking task2 = new MultiTasking("Studying");
        MultiTasking task3 = new MultiTasking("Typing");

        task1.start();
        task2.start();
        task3.start();
    }
}
```
**📝 Output (Parallel Execution)**:
```
Cooking - Step 1
Studying - Step 1
Typing - Step 1
Cooking - Step 2
Studying - Step 2
Typing - Step 2
Cooking - Step 3
Studying - Step 3
Typing - Step 3
```

---

## **8️⃣ Deadlock in Threads**
🔴 **Problem:** Two threads **block each other indefinitely** while waiting for resources.

### **✅ Example: Deadlock Situation**
```java
class Deadlock {
    public static void main(String[] args) {
        final String resource1 = "Printer";
        final String resource2 = "Scanner";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 locked " + resource1);
                try { Thread.sleep(100); } catch (InterruptedException e) { }
                synchronized (resource2) {
                    System.out.println("Thread 1 locked " + resource2);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 locked " + resource2);
                try { Thread.sleep(100); } catch (InterruptedException e) { }
                synchronized (resource1) {
                    System.out.println("Thread 2 locked " + resource1);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
```
📌 **Fix using `tryLock()` (in `ReentrantLock`) to avoid deadlocks.**  

---

## **🔹 Summary**
- **Multithreading** increases efficiency.
- `Thread` vs `Runnable` approach.
- Thread states (`NEW → RUNNABLE → BLOCKED → WAITING → TERMINATED`).
- `synchronized` prevents race conditions.
- **Multithreading is powerful but should be used carefully**.
