## **Java Collection Framework (JCF)**

The **Java Collection Framework (JCF)** is a powerful **architecture** that provides a set of **classes and interfaces** for storing, processing, and manipulating **groups of objects** efficiently. It includes **List, Set, Queue, and Map** implementations.

---

## **1️⃣ Why Use the Java Collection Framework?**
🔹 **Better Performance** - Provides optimized data structures.  
🔹 **Code Reusability** - Eliminates the need for custom implementations.  
🔹 **Flexibility** - Supports dynamic resizing (e.g., `ArrayList`).  
🔹 **Thread-Safety** - Offers concurrent collections like `ConcurrentHashMap`.  
🔹 **Ease of Use** - Predefined methods (e.g., `add()`, `remove()`, `contains()`).  

---

## **2️⃣ Hierarchy of Java Collection Framework**
The Java Collection Framework consists of **interfaces** and **classes**.

```
         Collection (Interface)
               │
    ┌───────-──┴────-----─────┐
    │                         │
   List                      Set
    │                         │
 ┌──┴--------──┐         ┌────┴───---─┐
ArrayList LinkedList   HashSet     TreeSet
                            
       Map (Interface)    
        │           
 ┌──────┴──────┐       
HashMap      TreeMap
```

🔹 **Collection Interface** → Super interface of `List`, `Set`, `Queue`  
🔹 **Map Interface** → Stores key-value pairs (not part of Collection hierarchy)

---

## **3️⃣ Java Collections - Key Interfaces & Classes**
| **Interface** | **Implementation Classes** | **Key Features** |
|--------------|-------------------------|----------------|
| **List** | `ArrayList`, `LinkedList`, `Vector`, `Stack` | Ordered, allows duplicates |
| **Set** | `HashSet`, `LinkedHashSet`, `TreeSet` | Unordered (except `TreeSet`), no duplicates |
| **Queue** | `PriorityQueue`, `Deque`, `ArrayDeque` | FIFO (First-In-First-Out) |
| **Map** | `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable` | Key-Value pairs |

---

## **4️⃣ Java Collections with Real-World Examples**

### **📌 1. List (Ordered Collection)**
A **List** maintains **insertion order** and allows **duplicates**.

#### **Example: Using ArrayList**
```java
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Alice");  // Duplicates allowed

        System.out.println("Student List: " + students);
        System.out.println("Get element at index 1: " + students.get(1));

        students.remove("Bob");
        System.out.println("After removing Bob: " + students);
    }
}
```
**🔹 Output:**
```
Student List: [Alice, Bob, Charlie, Alice]
Get element at index 1: Bob
After removing Bob: [Alice, Charlie, Alice]
```
✅ **Ordered & allows duplicates**  
✅ **Indexed access (`get()`, `remove()`)**  

---

### **📌 2. Set (Unique Elements)**
A **Set** contains **only unique elements** and does **not allow duplicates**.

#### **Example: Using HashSet**
```java
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("New York");  // Duplicate ignored

        System.out.println("Cities: " + cities);
        System.out.println("Contains London? " + cities.contains("London"));

        cities.remove("Paris");
        System.out.println("After removing Paris: " + cities);
    }
}
```
**🔹 Output:**
```
Cities: [New York, London, Paris]
Contains London? true
After removing Paris: [New York, London]
```
✅ **Unordered, Unique elements only**  
✅ **No indexing (`get()` not supported)**  

---

### **📌 3. Queue (FIFO - First In, First Out)**
A **Queue** follows the **FIFO (First-In-First-Out)** principle.

#### **Example: Using PriorityQueue**
```java
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(20);

        System.out.println("Queue: " + queue);
        System.out.println("Head of queue: " + queue.peek());

        queue.poll(); // Removes the head (smallest element)
        System.out.println("After poll: " + queue);
    }
}
```
**🔹 Output:**
```
Queue: [5, 10, 20]
Head of queue: 5
After poll: [10, 20]
```
✅ **Maintains priority order**  
✅ **Removes elements in FIFO order**  

---

### **📌 4. Map (Key-Value Pairs)**
A **Map** stores **key-value pairs**, allowing quick lookups.

#### **Example: Using HashMap**
```java
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> empMap = new HashMap<>();
        empMap.put(101, "Alice");
        empMap.put(102, "Bob");
        empMap.put(103, "Charlie");

        System.out.println("Employee Map: " + empMap);
        System.out.println("Employee with ID 102: " + empMap.get(102));

        empMap.remove(103);
        System.out.println("After removing ID 103: " + empMap);
    }
}
```
**🔹 Output:**
```
Employee Map: {101=Alice, 102=Bob, 103=Charlie}
Employee with ID 102: Bob
After removing ID 103: {101=Alice, 102=Bob}
```
✅ **Efficient key-value storage**  
✅ **Unique keys, fast retrieval (`get()`)**  

---

## **5️⃣ When to Use Which Collection?**
| **Scenario** | **Best Collection** | **Why?** |
|-------------|-----------------|-----------------|
| Store ordered elements with duplicates | `ArrayList` | Fast access (`get()`) |
| Store unique elements, no duplicates | `HashSet` | Ensures uniqueness |
| First-In-First-Out processing | `Queue` | Manages tasks efficiently |
| Store key-value pairs | `HashMap` | Quick lookup (`get()`) |
| Maintain sorted elements | `TreeSet` / `TreeMap` | Keeps order sorted |

---

## **6️⃣ Thread-Safe Collections**
| **Non-Synchronized Collection** | **Thread-Safe Alternative** |
|-----------------|----------------------|
| `ArrayList` | `CopyOnWriteArrayList` |
| `HashSet` | `CopyOnWriteArraySet` |
| `HashMap` | `ConcurrentHashMap` |

---

## **✅ Conclusion**
🔹 The **Java Collection Framework (JCF)** provides **efficient** data structures.  
🔹 **List, Set, Queue, and Map** are core collections for **various use cases**.  
🔹 **Thread-safe collections** are available for multi-threaded applications.  
