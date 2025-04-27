# 🔄 **What is a Queue?**

A **Queue** is a **linear data structure** that follows the **FIFO (First In, First Out)** principle.

> Think of a queue like a **line at a ticket counter** — whoever comes first gets served first.

---

### 🧩 **Queue Interface (java.util.Queue)**

The `Queue` interface is a part of the **`java.util` package** and **extends the Collection interface**.

It is implemented by classes like:
- `LinkedList`
- `PriorityQueue`
- `ArrayDeque`

---

### 📦 **Important Methods of Queue Interface**

| Method         | Description                                |
|----------------|--------------------------------------------|
| `add(E e)`     | Inserts element, throws exception if fails |
| `offer(E e)`   | Inserts element, returns false if fails    |
| `remove()`     | Removes and returns head, throws exception |
| `poll()`       | Removes and returns head, or null if empty |
| `element()`    | Returns head, throws exception if empty    |
| `peek()`       | Returns head, or null if empty             |

---

### 🔸 Implementations of Queue

---

#### ✅ 1. **LinkedList**

- Can be used as a **Queue** (or even as a Deque, List, Stack).
- Supports **null** elements.

```java
Queue<String> queue = new LinkedList<>();
queue.add("Apple");
queue.add("Banana");
System.out.println(queue.poll()); // Apple
```

---

#### ✅ 2. **PriorityQueue**

- Elements are stored **based on priority** (natural or custom).
- **Not thread-safe**, doesn't allow `null`.

```java
Queue<Integer> pq = new PriorityQueue<>();
pq.add(30);
pq.add(10);
pq.add(20);
System.out.println(pq.poll()); // 10 (smallest first)
```

---

#### ✅ 3. **ArrayDeque**

- Faster than `LinkedList`, **no capacity restrictions**.
- Cannot store `null`.

```java
Queue<String> adq = new ArrayDeque<>();
adq.offer("Java");
adq.offer("Python");
System.out.println(adq.peek()); // Java
```

---

### ⚖️ **Why Use Queues?**

- **Task scheduling** (OS)
- **Print job queue**
- **Messaging systems**
- **Resource sharing** in multi-threading

---

### 📌 Summary Table

| Class          | Ordered? | Sorted? | Null Allowed? | Thread-safe? |
|----------------|----------|---------|---------------|---------------|
| `LinkedList`   | ✅ Yes    | ❌ No   | ✅ Yes         | ❌ No         |
| `PriorityQueue`| ✅ Yes    | ✅ Yes  | ❌ No          | ❌ No         |
| `ArrayDeque`   | ✅ Yes    | ❌ No   | ❌ No          | ❌ No         |

---

### 🔁 **1. What is `Deque`?**

- `Deque` stands for **Double-Ended Queue**.
- It’s an **interface** in the `java.util` package.
- Allows **insertion and deletion** of elements **from both ends** (front and rear).
- It extends the `Queue` interface.

```java
Deque<String> deque;
```

---

### 📦 **2. What is `ArrayDeque`?**

- `ArrayDeque` is a **class** that implements the `Deque` interface.
- It uses a **resizable array** to store elements.
- It is **faster than `LinkedList`** and has **no capacity limits**.
- **Does not allow `null` elements.**

```java
Deque<String> deque = new ArrayDeque<>();
```

---

### ✅ **Basic Example**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Java");
        deque.addLast("Python");
        deque.add("C++"); // same as addLast

        System.out.println(deque); // [Java, Python, C++]

        System.out.println("Removed: " + deque.removeFirst()); // Java
        System.out.println("Removed: " + deque.removeLast());  // C++
    }
}
```

---

### 📊 **Comparison Table**

| Feature             | `Deque` (Interface)      | `ArrayDeque` (Class)               |
|---------------------|---------------------------|-------------------------------------|
| Type                | Interface                 | Concrete class                     |
| Can instantiate?    | ❌ No                     | ✅ Yes                              |
| Implements          | —                         | `Deque`, `Queue`                   |
| Allows null         | —                         | ❌ No                              |
| Thread-safe         | —                         | ❌ No                              |
| Backed by           | —                         | Array                              |
| Performance         | —                         | Faster than `LinkedList`           |

---

### ✅ **Conclusion**

- Use `Deque` when you want **flexibility** with **implementations** (`LinkedList`, `ArrayDeque`).
- Use `ArrayDeque` when you need a **high-performance, non-thread-safe deque**.
---
