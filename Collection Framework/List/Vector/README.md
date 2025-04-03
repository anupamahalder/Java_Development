# **📌 Vector in Java (Compared to ArrayList)**
A **Vector** in Java is a **resizable (dynamic) array**, similar to `ArrayList`, but it is **synchronized** (thread-safe).  

---

## **🔹 Key Features of Vector**
✅ **Thread-Safe** → It is synchronized, making it safe for multi-threading.  
✅ **Resizable** → Can grow dynamically, like an `ArrayList`.  
✅ **Legacy Class** → Introduced before Java 2 (`ArrayList` was introduced later).  
✅ **Slow Performance** → Due to synchronization overhead, it is **slower than `ArrayList`**.  

---

## **📌 Difference: Vector vs ArrayList**
| Feature | `Vector` | `ArrayList` |
|---------|---------|------------|
| **Synchronization** | Yes (Thread-safe) | No (Not synchronized) |
| **Performance** | Slower (Locks used) | Faster (No locks) |
| **Growth Rate** | Doubles its size | Grows by 50% |
| **Use Case** | Multi-threaded apps | Single-threaded apps |

---

## **💻 Code Example: Vector in Java**
```java
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> cities = new Vector<>();

        // Add elements to the Vector
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Delhi");

        // Print the Vector
        System.out.println("Vector elements: " + cities);

        // Accessing an element
        System.out.println("First city: " + cities.get(0));

        // Remove an element
        cities.remove("Tokyo");
        System.out.println("After removing Tokyo: " + cities);

        // Checking if an element exists
        System.out.println("Does it contain Delhi? " + cities.contains("Delhi"));

        // Iterating over the Vector
        System.out.println("Cities in the Vector:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
```

---

## **📌 Output**
```
Vector elements: [New York, London, Tokyo, Delhi]
First city: New York
After removing Tokyo: [New York, London, Delhi]
Does it contain Delhi? true
Cities in the Vector:
New York
London
Delhi
```

---

## **📌 When to Use `Vector`?**
✅ **When you need thread safety** (e.g., in multi-threaded applications).  
✅ **When working with legacy code** (before Java 2).  
❌ **Avoid it for performance-critical applications** → Use `ArrayList` instead.  

