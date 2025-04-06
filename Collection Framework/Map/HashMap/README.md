## 🌟 What is `HashMap`?

`HashMap<K, V>` is a part of the `java.util` package that **stores data in key-value pairs**. It uses a **hashing technique** to store and retrieve elements quickly (in average constant time `O(1)`).

---

### 🔑 Key Features of `HashMap`:
- **Implements** `Map` interface.
- **Allows one null key** and **multiple null values**.
- **Not synchronized** (i.e., not thread-safe by default).
- **No guarantee of order** of elements.
- **Duplicates not allowed for keys** — if a key already exists, its value is updated.

---

### 🧠 Internal Working (Simplified):

- `HashMap` uses an **array of buckets** (also called "buckets").
- It calculates a **hash code** of the key, then applies modulo operation to get the bucket index.
- If two keys map to the same bucket (hash collision), a **linked list or tree** is used at that index.
- Since Java 8, if the number of items in a bucket exceeds a threshold, it converts to a **Red-Black Tree** to improve performance.

---

### 🛠️ Common Methods:

```java
put(K key, V value)             // Adds or updates a key-value pair
get(Object key)                 // Returns value for key
remove(Object key)              // Deletes a key-value pair
containsKey(Object key)         // Checks if a key exists
containsValue(Object value)     // Checks if a value exists
isEmpty()                       // Checks if map is empty
size()                          // Returns number of key-value pairs
keySet()                        // Returns Set of keys
entrySet()                      // Returns Set of Map.Entry (key-value pairs)
```

---

### 📌 Example:

```java
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding entries
        map.put("Java", 90);
        map.put("Python", 95);
        map.put("C++", 85);
        map.put(null, 70);         // One null key allowed
        map.put("Java", 100);      // Updates the value for "Java"

        // Accessing entries
        System.out.println("Java score: " + map.get("Java"));

        // Iterating
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Removing an entry
        map.remove("C++");

        System.out.println("After removal: " + map);
    }
}
```

---

### 🧩 Use Cases:
- Caching (e.g., store recent search queries)
- Representing mappings (e.g., student name → marks)
- Counting frequencies (e.g., word count)
- Storing configuration/settings

---

### ⚠️ HashMap vs. Other Maps:

| Feature              | HashMap   | LinkedHashMap | TreeMap   |
|----------------------|-----------|----------------|-----------|
| Order                | Unordered | Insertion order | Sorted by keys |
| Null keys            | ✅ 1 allowed | ✅ 1 allowed     | ❌ Not allowed |
| Thread-safe          | ❌ No     | ❌ No           | ❌ No     |
| Performance (avg)    | O(1)      | O(1)            | O(log n) |
