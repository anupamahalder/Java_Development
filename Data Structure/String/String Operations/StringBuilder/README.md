# **📌 StringBuilder in Java**  

### **🔹 What is StringBuilder?**  
`StringBuilder` is a **mutable** (modifiable) alternative to `String`. Unlike `String`, which is **immutable**, `StringBuilder` allows us to modify its content **without creating a new object**.  

👉 **Introduced in Java 1.5** under the `java.lang` package.  
👉 **Faster than `StringBuffer`** because it is **not synchronized** (not thread-safe).  
👉 **Best choice** when **multiple modifications** (append, insert, delete) are required in a string.  

---

## **🔹 Why Use `StringBuilder` Instead of `String`?**
| Feature         | `String` (Immutable) | `StringBuilder` (Mutable) |
|---------------|-----------------|-----------------|
| **Mutability** | Cannot be modified after creation | Can be modified without creating a new object |
| **Performance** | Slower when modifying strings frequently | Faster for string modifications |
| **Memory Efficiency** | Creates a new object for every modification | Uses the same object, reducing memory overhead |
| **Thread Safety** | Thread-safe (safe for multi-threading) | Not thread-safe (use `StringBuffer` if needed) |

---

## **🔹 Methods of `StringBuilder`**
| Method | Description |
|--------|------------|
| `append(String s)` | Adds text at the end of the string. |
| `insert(int index, String s)` | Inserts text at a specific position. |
| `replace(int start, int end, String s)` | Replaces a part of the string. |
| `delete(int start, int end)` | Deletes characters from a given range. |
| `reverse()` | Reverses the string. |
| `capacity()` | Returns the current capacity of the builder. |
| `charAt(int index)` | Returns the character at the given index. |
| `setCharAt(int index, char ch)` | Changes a specific character in the string. |
| `toString()` | Converts the `StringBuilder` to a `String`. |

---

## **🔹 Example Code Covering All Important Operations**
```java
public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // 1. Append - Add text at the end
        sb.append(" World!");
        System.out.println("After Append: " + sb);  // Hello World!

        // 2. Insert - Add text at a specific position
        sb.insert(6, "Java ");
        System.out.println("After Insert: " + sb);  // Hello Java World!

        // 3. Replace - Replace part of the string
        sb.replace(6, 10, "Python");
        System.out.println("After Replace: " + sb);  // Hello Python World!

        // 4. Delete - Remove characters from a range
        sb.delete(6, 12);
        System.out.println("After Delete: " + sb);  // Hello World!

        // 5. Reverse - Reverse the string
        sb.reverse();
        System.out.println("After Reverse: " + sb);  // !dlroW olleH

        // 6. Convert to String
        String finalString = sb.toString();
        System.out.println("Converted to String: " + finalString);
    }
}
```

---

## **🔹 Performance Comparison: `String` vs `StringBuilder`**
✔ `String` is **immutable**, so every modification creates a **new object**, consuming more memory.  
✔ `StringBuilder` is **mutable**, so it modifies the same object, making it much **faster**.

Example:
```java
public class PerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        // Using String (Inefficient)
        startTime = System.currentTimeMillis();
        String str = "Java";
        for (int i = 0; i < 10000; i++) {
            str += i;  // Creates a new object every time
        }
        endTime = System.currentTimeMillis();
        System.out.println("String Time: " + (endTime - startTime) + "ms");

        // Using StringBuilder (Efficient)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append(i);  // Modifies the same object
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + "ms");
    }
}
```
✔ **String takes more time** because it creates new objects repeatedly.  
✔ **StringBuilder is much faster** as it modifies the existing object.  

---

## **🔹 When to Use `String`, `StringBuffer`, and `StringBuilder`?**
| Scenario | Best Choice |
|----------|------------|
| **String is constant and will not change** | `String` |
| **Need to modify strings frequently (fast performance needed)** | `StringBuilder` |
| **Need thread safety in a multi-threaded environment** | `StringBuffer` |

---

## **📌 Summary**
🔹 `StringBuilder` is a **mutable** version of `String`, meaning it allows modifications **without creating new objects**.  
🔹 It is **faster and memory-efficient** compared to `String`, especially for large modifications.  
🔹 It is **not thread-safe**, so use `StringBuffer` if multi-threading is required.  
🔹 It provides powerful methods like `append()`, `insert()`, `replace()`, `delete()`, and `reverse()`.  
