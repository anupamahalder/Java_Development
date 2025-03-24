/*
Fixed Thread Pool (Limited Number of Threads)

🔹 What is it?
Creates a fixed number of threads.
Ideal for scenarios where the number of tasks is predictable.

Example: Processing 5 tasks with a Fixed Thread Pool

🔹 Explanation
A fixed pool of 3 threads is created using Executors.newFixedThreadPool(3).
5 tasks are submitted. Since we have only 3 threads, tasks execute in batches.
executor.shutdown() ensures the thread pool stops after completing all tasks.
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private final int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    public void run() {
        System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);  // Simulate task execution
        } catch (InterruptedException e) {
            System.out.println("Task " + taskId + " interrupted.");
        }
        System.out.println("Task " + taskId + " completed.");
    }
}

public class FixedThreadPoolExample { 
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Pool of 3 threads

        // Submitting 5 tasks
        for (int i = 1; i <= 5; i++) {
            executor.execute(new Task(i));
        }

        executor.shutdown();  // Shutdown after tasks are done
    }
}

/*
OUTPUT:
-------
Task 1 is being executed by pool-1-thread-1
Task 3 is being executed by pool-1-thread-3
Task 2 is being executed by pool-1-thread-2
Task 1 completed.
Task 2 completed.
Task 4 is being executed by pool-1-thread-1
Task 3 completed.
Task 5 is being executed by pool-1-thread-2
Task 5 completed.
Task 4 completed.

*/
