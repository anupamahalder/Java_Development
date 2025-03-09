## **📝 Taking Input in Java**  

Java provides multiple ways to take user input, including `Scanner`, `BufferedReader`, and `Console`. Below are different ways to read input from the user.

---

### **🔹 1. Using `Scanner` Class (Recommended)**
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
✔ **Advantages**: Simple, widely used, supports different data types.  
❌ **Disadvantage**: Slightly slower compared to `BufferedReader`.

---

### **🔹 2. Using `BufferedReader` (Efficient for Large Input)**
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
✔ **Advantages**: Faster than `Scanner`, good for large inputs.  
❌ **Disadvantage**: Cannot directly take numeric input; needs parsing.

---

### **🔹 3. Using `Console` (For Password Input)**
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
✔ **Advantages**: Secure input (hides passwords).  
❌ **Disadvantage**: Does not work in IDEs like Eclipse or IntelliJ.

---

### **🔹 4. Using `args[]` (Command Line Arguments)**
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

### **📌 Summary Table**
| Method | Pros | Cons |
|--------|------|------|
| `Scanner` | Easy to use, supports multiple data types | Slower for large inputs |
| `BufferedReader` | Faster for large inputs | Needs parsing for numbers |
| `Console` | Secure (password input) | Doesn't work in all IDEs |
| `Command Line Arguments` | No user interaction needed | Only accepts strings |


