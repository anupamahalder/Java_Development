/*
Explanation:
1. StringBuffer (synchronized):
 -> StringBuffer ensures that only one thread modifies the string at a time.
 -> No data corruption occurs even when multiple threads operate on it.
 -> The output remains consistent and predictable.

 2. StringBuilder (not synchronized):
 -> Since StringBuilder is not thread-safe, multiple threads can modify it at the same time.
 -> This may lead to inconsistent output and data corruption in a multi-threaded environment.

 ✅ StringBuffer (Thread-Safe) → Output is consistent since synchronized ensures only one thread modifies it at a time.
 ❌ StringBuilder (Not Thread-Safe) → Output is inconsistent due to multiple threads modifying it simultaneously.
 */


class StringBufferClass {
    StringBuffer sb = new StringBuffer("Hello");

    synchronized void appendText(String text) {
        for (int i = 0; i < 3; i++) {
            sb.append(text);
            System.out.println(Thread.currentThread().getName() + " → " + sb);
        }
    }
}

class StringBuilderClass {
    StringBuilder sb = new StringBuilder("Hello");

    void appendText(String text) {
        for (int i = 0; i < 3; i++) {
            sb.append(text);
            System.out.println(Thread.currentThread().getName() + " → " + sb);
        }
    }
}

public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {

        // Thread-Safe Example with StringBuffer
        StringBufferClass sbfObj = new StringBufferClass();
        Thread t1 = new Thread(() -> sbfObj.appendText(" World"), "Thread-1");
        Thread t2 = new Thread(() -> sbfObj.appendText(" Java"), "Thread-2");

        // Not Thread-Safe Example with StringBuilder
        StringBuilderClass sbdObj = new StringBuilderClass();
        Thread t3 = new Thread(() -> sbdObj.appendText(" World"), "Thread-3");
        Thread t4 = new Thread(() -> sbdObj.appendText(" Java"), "Thread-4");

        System.out.println("🔹 Using StringBuffer (Thread-Safe):");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n🔹 Using StringBuilder (Not Thread-Safe):");
        t3.start();
        t4.start();
    }
}

/*
OUTPUT:
-------
🔹 Using StringBuffer (Thread-Safe):
Thread-1 → Hello World
Thread-1 → Hello World World
Thread-1 → Hello World World World
Thread-2 → Hello World World World Java
Thread-2 → Hello World World World Java Java
Thread-2 → Hello World World World Java Java Java

🔹 Using StringBuilder (Not Thread-Safe):
Thread-3 → Hello World
Thread-3 → Hello World Java World
Thread-4 → Hello World Java
Thread-4 → Hello World Java World World Java
Thread-3 → Hello World Java World World
Thread-4 → Hello World Java World World Java Java

 */
