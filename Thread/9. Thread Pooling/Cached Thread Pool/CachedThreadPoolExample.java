/*
Cached Thread Pool (Dynamic Number of Threads)

🔹 What is it?
Creates threads as needed.
Ideal for short-lived tasks with varying workloads.

Example: Processing tasks with a Cached Thread Pool

🔹 Explanation
Executors.newCachedThreadPool() creates new threads as needed.
If a thread is idle, it is reused for new tasks.
Best for handling unpredictable workloads.
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskId + " interrupted.");
                }
                System.out.println("Task " + taskId + " completed.");
            });
        }

        executor.shutdown();
    }
}
/* 
OUTPUT:
-------
Task 1 is being executed by pool-1-thread-1
Task 5 is being executed by pool-1-thread-5
Task 4 is being executed by pool-1-thread-4
Task 2 is being executed by pool-1-thread-2
Task 3 is being executed by pool-1-thread-3
Task 3 completed.
Task 2 completed.
Task 4 completed.
Task 1 completed.
Task 5 completed.

*/
