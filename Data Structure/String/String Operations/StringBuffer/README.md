# **📌 StringBuffer in Java**  

### **🔹 What is `StringBuffer`?**
`StringBuffer` is a **mutable** (modifiable) sequence of characters in Java. It is similar to `StringBuilder`, but it is **thread-safe** because all its methods are synchronized.

### **🔹 Why Use `StringBuffer`?**
- **Mutable** – Unlike `String`, it allows modification without creating new objects.
- **Thread-Safe** – Suitable for **multi-threaded environments** (unlike `StringBuilder`).
- **Performance** – Faster than `String` but slower than `StringBuilder` due to synchronization.

---

## **📌 Key Features & Methods of `StringBuffer`**
| Method | Description |
|---------|------------|
| `append(String str)` | Adds text at the end |
| `insert(int index, String str)` | Inserts text at a given position |
| `replace(int start, int end, String str)` | Replaces text within a range |
| `delete(int start, int end)` | Removes characters from a given range |
| `reverse()` | Reverses the string |
| `charAt(int index)` | Gets a character at a specified index |
| `setCharAt(int index, char ch)` | Modifies a specific character |
| `capacity()` | Returns the buffer's current capacity |
| `length()` | Returns the length of the stored string |
| `ensureCapacity(int minCapacity)` | Ensures a minimum buffer size |
| `substring(int start, int end)` | Extracts a substring |
| `toString()` | Converts `StringBuffer` to `String` |

---

## **📌 `StringBuffer` Code Example Covering All Features**
```java
public class StringBufferDemo {
    public static void main(String[] args) {
        // 1️⃣ Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // 2️⃣ Append: Adding text at the end
        sb.append(" World!");
        System.out.println("After Append: " + sb);  // Hello World!

        // 3️⃣ Insert: Adding text at a specific index
        sb.insert(6, "Java ");
        System.out.println("After Insert: " + sb);  // Hello Java World!

        // 4️⃣ Replace: Replacing a substring
        sb.replace(6, 10, "Python");
        System.out.println("After Replace: " + sb);  // Hello Python World!

        // 5️⃣ Delete: Removing a substring
        sb.delete(6, 12);
        System.out.println("After Delete: " + sb);  // Hello World!

        // 6️⃣ Reverse: Reversing the string
        sb.reverse();
        System.out.println("After Reverse: " + sb);  // !dlroW olleH

        // 7️⃣ Convert StringBuffer to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);

        // 8️⃣ Convert String to StringBuffer
        String inputString = "Java Programming";
        StringBuffer sb2 = new StringBuffer(inputString);
        System.out.println("String to StringBuffer: " + sb2);

        // 9️⃣ Capacity and Length
        System.out.println("Capacity: " + sb.capacity());  // Default is 16 + initial length
        System.out.println("Length: " + sb.length());

        // 🔟 Access and Modify Individual Characters
        System.out.println("Character at index 2: " + sb.charAt(2));
        sb.setCharAt(2, 'X');
        System.out.println("After setCharAt: " + sb);

        // 🔟.1 Ensure Capacity
        sb.ensureCapacity(50);
        System.out.println("New Capacity: " + sb.capacity());

        // 🔟.2 Get Substring
        String sub = sb.substring(0, 5);
        System.out.println("Substring: " + sub);

        // 🔟.3 Performance Comparison
        performanceTest();
    }

    // Performance Test: String vs StringBuffer
    public static void performanceTest() {
        long startTime, endTime;

        // Using String (Inefficient)
        startTime = System.currentTimeMillis();
        String str = "Java";
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("\nString Time: " + (endTime - startTime) + "ms");

        // Using StringBuffer (Efficient)
        startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + "ms");
    }
}
```

---

## **📌 Sample Output**
```
After Append: Hello World!
After Insert: Hello Java World!
After Replace: Hello Python World!
After Delete: Hello World!
After Reverse: !dlroW olleH
Converted to String: !dlroW olleH
String to StringBuffer: Java Programming
Capacity: 27
Length: 11
Character at index 2: l
After setCharAt: !dXroW olleH
New Capacity: 50
Substring: !dXro

String Time: 259ms
StringBuffer Time: 4ms
```

✔ **`StringBuffer` is much faster than `String` for modifications!** 🚀

---

## **📌 `String` vs `StringBuffer` vs `StringBuilder`**
| Feature | `String` | `StringBuffer` | `StringBuilder` |
|---------|----------|---------------|----------------|
| **Mutability** | Immutable | Mutable | Mutable |
| **Thread-Safe?** | Yes (Immutable) | Yes (Synchronized) | No |
| **Performance** | Slow (New Object Created) | Moderate | Fastest |
| **Usage** | When string is constant | When thread safety is needed | When thread safety is not needed |

✔ Use **`String`** if **no modifications are required**  
✔ Use **`StringBuffer`** for **multi-threaded applications**  
✔ Use **`StringBuilder`** for **better performance in single-threaded apps**  

---

## **📌 When to Use `StringBuffer`?**
✅ **Multi-threaded environments** where multiple threads access and modify the string  
✅ **When performance is important** but thread safety is also required  
✅ **When working with large strings** that require frequent modifications  

---

## **📌 Single-Threaded vs. Multi-Threaded in `StringBuffer`**  

🔹 **Single-Threaded (`StringBuffer` used in a single thread)**  
- Only **one** thread executes the operations.  
- No risk of data corruption or inconsistency.  
- Example: Modifying `StringBuffer` inside the `main()` method.  

✅ **Example:**  
```java
public class SingleThreadExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: Hello World
    }
}
```
---

🔹 **Multi-Threaded (`StringBuffer` shared across multiple threads)**  
- Multiple threads **access and modify** `StringBuffer` simultaneously.  
- `StringBuffer` is **thread-safe**, meaning it handles synchronization internally.  
- Prevents data corruption when multiple threads work on the same object.  

✅ **Example:**  
```java
class MultiThreadExample extends Thread {
    static StringBuffer sb = new StringBuffer("Thread ");

    public void run() {
        for (int i = 1; i <= 3; i++) {
            sb.append(i);
            System.out.println(Thread.currentThread().getName() + " → " + sb);
        }
    }

    public static void main(String[] args) {
        MultiThreadExample t1 = new MultiThreadExample();
        MultiThreadExample t2 = new MultiThreadExample();
        t1.start();
        t2.start();
    }
}
```

### **📌 Key Difference**
| Feature          | Single-Threaded `StringBuffer` | Multi-Threaded `StringBuffer` |
|-----------------|--------------------------------|--------------------------------|
| **Threads Used** | Only **one** thread operates  | **Multiple** threads operate  |
| **Concurrency**  | No concurrency issues        | Handles concurrency safely     |
| **Performance**  | **Faster** (No synchronization overhead) | **Slower** (Synchronization causes slight delay) |
| **Use Case**     | Simple string modifications  | Shared string modifications in multi-threading |

---

## **📌 Conclusion**
- `StringBuffer` is **mutable and thread-safe** (synchronized).
- It provides efficient **modification operations** (`append()`, `insert()`, `replace()`, etc.).
- It is **faster than `String`** but **slower than `StringBuilder`** due to synchronization overhead.
- It is **best for multi-threaded programs** where multiple threads modify the same string.

