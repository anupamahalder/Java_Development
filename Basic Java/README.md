# 📝 Brief Explanation of Java Program Syntax  

A basic Java program consists of several key components. Let’s go step by step:  

---

## ✅ Basic Java Program Structure  

```java
// 1️⃣ Package Declaration (Optional)
package mypackage;  

// 2️⃣ Import Statements (Optional)
import java.util.Scanner;  

// 3️⃣ Class Declaration
public class HelloWorld {  

    // 4️⃣ Main Method (Entry Point)
    public static void main(String[] args) {  

        // 5️⃣ Statement (Printing Output)
        System.out.println("Hello, Java!");  
    }  
}
```

## 🔍 Explanation of Syntax Elements
### 1️⃣ Package Declaration (Optional)
- Declares the package the class belongs to.
- Example:
  ```java
  package mypackage;
  ```
- If no package is specified, Java places the class in the default package.
## 2️⃣ Import Statements (Optional)
- Used to import Java libraries.
- Example:
  ```java
  import java.util.Scanner; (for taking user input).
  ```
## 3️⃣ Class Declaration
- Every Java program must have at least one class.
- The class name should start with an uppercase letter (CamelCase is preferred).
- Example:
```java
public class HelloWorld { ... }
```
## 4️⃣ Main Method (Entry Point of Program)
- Java execution starts from main() method.
- **Syntax:**
```java
public static void main(String[] args) { ... }
```
- **Keywords Breakdown:**
- **public** → Accessible by all classes.
- **static** → No need to create an object to call main().
- **void** → No return value.
- **String[] args** → Command-line arguments (optional).
## 5️⃣ Statements & Printing Output
- Java statements must end with a semicolon (;).
- System.out.println("Hello, Java!"); prints output to the console.
- System.out.print("Hello"); prints without a newline.

---
## ❓ A class can contain only one main() method – False ❌
✅ Explanation:
- A class can have only one public static void main(String[] args) method.
However, overloaded versions of main() with different parameter lists are allowed, but they won't be executed automatically.
A Java class can have multiple main() methods, but only one with the correct signature is used as the entry point for execution.
- Valid main method signature (Entry Point):
```java
public static void main(String[] args) {
    System.out.println("Hello, Java!");
}
```
- The Java Virtual Machine (JVM) looks for only one main() method as the program entry point when running the program.
- If a class has multiple public static void main(String[] args) methods, it will cause a compilation error.
- Overloading is allowed with different parameters, but overloaded methods won't be executed unless called explicitly.
- ✅ Example: Allowed (Overloaded main methods)
```java
public class MainExample {

    // ✅ JVM will look for this method as the entry point
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        main(10);  // Calling overloaded main method
    }

    // ✅ Overloaded main method (Not an entry point)
    public static void main(int num) {
        System.out.println("Overloaded main method: " + num);
    }

    // ✅ Another overloaded main method (Also not an entry point)
    public static void main(double num) {
        System.out.println("Another main method with double: " + num);
    }
}
```
🔥 Output:
```
Main method with String[] args
Overloaded main method: 10
```
