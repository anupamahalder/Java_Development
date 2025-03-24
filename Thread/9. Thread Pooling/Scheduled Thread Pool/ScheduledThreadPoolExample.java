/*
Scheduled Thread Pool (Scheduled Execution)

🔹 What is it?

Schedules tasks at fixed intervals or after delays.
Ideal for automated tasks like backups, monitoring, or reminders.

Example: Scheduling a Task with Scheduled Thread Pool

🔹 Explanation
Executors.newScheduledThreadPool(2) creates a thread pool for scheduled execution.
First task: Executes once after 2 seconds.
Second task: Repeats every 3 seconds.
Shutdown task: Stops execution after 10 seconds.
*/
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2); // 2 threads

        Runnable task = () -> System.out.println("Executing Task at " + System.currentTimeMillis());

        // Schedule the task to run after 2 seconds delay
        scheduler.schedule(task, 2, TimeUnit.SECONDS);

        // Schedule the task to repeat every 3 seconds, after an initial delay of 1 second
        scheduler.scheduleAtFixedRate(task, 1, 3, TimeUnit.SECONDS);

        // Scheduler will be shut down after 10 seconds
        scheduler.schedule(() -> {
            System.out.println("Shutting down scheduler...");
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}
/*
OUTPUT:
-------
Executing Task at 1742840684962
Executing Task at 1742840685957
Executing Task at 1742840687961
Executing Task at 1742840690960
Executing Task at 1742840693960
Shutting down scheduler...

*/  
