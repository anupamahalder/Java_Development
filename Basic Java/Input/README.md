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

✔ **Advantages**: No need for user interaction.  
❌ **Disadvantage**: Limited to String inputs only.

---

## **🔹 5. DataInputStream (Rarely Used)**
✅ Low-Level Input Handling – Reads raw bytes and converts them into primitive data types.  
✅ Used in File Handling & Networking – Useful when dealing with binary data.  
❌ Not Recommended for Regular Input Handling – Scanner and BufferedReader are preferred.

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

📌 **Note**: `DataInputStream` is considered outdated for reading text input. Instead, prefer `Scanner` or `BufferedReader`.

---

## **📌 Summary Table**

| Method | Pros | Cons |
|--------|------|------|
| `Scanner` | Easy to use, supports multiple data types | Slower for large inputs |
| `BufferedReader` | Faster for large inputs | Needs parsing for numbers |
| `Console` | Secure (password input) | Doesn't work in all IDEs |
| `Command Line Arguments` | No user interaction needed | Only accepts strings |
