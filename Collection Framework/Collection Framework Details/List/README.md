# ✅ What is `List`?
- `List` is an **interface** in the `java.util` package that **extends** the `Collection` interface.
- It represents an **ordered collection (sequence)** of elements.
- **Allows duplicates**, meaning you can add the same element multiple times.
- Elements are **indexed**, so you can access them by position.

---

### ✅ Common Implementations of `List`
| Implementation      | Description |
|---------------------|-------------|
| `ArrayList`         | Dynamic array; fast in retrieval, slow in insertion/removal (especially in the middle). |
| `LinkedList`        | Doubly-linked list; fast in insertion/deletion, slower in random access. |
| `Vector`            | Synchronized version of `ArrayList` (less used now). |
| `Stack`             | A subclass of `Vector` implementing LIFO (Last In, First Out). |

---

### ✅ Commonly Used Methods
| Method                    | Description |
|---------------------------|-------------|
| `add(E e)`                | Adds an element |
| `add(int index, E e)`     | Adds element at specific index |
| `get(int index)`          | Gets element at index |
| `remove(int index)`       | Removes element at index |
| `set(int index, E e)`     | Updates element at index |
| `contains(Object o)`      | Checks if element exists |
| `size()`                  | Returns number of elements |
| `clear()`                 | Removes all elements |
| `isEmpty()`               | Checks if list is empty |

---

### ✅ Example: Using `ArrayList`
```java
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // Add elements
        names.add("Anu");
        names.add("Rita");
        names.add("Anu"); // duplicate allowed

        // Access elements
        System.out.println("First name: " + names.get(0)); // Anu

        // Remove
        names.remove(1); // removes "Rita"

        // Loop through list
        for(String name : names) {
            System.out.println(name);
        }

        // Check if list contains "Anu"
        System.out.println("Contains 'Anu'? " + names.contains("Anu"));

        // Size
        System.out.println("Total: " + names.size());
    }
}
```

---

### ✅ When to Use `List`?
- When you want to maintain **order of insertion**.
- When you want to allow **duplicates**.
- When you need **indexed access** (like arrays, but dynamic).

---

The `List` interface in Java has several well-known **concrete classes** that implement it. Here's a quick overview of each:

### ✅ **Hierarchy (Simplified)**
```
Iterable
  └── Collection
        └── List (interface)
              ├── ArrayList
              ├── LinkedList
              ├── Vector
              │     └── Stack
```

---

### ✅ 1. **ArrayList**
- **Backed by:** Dynamic array.
- **Features:**
  - Fast in **retrieval** (`get()`).
  - Slower in **insertion/deletion** in the middle.
  - **Not synchronized** (not thread-safe).
- **Syntax:**
```java
List<String> list = new ArrayList<>();
```

---

### ✅ 2. **LinkedList**
- **Backed by:** Doubly linked list.
- **Features:**
  - Faster in **insertion/deletion** (especially at start/end).
  - Slower **random access** (sequential search).
  - Implements **Deque** (can be used as Queue/Stack).
- **Syntax:**
```java
List<String> list = new LinkedList<>();
```

---

### ✅ 3. **Vector**
- **Legacy class**, introduced in Java 1.0.
- **Backed by:** Dynamic array.
- **Features:**
  - Similar to ArrayList.
  - **Synchronized** (thread-safe) — but slower.
  - Rarely used in modern development.
- **Syntax:**
```java
List<String> list = new Vector<>();
```

---

### ✅ 4. **Stack**
- **Extends:** `Vector`.
- **Follows:** LIFO (Last-In-First-Out).
- **Methods:** `push()`, `pop()`, `peek()`, `empty()`.
- **Syntax:**
```java
Stack<String> stack = new Stack<>();
stack.push("Anu");
System.out.println(stack.pop()); // Anu
```

---

### 📝 Summary Table

| Class       | Thread-safe | Best For                 | Underlying Structure |
|-------------|-------------|--------------------------|-----------------------|
| ArrayList   | ❌ No       | Random access, fast read | Dynamic array         |
| LinkedList  | ❌ No       | Frequent insert/delete   | Doubly linked list    |
| Vector      | ✅ Yes      | Legacy thread-safe list  | Dynamic array         |
| Stack       | ✅ Yes      | LIFO operations          | Inherits Vector       |

---


