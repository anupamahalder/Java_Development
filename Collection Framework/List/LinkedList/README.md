# **🔹 LinkedList in Java**  

A **LinkedList** in Java is a part of the **Java Collections Framework** and implements the **List** and **Deque** interfaces. Unlike `ArrayList`, which is backed by a **dynamic array**, `LinkedList` is based on a **doubly linked list**, allowing for efficient insertions and deletions.

---

### **1️⃣ Key Features of LinkedList**  
✅ **Dynamic Size** – It grows and shrinks dynamically.  
✅ **Faster Insertions/Deletions** – Adding/removing elements is efficient (O(1) if at the beginning or end).  
✅ **Slower Random Access** – Accessing elements takes **O(n)** time, unlike **ArrayList** which is **O(1)**.  
✅ **Doubly Linked List** – Each node contains a reference to both **next** and **previous** elements.  

---

### **2️⃣ Creating a LinkedList**
```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        System.out.println("Cities: " + cities);
    }
}
```
📌 **Output:**  
`Cities: [New York, Los Angeles, Chicago]`  

---

### **3️⃣ Common Operations on LinkedList**
| **Operation** | **Method** | **Description** |
|-------------|----------|----------------|
| **Add Element** | `add(E e)` | Adds at the end |
| **Add at Index** | `add(int index, E e)` | Inserts at a specific position |
| **Add First** | `addFirst(E e)` | Inserts at the beginning |
| **Add Last** | `addLast(E e)` | Inserts at the end |
| **Remove Element** | `remove(E e)` | Removes first occurrence |
| **Remove at Index** | `remove(int index)` | Removes by index |
| **Remove First** | `removeFirst()` | Removes the first element |
| **Remove Last** | `removeLast()` | Removes the last element |
| **Get Element** | `get(int index)` | Retrieves an element |
| **Get First** | `getFirst()` | Retrieves first element |
| **Get Last** | `getLast()` | Retrieves last element |
| **Size of List** | `size()` | Returns the number of elements |

---

### **4️⃣ Example Covering All Operations**
```java
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Add at a specific position
        list.add(1, "Mango");

        // Add elements at first & last positions
        list.addFirst("Grapes");
        list.addLast("Pineapple");

        System.out.println("LinkedList after additions: " + list);

        // Access elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements
        list.remove("Banana");
        list.removeFirst();
        list.removeLast();

        System.out.println("LinkedList after removals: " + list);

        // Checking size
        System.out.println("Size of LinkedList: " + list.size());
    }
}
```
📌 **Output:**  
```
LinkedList after additions: [Grapes, Apple, Mango, Banana, Cherry, Pineapple]
First element: Grapes
Last element: Pineapple
Element at index 2: Mango
LinkedList after removals: [Apple, Mango, Cherry]
Size of LinkedList: 3
```

---

### **5️⃣ When to Use LinkedList vs. ArrayList?**
| Feature | **LinkedList** | **ArrayList** |
|------------|--------------|--------------|
| **Insertion/Deletion** | Faster (O(1) at head/tail) | Slower (O(n) shifting required) |
| **Random Access** | Slower (O(n)) | Faster (O(1)) |
| **Memory Usage** | More (extra pointers for nodes) | Less (just array storage) |
| **Iteration** | Slower | Faster |
| **Use Case** | When frequent insertions/deletions are needed | When frequent access/searching is needed |
