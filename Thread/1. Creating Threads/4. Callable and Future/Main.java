/*
Using Callable and Future (Return Value from Thread)

🔹 Explanation:
- Callable is used when we want a thread to return a result.
- Future is used to retrieve the result.
- ExecutorService manages thread execution.
*/

import java.util.concurrent.*;

class MyCallable implements Callable<String> {
    public String call() throws Exception {
        return "Thread executed and returned result!";
    }
}
public class Main{
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> result = executor.submit(new MyCallable()); // Submitting task
        System.out.println(result.get()); // Getting result from thread
        executor.shutdown();
    }
}

/* 
OUTPUT:
-------
Thread executed and returned result!

*/
