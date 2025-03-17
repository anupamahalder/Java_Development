/*
1️⃣ StringBuffer is thread-safe → It ensures synchronized modifications across multiple threads.
2️⃣ Multiple threads operate on the same object → That’s why we see merged outputs.
3️⃣ Execution order is unpredictable → Depends on Java's thread scheduling.
4️⃣ Using StringBuilder instead of StringBuffer would cause inconsistencies in multi-threaded environments.
 */

class MultiThreadStringBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Thread ");

        // Runnable Task to modify StringBuffer
        Runnable task = () -> {
            for (int i = 1; i <= 3; i++) {
                sb.append(i);
                System.out.println(Thread.currentThread().getName() + " → " + sb);
            }
        };

        // Creating two threads
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}

/*
OUTPUT:
-------
Thread-1 → Thread 1
Thread-1 → Thread 112
Thread-1 → Thread 1123
Thread-2 → Thread 11
Thread-2 → Thread 11232
Thread-2 → Thread 112323

 */
