# 🔷 **What is Set in Java?**

- **Set** is a **Collection** that **does not allow duplicate elements**.
- It's used to **store unique elements**.
- It is part of the `java.util` package.

---

### 🔸 **Main Implementations of Set:**

| Class         | Characteristics                                                                 |
|---------------|----------------------------------------------------------------------------------|
| `HashSet`     | ✅ No duplicates, ❌ No ordering, ❌ Not sorted                                    |
| `LinkedHashSet` | ✅ Maintains **insertion order**, ❌ Not sorted                                  |
| `TreeSet`     | ✅ **Sorted**, ✅ No duplicates, ✅ Uses **natural ordering** or custom `Comparator` |

---

### 🔹 **Set Interface Syntax Example:**

```java
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");  // Duplicate - will not be added

        System.out.println(set); // Output: [Apple, Banana, Mango] - unordered
    }
}
```

---

### 🧠 **Important Points:**
- **Set doesn't allow indexing** (no `get(index)` method).
- **Set automatically handles duplicates** (ignores duplicates silently).
- **Set uses `equals()` and `hashCode()`** to check for duplicates (especially in `HashSet`).

---

### 🔸 **Differences Between Set Implementations:**

| Feature           | `HashSet`       | `LinkedHashSet`     | `TreeSet`         |
|------------------|-----------------|----------------------|-------------------|
| Ordering         | ❌ No            | ✅ Insertion order   | ✅ Sorted order    |
| Null allowed?    | ✅ Yes (1 only)  | ✅ Yes (1 only)      | ⚠️ No null allowed |
| Thread-Safe?     | ❌ No            | ❌ No                | ❌ No              |
| Performance      | ✅ Fastest       | Slightly slower      | ⚠️ Slower          |

---
