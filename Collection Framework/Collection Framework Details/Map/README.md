## 🔹 Key Features of `Map`:
- **Key-value mapping**: Each element in a Map is a pair (key, value).
- **Unique keys**: Keys must be unique, but values can be duplicated.
- **No defined ordering**: Unless a specific Map implementation provides it (like `TreeMap` or `LinkedHashMap`).

---

### 🔸 Common Implementations of Map

| Class              | Description |
|-------------------|-------------|
| `HashMap`         | Most commonly used. Allows `null` keys and values. No ordering. |
| `LinkedHashMap`   | Maintains insertion order. |
| `TreeMap`         | Sorted by natural order or custom comparator. Doesn't allow `null` keys. |
| `Hashtable`       | Legacy class, synchronized, doesn't allow `null` keys or values. |
| `ConcurrentHashMap` | Thread-safe alternative to `HashMap` for concurrent access. |

---

### 🔹 Important Methods in Map Interface

| Method                          | Description |
|---------------------------------|-------------|
| `put(K key, V value)`           | Adds or updates a key-value pair |
| `get(Object key)`               | Returns the value for the given key |
| `remove(Object key)`            | Removes the key and its value |
| `containsKey(Object key)`       | Checks if a key exists |
| `containsValue(Object value)`   | Checks if a value exists |
| `keySet()`                      | Returns a Set of all keys |
| `values()`                      | Returns a Collection of all values |
| `entrySet()`                    | Returns a Set of key-value pairs (`Map.Entry`) |

---

### 🔸 Example:

```java
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);
        
        System.out.println("Map: " + map);
        System.out.println("Value for Apple: " + map.get("Apple"));
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
```

---

### 🔹 When to Use Map?

- When you need to associate **unique keys with specific values**.
- Useful in scenarios like:
  - Dictionary lookups
  - Caching mechanisms
  - Counting frequency of elements

---

### 🔹 1. **HashMap**
- **Most commonly used Map implementation**.
- **Stores entries in a hash table**.
- No guaranteed order of keys.
- Allows **one null key** and multiple null values.
- **Not synchronized** (not thread-safe).
  
**Use when**: You need fast lookups and don't care about order.

```java
Map<String, Integer> map = new HashMap<>();
```

---

### 🔹 2. **LinkedHashMap**
- Extends `HashMap`.
- **Maintains insertion order** of keys.
- Slightly slower than `HashMap` due to ordering overhead.
- Also allows one null key and multiple null values.
  
**Use when**: You want fast access *and* predictable iteration order.

```java
Map<String, Integer> map = new LinkedHashMap<>();
```

---

### 🔹 3. **TreeMap**
- Stores entries in a **sorted (ascending) order** based on keys.
- Internally uses a **Red-Black Tree**.
- **Does not allow null keys** (throws `NullPointerException`).
- Can use custom `Comparator` for custom sorting.
- Slower than `HashMap` for basic operations.
  
**Use when**: You need a **sorted map** or range-based operations.

```java
Map<String, Integer> map = new TreeMap<>();
```

---

### 🔹 4. **Hashtable** (Legacy)
- **Synchronized** version of `HashMap`.
- **Thread-safe**, but slower due to synchronization overhead.
- Does **not allow null keys or values**.
- Considered **legacy**, use `ConcurrentHashMap` instead for concurrency.

**Use when**: You need thread safety but aren’t using concurrent collections.

```java
Map<String, Integer> map = new Hashtable<>();
```

---

### 🔹 5. **ConcurrentHashMap**
- Part of **java.util.concurrent** package.
- Designed for **multi-threaded environments**.
- Better concurrency than `Hashtable` (divides map into segments).
- **Does not allow null keys or null values**.

**Use when**: You need a thread-safe map with better performance than `Hashtable`.

```java
Map<String, Integer> map = new ConcurrentHashMap<>();
```

---

### 🔹 Summary Table

| Class              | Order       | Thread Safe | Null Keys | Null Values | Use-case |
|-------------------|-------------|-------------|-----------|-------------|----------|
| `HashMap`         | No          | No          | 1         | Yes         | General-purpose |
| `LinkedHashMap`   | Insertion   | No          | 1         | Yes         | Predictable iteration |
| `TreeMap`         | Sorted      | No          | No        | Yes         | Sorted maps |
| `Hashtable`       | No          | Yes         | No        | No          | Legacy thread-safe |
| `ConcurrentHashMap` | No        | Yes (high)  | No        | No          | Concurrent use |

---
