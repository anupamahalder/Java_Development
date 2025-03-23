/* 
✅ Inter-Thread Communication in Java (Producer-Consumer Problem)
🔹 wait() → Makes a thread wait until another thread notifies it.  
🔹 notify() → Wakes up a single thread waiting on the object's monitor.  
🔹 notifyAll() → Wakes up all threads waiting on the object's monitor.  
🔹 Used in multi-threading scenarios like the Producer-Consumer problem.

🚀 Code: Producer-Consumer using wait() & notify()
💡 Scenario: A producer thread produces an item and adds it to a shared buffer, while a consumer thread consumes the item.  

📝 Explanation:
1️⃣ SharedBuffer Class
   - produce() (Producer method) → Produces data and notifies the consumer.  
   - consume() (Consumer method) → Consumes data and notifies the producer.
   - Uses synchronized to ensure thread safety.  
   - Uses wait() when no action is needed and notify() to wake up the other thread.

2️⃣ Producer Thread  
   - Calls produce() to add data to the buffer.  
   - Sleeps for 500ms to simulate production time.  

3️⃣ Consumer Thread
   - Calls consume() to take data from the buffer.  
   - Sleeps for 1000ms to simulate processing time. 


✅ Key Takeaways:
✔ wait() → Makes a thread wait until another thread calls notify().  
✔ notify() → Wakes up one waiting thread.  
✔ notifyAll() → Wakes up all waiting threads.  
✔ Synchronization ensures only one thread modifies shared data at a time.  
✔ Producer-Consumer is a classic example of inter-thread communication.
*/

class SharedBuffer {
    private int data;
    private boolean hasData = false;  // Flag to check if data is available

    // Producer method
    public synchronized void produce(int value) {
        while (hasData) {  // If data exists, wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        hasData = true;
        notify();  // Notify the consumer
    }

    // Consumer method
    public synchronized void consume() {
        while (!hasData) {  // If no data, wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify();  // Notify the producer
    }
}

// Producer Thread
class Producer extends Thread {
    SharedBuffer buffer;

    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);  // Producing items
            try {
                Thread.sleep(500);  // Simulating production delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    SharedBuffer buffer;

    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();  // Consuming items
            try {
                Thread.sleep(1000);  // Simulating consumption delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main Class
public class ProducerConsumer { 
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}

/*
OUTPUT:
-------
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3
Produced: 4
Consumed: 4
Produced: 5
Consumed: 5
*/
