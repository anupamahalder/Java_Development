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

## 🔶 **1. `HashSet`**
### ✅ Key Features:
- Stores **unique elements**.
- **No guaranteed order** of elements (insertion order is *not* preserved).
- **Allows one `null`** value.
- Backed by a **hash table**.
- Best for **search operations** (constant time in average case).

### 🧪 Example:
```java
Set<String> fruits = new HashSet<>();
fruits.add("Mango");
fruits.add("Banana");
fruits.add("Apple");
fruits.add("Banana");  // Duplicate will be ignored

System.out.println(fruits); // Order may vary
```

---

## 🔷 **2. `LinkedHashSet`**
### ✅ Key Features:
- Stores **unique elements**.
- **Maintains insertion order**.
- Allows **one `null`** value.
- Slower than `HashSet` but gives **predictable iteration order**.

### 🧪 Example:
```java
Set<String> colors = new LinkedHashSet<>();
colors.add("Red");
colors.add("Green");
colors.add("Blue");
colors.add("Red"); // Duplicate

System.out.println(colors); // Output: [Red, Green, Blue]
```

---

## 🔸 **3. `TreeSet`**
### ✅ Key Features:
- Stores **unique elements**.
- **Sorted in natural order** (or use custom `Comparator`).
- **Does NOT allow `null`** values (throws `NullPointerException`).
- Based on **Red-Black Tree** (self-balancing BST).
- Slower than `HashSet` and `LinkedHashSet`.

### 🧪 Example:
```java
Set<Integer> numbers = new TreeSet<>();
numbers.add(50);
numbers.add(10);
numbers.add(30);

System.out.println(numbers); // Output: [10, 30, 50]
```

---

## 📋 **Comparison Table:**

| Feature             | `HashSet`         | `LinkedHashSet`      | `TreeSet`            |
|---------------------|-------------------|-----------------------|-----------------------|
| Order               | ❌ No              | ✅ Insertion order     | ✅ Sorted order        |
| Allows `null`       | ✅ Yes (1 value)   | ✅ Yes (1 value)       | ❌ No                  |
| Performance         | ✅ Fastest         | ⚠️ Slightly slower     | ⚠️ Slowest             |
| Backed by           | Hash Table         | Hash Table + LinkedList | Red-Black Tree       |
| Thread-safe         | ❌ No              | ❌ No                  | ❌ No                  |

---
