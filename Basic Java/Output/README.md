# Printing Output in Java
In Java, there are multiple ways to print output. Below are **all possible ways** to print output in Java:

---

## **1️⃣ Using `System.out.print()`**
- Prints the output **without a new line**.
```java
System.out.print("Hello, ");
System.out.print("World!");
```
**Output:**  
```
Hello, World!
```

---

## **2️⃣ Using `System.out.println()`**
- Prints the output and moves the cursor to a **new line**.
```java
System.out.println("Hello, World!");
System.out.println("Welcome to Java!");
```
**Output:**
```
Hello, World!
Welcome to Java!
```

---

## **3️⃣ Using `System.out.printf()` (Formatted Output)**
- Used for **formatted output** (like `printf` in C).
- `%d` for integers, `%f` for floating points, `%s` for strings, etc.
```java
int age = 25;
double pi = 3.14159;
System.out.printf("I am %d years old.\n", age);
System.out.printf("Value of Pi: %.2f\n", pi);
```
**Output:**
```
I am 25 years old.
Value of Pi: 3.14
```

---

## **4️⃣ Using `System.out.format()` (Similar to `printf`)**
- `format()` works the same way as `printf()`.
```java
String name = "Anupama";
System.out.format("Hello, %s!\n", name);
```
**Output:**
```
Hello, Anupama!
```

---

## **5️⃣ Using `System.out.append()` (Chaining)**
- Used to append values **without a new line**.
```java
System.out.append("Hello, ").append("World!");
```
**Output:**
```
Hello, World!
```

---

## **6️⃣ Using `System.err.println()` (Error Output)**
- Prints messages to **error stream** (useful for debugging).
```java
System.err.println("This is an error message!");
```
**Output:** (Printed in red in most IDEs)
```
This is an error message!
```

---

## **7️⃣ Using `Writer` Classes (`BufferedWriter`)**
- Useful for **writing to files** or **efficient console printing**.
```java
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write("Hello, World using BufferedWriter!");
        writer.newLine(); // Moves to next line
        writer.flush(); // Ensures output is printed
    }
}
```
**Output:**
```
Hello, World using BufferedWriter!
```

---

## **8️⃣ Using `PrintWriter`**
- More powerful than `System.out` (supports **auto-flushing**).
```java
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Hello, World using PrintWriter!");
        pw.printf("Formatted Number: %.2f\n", 12.3456);
    }
}
```
**Output:**
```
Hello, World using PrintWriter!
Formatted Number: 12.35
```

---

### **🔹 Summary Table**
| Method | New Line? | Formatting Support | Buffered Output? |
|--------|----------|-------------------|------------------|
| `System.out.print()` | ❌ No | ❌ No | ❌ No |
| `System.out.println()` | ✅ Yes | ❌ No | ❌ No |
| `System.out.printf()` | ✅ Yes | ✅ Yes | ❌ No |
| `System.out.format()` | ✅ Yes | ✅ Yes | ❌ No |
| `System.out.append()` | ❌ No | ❌ No | ❌ No |
| `System.err.println()` | ✅ Yes | ❌ No | ❌ No |
| `BufferedWriter` | ✅ Yes | ❌ No | ✅ Yes |
| `PrintWriter` | ✅ Yes | ✅ Yes | ✅ Yes |

---

### **🚀 Which One to Use?**
- **For simple prints:** `System.out.println()`
- **For formatted output:** `System.out.printf()` or `System.out.format()`
- **For error messages:** `System.err.println()`
- **For efficient printing (large data):** `BufferedWriter` or `PrintWriter`

  
