# **Map in Java**  

A **Map** in Java is a **key-value** data structure used to store unique keys with associated values. Unlike `List` and `Set`, `Map` **does not allow duplicate keys** but allows duplicate values.

---

## **1️⃣ Key Features of `Map`**
✔ **Stores data in key-value pairs**  
✔ **Keys must be unique** but values can be duplicated  
✔ **Fast retrieval** of values using keys  
✔ **Not part of the Collection framework** but exists in `java.util`  
✔ **Supports different implementations for various use cases**  

---

## **2️⃣ `Map` Implementations in Java**
Java provides different implementations of `Map` based on the requirements:

| **Implementation** | **Features** |
|------------------|--------------|
| `HashMap` | Fast, allows null key, unordered |
| `LinkedHashMap` | Maintains insertion order |
| `TreeMap` | Sorted order (ascending by default) |
| `Hashtable` | Thread-safe, no null keys or values |
| `ConcurrentHashMap` | Thread-safe, better for concurrency |

---

## **3️⃣ Commonly Used Methods in `Map`**
| **Method** | **Description** |
|------------|----------------|
| `put(K key, V value)` | Inserts a key-value pair |
| `get(K key)` | Retrieves value associated with the key |
| `remove(K key)` | Removes a key-value pair |
| `containsKey(K key)` | Checks if a key exists |
| `containsValue(V value)` | Checks if a value exists |
| `keySet()` | Returns all keys |
| `values()` | Returns all values |
| `entrySet()` | Returns all key-value pairs |

---

## **4️⃣ Creating a Basic `HashMap`**
The most commonly used implementation is `HashMap`.

### **Example 1: Basic HashMap Usage**
```java
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Retrieving a value
        System.out.println("Value for key 2: " + map.get(2)); // Banana

        // Iterating over the map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
```
**🔹 Output:**
```
Value for key 2: Banana
1 → Apple
2 → Banana
3 → Cherry
```
✅ **Stores unique keys**  
✅ **Fast lookups using `get()`**  
✅ **Random order (since `HashMap` does not maintain order)**  

---

## **5️⃣ Maintaining Order with `LinkedHashMap`**
`LinkedHashMap` maintains **insertion order**.

### **Example 2: Using `LinkedHashMap`**
```java
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        // Adding elements
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 28);

        // Iterating in insertion order
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
```
**🔹 Output:**
```
Alice → 25
Bob → 30
Charlie → 28
```
✅ **Maintains insertion order**  
✅ **Useful for caching scenarios**  

---

## **6️⃣ Sorted Map with `TreeMap`**
A `TreeMap` **sorts elements based on keys** (natural order or custom comparator).

### **Example 3: TreeMap (Sorted Order)**
```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");

        System.out.println("TreeMap: " + treeMap);
    }
}
```
**🔹 Output:**
```
TreeMap: {1=A, 2=B, 3=C}
```
✅ **Keys are sorted automatically**  
✅ **Useful for scenarios where sorting is required**  

---

## **7️⃣ Handling Concurrency with `ConcurrentHashMap`**
A `ConcurrentHashMap` is a **thread-safe version of `HashMap`**, used in multi-threaded environments.

### **Example 4: Using `ConcurrentHashMap`**
```java
import java.util.concurrent.*;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("Alice", 100);
        map.put("Bob", 200);

        System.out.println(map);
    }
}
```
✅ **Thread-safe operations**  
✅ **Avoids synchronization issues**  

---

## **8️⃣ Real-World Example: Employee Database**
Let's implement a **real-world example** using a `Map` to store employee details.

### **Example 5: Employee ID & Name Storage**
```java
import java.util.*;

public class EmployeeDatabase {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();

        // Adding employee details
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");

        // Retrieving employee names
        System.out.println("Employee 101: " + employees.get(101));

        // Iterating over employees
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
```
**🔹 Output:**
```
Employee 101: Alice
ID: 101, Name: Alice
ID: 102, Name: Bob
ID: 103, Name: Charlie
```
✅ **Efficiently maps IDs to Names**  
✅ **Retrieves data in `O(1)` time complexity using `get()`**  

---

## **9️⃣ When to Use Which `Map`?**
| **Scenario** | **Best Map Type** |
|-------------|----------------|
| Fast lookups and insertions | `HashMap` |
| Maintaining insertion order | `LinkedHashMap` |
| Sorted order based on keys | `TreeMap` |
| Thread-safe operations | `ConcurrentHashMap` |

---

## **🔟 Summary**
✔ **Maps store key-value pairs, ensuring unique keys**  
✔ **Different implementations offer various benefits (speed, order, sorting, concurrency)**  
✔ **Common methods: `put()`, `get()`, `remove()`, `containsKey()`, `entrySet()`**  
✔ **Use `TreeMap` for sorted keys, `ConcurrentHashMap` for thread safety**  
