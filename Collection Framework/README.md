## **Java Collection Framework (JCF)**

The **Java Collection Framework (JCF)** is a powerful **architecture** that provides a set of **classes and interfaces** for storing, processing, and manipulating **groups of objects** efficiently. It includes **List, Set, Queue, and Map** implementations.

---

Here's a **slightly deeper dive** into each concept, with **brief explanations and example syntax** to make it easy for you to understand and apply when learning the **Java Collection Framework**:

### ✅ **1. Package**
- A **package** is a way to group related classes and interfaces.
- Helps avoid name conflicts and organizes code.
- Java has built-in packages like `java.util`, `java.io`, etc.
- **Syntax:**
  ```java
  package mypackage;

  import java.util.ArrayList; // importing class from java.util
  ```

---

### ✅ **2. Interface**
- An **interface** contains abstract methods (no body).
- Classes **implement** interfaces and provide method definitions.
- **Syntax:**
  ```java
  interface Animal {
      void sound();  // abstract method
  }

  class Dog implements Animal {
      public void sound() {
          System.out.println("Bark");
      }
  }
  ```

---

### ✅ **3. Class**
- A **class** is a blueprint for creating objects.
- Can have:
  - **Fields** (variables)
  - **Constructors**
  - **Methods**
- **Syntax:**
  ```java
  class Person {
      String name;

      Person(String name) {
          this.name = name;
      }

      void sayHello() {
          System.out.println("Hello, " + name);
      }
  }
  ```

---

### ✅ **4. Wrapper Class**
- Converts **primitive types** into **objects**.
- Needed in collections (since they store objects).
- Examples: `int` → `Integer`, `char` → `Character`
- **Syntax:**
  ```java
  int a = 10;
  Integer obj = Integer.valueOf(a);  // Boxing
  int b = obj.intValue();            // Unboxing
  ```

---

### ✅ **5. Generics**
- Allow writing code that works with any data type.
- Adds **type safety** and reduces casting.
- Used heavily in Collection classes like `ArrayList`, `HashMap`.
- **Syntax:**
  ```java
  ArrayList<String> names = new ArrayList<>();
  names.add("Anu");
  String name = names.get(0); // No need to cast
  ```

---

### ✅ **6. Object**
- An **object** is an instance of a class.
- It can access all non-static fields and methods of the class.
- **Syntax:**
  ```java
  Person p1 = new Person("Anu");
  p1.sayHello(); // Output: Hello, Anu
  ```

---

### ✅ **7. Iterator**
- Used to loop through elements of a Collection one by one.
- **Methods:**
  - `hasNext()`: returns true if there is a next element.
  - `next()`: returns the next element.
  - `remove()`: removes the current element (optional).
- **Syntax:**
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("A");
  list.add("B");

  Iterator<String> it = list.iterator();
  while(it.hasNext()) {
      System.out.println(it.next());
  }
  ```

---

### ✅ **8. Collection**
- **Collection** is the root interface of Java Collections Framework.
- It represents a **group of objects**, known as **elements**.
- Subinterfaces include:
  - `List` → allows duplicates, ordered.
  - `Set` → no duplicates, unordered.
  - `Queue` → follows FIFO.
- **Syntax:**
  ```java
  Collection<String> coll = new ArrayList<>();
  coll.add("One");
  coll.add("Two");
  ```

---

### ✅ **9. Array**
- A data structure that holds **fixed-size** values of the same type.
- Less flexible than Collections.
- **Syntax:**
  ```java
  int[] arr = new int[5]; // Declares array of size 5
  arr[0] = 10;
  System.out.println(arr[0]);
  ```

---

### ✅ **10. Comparator**
- Used to define custom sorting logic.
- Can be passed to `Collections.sort()` or used in `TreeSet`, etc.
- **Syntax:**
  ```java
  List<String> names = Arrays.asList("Anu", "Rita", "Kiran");

  Collections.sort(names, new Comparator<String>() {
      public int compare(String a, String b) {
          return b.length() - a.length(); // descending by length
      }
  });
  ```

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
