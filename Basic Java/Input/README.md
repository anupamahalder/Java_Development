# **📝 Taking Input in Java**  

Java provides multiple ways to take user input, including `Scanner`, `BufferedReader`, and `Console`. Below are different ways to read input from the user.

---

## **🔹 1. Using `Scanner` Class (Recommended)**
The `Scanner` class (from `java.util` package) is the most commonly used method for input in Java.

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt(); // Taking integer input
        
        System.out.print("Enter a float: ");
        float decimal = sc.nextFloat(); // Taking float input
        
        sc.nextLine(); // Consume the leftover newline
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine(); // Taking string input

        System.out.println("\nYou entered:");
        System.out.println("Integer: " + num);
        System.out.println("Float: " + decimal);
        System.out.println("String: " + text);
        
        sc.close(); // Closing scanner
    }
}
```

### 📌 Key Benefits of using Scanner
**Scanner (Most Common)**
- ✅ Easy to Use – Supports direct methods like nextInt(), nextDouble(), nextLine(), etc.
- ✅ Can Read Different Data Types – Reads int, double, float, boolean, etc. without conversion.
- ✅ Splits Input Automatically – Reads token-by-token using whitespace as a separator.
- ❌ Slower than BufferedReader due to internal parsing overhead.

✔ **Advantages**: Simple, widely used, supports different data types.  
❌ **Disadvantage**: Slightly slower compared to `BufferedReader`.

### 🔹 Why Use sc.nextLine() After nextInt()?
📌 Fixing the Input Buffer Issue:
- When we use nextInt(), it does not consume the newline character (\n).
- sc.nextLine() is used to consume the leftover newline before reading a string.

---

## **🔹 2. Using `BufferedReader` (Efficient for Large Input)**
The `BufferedReader` class (from `java.io` package) is faster than `Scanner` but requires `IOException` handling.

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine(); // Reads string input

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine()); // Convert string to int

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
```
### 🔹 What is IOException?
- IOException is a checked exception in Java that occurs when an input or output operation fails.
- It is part of the java.io package and must be handled using a try-catch block or declared using throws.
  
### 🔹 Why Does BufferedReader Require IOException Handling?
BufferedReader.readLine() throws IOException because:
- It reads data from an external source (keyboard, file, network, etc.).
- External input sources may be unreliable (e.g., file not found, network failure, etc.).
- Java forces us to handle this exception to ensure program stability.

### 🔹 How Does catch (IOException e) Work?
The catch block executes only if an IOException occurs in the try block.
e.getMessage() provides details about the error.
Example: Handling IOException

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExceptionExample {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String name = br.readLine();  // Can throw IOException
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());  // Handle IOException
        }
    }
}
```
### 🔹 When Can IOException Occur?
- Keyboard input fails (rare, but possible).
- Reading from a file that doesn't exist.
- Network-related issues while reading input from an online source.

## 🔹 Key Benefits of Using BufferedReader
- **Fast & Efficient**: Faster than Scanner as it buffers input and reduces the number of I/O operations.
- **Handles Large Input Efficiently**: Scanner reads input token by token, but BufferedReader reads a full line at once.
- **Reads Full Line of Input at Once**: Unlike Scanner, which reads word by word, BufferedReader reads the entire line.
- **Less Memory Overhead**: Uses a buffered approach to store data before processing.
- **Avoids Issues Like nextLine() Skipping in Scanner**: BufferedReader does not face this issue because it reads input as a whole.

✔ **Advantages**: Faster than `Scanner`, good for large inputs.  
❌ **Disadvantage**: Cannot directly take numeric input; needs parsing.

---

## **🔹 3. Using `Console` (For Password Input)**
The `Console` class (from `System`) is useful for taking secure inputs like passwords.

```java
import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.out.println("No console available.");
            return;
        }

        String username = console.readLine("Enter username: ");
        char[] password = console.readPassword("Enter password: ");
        
        System.out.println("Login Successful!");
    }
}
```

### 📌 Key Benefits of using Console
**Console (Secure for Password Input)**
✅ Used for Secure Input – Best for taking passwords (does not show typed characters).  
✅ Useful in Terminal-Based Apps – Works well in command-line environments.  
❌ Doesn’t Work in IDEs Like Eclipse – Works only in command prompt/terminal.

✔ **Advantages**: Secure input (hides passwords).  
❌ **Disadvantage**: Does not work in IDEs like Eclipse or IntelliJ.

---

## **🔹 4. Using `args[]` (Command Line Arguments)**
Command-line arguments allow passing input when running the program.

```java
public class CommandLineExample {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("First argument: " + args[0]);
        } else {
            System.out.println("No arguments provided.");
        }
    }
}
```
### 📌 Steps to Run this Program
Compile the program:
```
javac CommandLineInputExample.java
```
Run the program with inputs:
```
java CommandLineInputExample John 28 75000.5 M true Reading,Coding,Traveling secretPassword
```

✔ **Advantages**: No need for user interaction.  
❌ **Disadvantage**: Limited to String inputs only.

---

## **🔹 5. DataInputStream (Rarely Used)**
✅ Low-Level Input Handling – Reads raw bytes and converts them into primitive data types.  
✅ Used in File Handling & Networking – Useful when dealing with binary data.  
❌ Not Recommended for Regular Input Handling – Scanner and BufferedReader are preferred.

### 📌 How DataInputStream Works?
- DataInputStream reads input as raw bytes.
- We use readLine() to read string input, then convert it into the required data type.

Here's a Java program using `DataInputStream` to take user input in a class structure:  

```java
import java.io.DataInputStream;
import java.io.IOException;

