# **Queue in Java**

The **`Queue`** interface in Java is part of the **Java Collection Framework (JCF)** and follows the **FIFO (First In, First Out)** principle. It is used to store elements **in an ordered manner**, where elements are **inserted from the rear** and **removed from the front**.

---

## **1️⃣ Key Features of `Queue`**
✔ **FIFO Order** → First element added is the first to be removed  
✔ **Efficient Operations** → `O(1)` time for `enqueue()` and `dequeue()`  
✔ **Supports Null Elements** → Only in `LinkedList`, but not in `PriorityQueue`  
✔ **Supports Iteration** → `for`, `forEach()`, `Iterator`  

---

## **2️⃣ Queue Interface & Implementations**
The `Queue` interface has **different implementations**, depending on the requirement:

| **Implementation** | **Characteristics** |
|-------------------|-------------------|
| `LinkedList` | Implements `Queue`, allows null, maintains insertion order |
| `PriorityQueue` | Maintains elements in a sorted order (natural or custom) |
| `ArrayDeque` | Faster than `LinkedList`, no capacity limit |
| `BlockingQueue` (concurrent) | Thread-safe implementation for producer-consumer scenarios |

---

## **3️⃣ Queue Methods**
| **Method** | **Description** |
|------------|----------------|
| `offer(E e)` | Inserts an element into the queue (returns `false` if full) |
| `add(E e)` | Adds an element (throws exception if full) |
| `poll()` | Retrieves and removes the head (returns `null` if empty) |
| `remove()` | Removes the head (throws exception if empty) |
| `peek()` | Retrieves, but does not remove, the head (returns `null` if empty) |
| `element()` | Retrieves, but does not remove, the head (throws exception if empty) |

---

## **4️⃣ Creating a Queue in Java**
We can create a `Queue` using different implementations.

### **Example 1: Basic `Queue` using `LinkedList`**
```java
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        System.out.println("Queue: " + queue);  // Output: [Apple, Banana, Cherry]

        // Peek at the head element
        System.out.println("Head: " + queue.peek()); // Apple

        // Removing elements
        System.out.println("Removed: " + queue.poll()); // Apple
        System.out.println("Queue after removal: " + queue); // [Banana, Cherry]
    }
}
```
✅ **Uses `offer()` instead of `add()` to avoid exceptions**  
✅ **FIFO Order Maintained**  

---

## **5️⃣ PriorityQueue (Sorted Order)**
A `PriorityQueue` maintains elements in **sorted order**, based on natural ordering or a custom comparator.

### **Example 2: Priority Queue (Natural Sorting)**
```java
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("Priority Queue: " + pq);  // Order may vary internally

        // Removing elements (sorted order)
        System.out.println("Removed: " + pq.poll()); // 10 (Smallest first)
        System.out.println("Updated Priority Queue: " + pq); // [20, 30]
    }
}
```
✅ **Elements are removed in sorted order**  
✅ **Does not maintain insertion order**  

---

## **6️⃣ Real-World Example: Customer Support System**
### **Example 3: Simulating a Customer Service Queue**
```java
import java.util.*;

public class CustomerSupportQueue {
    public static void main(String[] args) {
        Queue<String> supportQueue = new LinkedList<>();

        // Customers joining the queue
        supportQueue.offer("Alice");
        supportQueue.offer("Bob");
        supportQueue.offer("Charlie");

        // Serving customers
        while (!supportQueue.isEmpty()) {
            System.out.println("Serving: " + supportQueue.poll());
        }
    }
}
```
**🔹 Output:**
```
Serving: Alice
Serving: Bob
Serving: Charlie
```
✅ **Represents a real-world queue system**  
✅ **FIFO order maintained**  

---

## **7️⃣ ArrayDeque (Faster Alternative to LinkedList)**
`ArrayDeque` is more efficient than `LinkedList` for queue operations.

### **Example 4: Using `ArrayDeque` for Queue**
```java
import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(100);
        queue.offer(200);
        queue.offer(300);

        System.out.println("Queue: " + queue); // [100, 200, 300]

        // Removing
        System.out.println("Removed: " + queue.poll()); // 100
    }
}
```
✅ **Faster than `LinkedList`**  
✅ **No capacity limit**  

---

## **8️⃣ BlockingQueue (Thread-Safe Queue)**
### **Example 5: Producer-Consumer Using `BlockingQueue`**
```java
import java.util.concurrent.*;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Produced: " + i);
                queue.put(i); // Puts element into the queue (blocks if full)
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                Integer value = queue.take(); // Retrieves and removes (blocks if empty)
                System.out.println("Consumed: " + value);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}
```
✅ **Ensures thread-safe producer-consumer communication**  
✅ **Prevents race conditions**  

---

## **9️⃣ When to Use Which Queue?**
| **Scenario** | **Best Queue Type** |
|-------------|----------------|
| Simple FIFO queue | `LinkedList` |
| Performance-sensitive queue | `ArrayDeque` |
| Sorted elements | `PriorityQueue` |
| Thread-safe queue | `BlockingQueue` |

---

## **🔟 Conclusion**
✔ **Queues follow FIFO order**  
✔ **Different types of queues suit different needs**  
✔ **`PriorityQueue` sorts elements automatically**  
✔ **`BlockingQueue` handles thread-safe operations**  
