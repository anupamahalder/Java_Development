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