class DataInputExample {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = Integer.parseInt(dis.readLine());

            System.out.print("Enter a double: ");
            double decimal = Double.parseDouble(dis.readLine());

            System.out.print("Enter a string: ");
            String text = dis.readLine();

            System.out.println("\nYou entered:");
            System.out.println("Integer: " + num);
            System.out.println("Double: " + decimal);
            System.out.println("String: " + text);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
```
### 🔹 Explanation:
1. **`DataInputStream dis = new DataInputStream(System.in);`** → Creates an input stream for reading user input.
2. **`dis.readLine();`** → Reads input as a string (requires parsing for numerical values).
3. **`Integer.parseInt()` & `Double.parseDouble()`** → Convert string input to int and double.
4. **Try-Catch Block** → Handles `IOException`.

### ✅ Key Features of DataInputStream
- ✔ Reads all types of inputs (String, int, double, char, boolean, array).
- ✔ Uses DataInputStream, which reads bytes and converts them manually.
- ✔ Handles comma-separated values for array input.
- ✔ Fast & Efficient, but deprecated in modern Java (use Scanner or BufferedReader instead).

### **Why `throws IOException` is Required in `DataInputStream` But Not in Other Input Methods?**  

#### **📌 Reason: `IOException` Handling in `DataInputStream`**
- **`DataInputStream.readLine()` is a method that can throw an `IOException`** if an input or output error occurs.
- `IOException` (Input/Output Exception) occurs when there is an issue in **reading or writing data**.
- Since `DataInputStream` works at a **lower level** (reading raw bytes), it requires **explicit exception handling**.

📌 **Example Code with `throws IOException`**  
```java
import java.io.DataInputStream;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException { // Required for DataInputStream
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter your name: ");
        String name = dis.readLine(); // readLine() can throw IOException
        System.out.println("Hello, " + name);
        dis.close();
    }
}
```

---

### **🚀 Why Other Input Methods Don't Need `throws IOException`?**
| Input Method | Requires `throws IOException`? | Why? |
|-------------|-----------------|------|
| **Scanner** | ❌ **Not Required** | `Scanner` internally handles exceptions using built-in methods. |
| **BufferedReader** | ✅ **Required** | `BufferedReader.readLine()` throws `IOException`, just like `DataInputStream.readLine()`. |
| **Console** | ❌ **Not Required** | `System.console().readLine()` handles exceptions internally. |
| **Command Line Args** | ❌ **Not Required** | `args[]` are passed as program arguments and do not involve I/O operations. |

📌 **BufferedReader Also Needs `throws IOException`**  
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // readLine() requires IOException handling
        System.out.println("You entered: " + input);
    }
}
```

### 🔴 Why is DataInputStream.readLine() Deprecated?
- **No Proper Character Encoding Support**
  It assumes **default encoding**, which is unreliable for Unicode characters.
- **Not Memory Efficient**
  It reads **bytes instead of characters**, which can cause **issues with multibyte character sets**.
- **Better Alternative Available (BufferedReader)**
  BufferedReader is faster and supports character encoding properly.
- Since DataInputStream.readLine() is deprecated, we cannot use it for reading string inputs. Instead, DataInputStream is mainly used to read primitive data types (like int, double, float, char, etc.) in binary format.

- To take all inputs using DataInputStream, we use methods like readInt(), readDouble(), readFloat(), etc. However, System.in does not support direct binary input for these methods, so we need to use an InputStream wrapped in DataInputStream.

### 🚀 How to Take All Inputs Using DataInputStream (Without readLine())
Although `readLine()` is deprecated, DataInputStream can still be used to read primitive data types using `readInt()`, `readDouble()`, etc.

---

### **✅ NOTE**
- `DataInputStream.readLine()` and `BufferedReader.readLine()` **throw `IOException`**, so we **must** handle or declare it using `throws IOException`.
- `Scanner`, `Console`, and `Command Line Arguments` **do not require `throws IOException`** because they handle exceptions internally.
- **Prefer `Scanner` or `BufferedReader`** instead of `DataInputStream`, as `DataInputStream.readLine()` is **deprecated** in Java 1.1.
- `DataInputStream` is considered outdated for reading text input. Instead, prefer `Scanner` or `BufferedReader`.

### **✅ Conclusion**
- DataInputStream.readLine() is deprecated; use BufferedReader.readLine() instead.
- For primitive inputs, Scanner is easier than DataInputStream.
- For fast input reading, use BufferedReader.
### 🔹 Final Recommendation:
- ✔ Use Scanner if you want an easy-to-use input method.
- ✔ Use BufferedReader if you need efficient input handling for large inputs.
---

## **📌 Summary Table**

| Method | Pros | Cons |
|--------|------|------|
| `Scanner` | Easy to use, supports multiple data types | Slower for large inputs |
| `BufferedReader` | Faster for large inputs | Needs parsing for numbers |
| `Console` | Secure (password input) | Doesn't work in all IDEs |
| `Command Line Arguments` | No user interaction needed | Only accepts strings |
