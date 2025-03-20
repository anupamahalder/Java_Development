# **📦 Packages in Java**  

## 🔹 **What is a Package in Java?**  
A **package** in Java is a way to organize related classes, interfaces, and sub-packages into a **structured format**. It helps in **modular programming**, avoiding class name conflicts, and providing access protection.

---

## **1️⃣ Why Use Packages?**
- **Avoids name conflicts**: Two classes with the same name can exist in different packages.  
- **Organized structure**: Groups related classes for better maintainability.  
- **Access protection**: Controls visibility with `public`, `protected`, `private`, and **default** access modifiers.  
- **Code reusability**: Easily import and reuse classes from other packages.  

---

## **2️⃣ Types of Packages in Java**
### ✅ **1. Built-in Packages (Predefined)**
Java provides **many built-in packages** for different functionalities:
| **Package**  | **Description**  |
|--------------|----------------|
| `java.lang`  | Contains core classes like `String`, `Math`, `System`, etc. (Imported automatically) |
| `java.util`  | Provides data structures (ArrayList, HashMap, Date, etc.) |
| `java.io`    | Used for file handling (File, BufferedReader, etc.) |
| `java.net`   | Used for networking (Socket, URL, etc.) |
| `java.sql`   | Used for database connectivity (JDBC) |
| `javax.swing` | Used for GUI applications (JButton, JFrame, etc.) |

### ✅ **2. User-Defined Packages**
Users can create their **own custom packages** to organize classes.

---

## **3️⃣ How to Create and Use a Package?**
### **📌 Step 1: Create a Package**
To create a package, use the `package` keyword at the **top** of the Java file.

```java
package mypackage; // Creating a package

public class MyClass {
    public void showMessage() {
        System.out.println("Hello from MyClass in mypackage!");
    }
}
```
💡 **Save the file as `MyClass.java` inside a folder named `mypackage`**.

---

### **📌 Step 2: Compile the Package**
To compile, use the following command:  
```
javac -d . MyClass.java
```
🔹 **`-d .`** tells Java to place the compiled `.class` file inside the package folder.

---

### **📌 Step 3: Import and Use the Package**
To use the class from `mypackage`, import it into another Java file:

```java
import mypackage.MyClass;  // Importing the package

public class TestPackage {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Creating object
        obj.showMessage();
    }
}
```
💡 **Compile & Run:**
```
javac TestPackage.java
java TestPackage
```
✅ **Output:**  
```
Hello from MyClass in mypackage!
```

---

## **4️⃣ Types of Import Statements**
Java provides **three ways** to import a package:

### ✅ **1. Import a Specific Class**
```java
import mypackage.MyClass;
```
➡️ Imports **only** `MyClass` from `mypackage`.

### ✅ **2. Import All Classes in a Package**
```java
import mypackage.*;
```
➡️ Imports **all** classes inside `mypackage`.

### ✅ **3. Fully Qualified Name (Without Import)**
```java
public class Test {
    public static void main(String[] args) {
        mypackage.MyClass obj = new mypackage.MyClass();
        obj.showMessage();
    }
}
```
➡️ No `import` needed, but **must use the full package name**.

---

## **5️⃣ Sub-Packages in Java**
A **sub-package** is a package inside another package.

### **📌 Example**
```java
package mypackage.subpackage; // Creating a sub-package

public class SubClass {
    public void display() {
        System.out.println("This is a subpackage class.");
    }
}
```
💡 **To import and use it:**
```java
import mypackage.subpackage.SubClass;

public class TestSubPackage {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
```

---

## **6️⃣ Access Modifiers & Packages**
Access modifiers determine **which classes can access a package’s content**.

| **Modifier**   | **Same Class** | **Same Package** | **Different Package (Subclass)** | **Different Package (Non-Subclass)** |
|---------------|--------------|---------------|--------------------------|------------------------------|
| `public`      | ✅ Yes        | ✅ Yes         | ✅ Yes                    | ✅ Yes                        |
| `protected`   | ✅ Yes        | ✅ Yes         | ✅ Yes                    | ❌ No                         |
| (Default)     | ✅ Yes        | ✅ Yes         | ❌ No                     | ❌ No                         |
| `private`     | ✅ Yes        | ❌ No         | ❌ No                     | ❌ No                         |

💡 **Key Points:**
- **`public`**: Accessible from anywhere.
- **`protected`**: Accessible within the package and subclasses.
- **Default (no modifier)**: Accessible only in the same package.
- **`private`**: Accessible **only within the same class**.

---

## **7️⃣ Java `static import` (Importing Static Methods)**
Normally, we access static methods like this:
```java
import static java.lang.Math.*;

public class StaticImportExample {
    public static void main(String[] args) {
        System.out.println(sqrt(25));  // No need for Math.sqrt()
        System.out.println(max(10, 20));  // No need for Math.max()
    }
}
```
✅ **Output:**
```
5.0
20
```
🔹 **Advantage:** No need to prefix methods with `Math.`

---

## **8️⃣ Example: Real-World Package Usage**
### **📌 Scenario: Online Shopping System**
Let’s organize classes into packages.

### 📦 **Package Structure:**
```
com/shop
  ├── order
  │    ├── Order.java
  │    ├── Payment.java
  ├── user
  │    ├── Customer.java
```

### **📌 `Order.java` (Inside `com.shop.order`)**
```java
package com.shop.order;

public class Order {
    public void placeOrder() {
        System.out.println("Order placed successfully!");
    }
}
```

### **📌 `Customer.java` (Inside `com.shop.user`)**
```java
package com.shop.user;
import com.shop.order.Order;

public class Customer {
    public static void main(String[] args) {
        Order myOrder = new Order();
        myOrder.placeOrder();
    }
}
```
✅ **Output:**  
```
Order placed successfully!
```
🎯 **Key Takeaway**: Packages help structure a large application effectively.

---

## **✅ Summary**
- **Packages organize Java classes** logically and prevent name conflicts.
- **Types of Packages**: Built-in (`java.util`, `java.io`) & User-Defined.
- **Creating a Package**: Use `package` keyword at the **top** of a class.
- **Importing a Package**: Use `import package_name.*;` or fully qualified names.
- **Sub-Packages**: Hierarchical structure inside packages.
- **Access Modifiers**: Control class visibility across packages.
- **Static Import**: Allows importing static methods directly.
