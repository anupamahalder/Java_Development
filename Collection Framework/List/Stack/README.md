## 🔷 What is Stack in Java?
A **Stack** is a **Last In, First Out (LIFO)** data structure — the last element added is the first one removed.

Java provides the `Stack` class as part of the **`java.util`** package.  
It extends **`Vector`**, which means it is **synchronized/thread-safe** by default.

---

### ✅ Key Operations in Stack:

| Method             | Description                                      |
|--------------------|--------------------------------------------------|
| `push(E item)`     | Adds an item to the top of the stack             |
| `pop()`            | Removes and returns the top item                 |
| `peek()`           | Returns the top item without removing it         |
| `isEmpty()`        | Checks if the stack is empty                     |
| `search(Object o)` | Returns position from the top (1-based index)    |

---

### 📌 Example: Simple Stack Operations
```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        // Push elements (Add to top)
        books.push("Java");
        books.push("Python");
        books.push("C++");

        System.out.println("Stack: " + books); // [Java, Python, C++]

        // Peek (top element)
        System.out.println("Top Book: " + books.peek()); // C++

        // Pop element (remove top)
        System.out.println("Removed Book: " + books.pop()); // C++
        System.out.println("After Pop: " + books); // [Java, Python]

        // Search element
        System.out.println("Position of Java: " + books.search("Java")); // 2

        // Check if stack is empty
        System.out.println("Is stack empty? " + books.isEmpty()); // false
    }
}
```

---

### 💡 Real World Analogy:
Think of a **stack of plates**:
- Last plate added is the **first one you remove**.
- You can only access the top plate — no direct access to the one at the bottom.

---

### 📌 When to Use `Stack`?
- Undo features in editors
- Backtracking algorithms (e.g., maze solving)
- Expression evaluation (e.g., infix to postfix)
- Call stack simulation in interpreters/compilers

---
