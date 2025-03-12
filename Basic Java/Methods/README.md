# **🔹 Methods in Java**
A **method** in Java is a block of code that performs a specific task and can be reused multiple times. Methods help in reducing redundancy, improving code readability, and making programs modular.

### **🔹 Standard Syntax of a Method**
```java
returnType methodName(parameter1, parameter2, ...) {
    // Method body: Code to perform a task
    return value;  // (if returnType is not void)
}
```

### **🔹 Explanation of Syntax**
| **Keyword**   | **Description** |
|--------------|----------------|
| `returnType` | The type of value the method returns (e.g., `int`, `String`, `void` for no return) |
| `methodName` | The name of the method (should be meaningful) |
| `parameters` | Inputs passed to the method (inside parentheses) |
| `{}`         | The method body where logic is written |
| `return`     | Returns a value (if return type is not `void`) |

### **🔹 Example 1: Method Without Parameters**
```java
public class Example {
    // Method that prints a message (no parameters, no return value)
    void greet() {
        System.out.println("Hello, welcome to Java!");
    }

    public static void main(String[] args) {
        Example obj = new Example(); // Creating an object
        obj.greet(); // Calling the method
    }
}
```
**🔹 Output:**
```
Hello, welcome to Java!
```

### **🔹 Example 2: Method With Parameters and Return Type**
```java
public class Calculator {
    // Method that takes two numbers and returns their sum
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(5, 10); // Calling method with arguments
        System.out.println("Sum: " + result);
    }
}
```
**🔹 Output:**
```
Sum: 15
```

---

Great question! The four types of user-defined methods I discussed earlier are **based on parameters and return types**, but they are not the only way to categorize methods in Java.  

Now, let's discuss the **actual classification of methods in Java.**  

---

## **📌 Types of Methods in Java**
Java methods are broadly categorized into **two types**:  
1️⃣ **Predefined Methods (Built-in methods)**  
2️⃣ **User-Defined Methods**  

### **1️⃣ Predefined Methods (Built-in Methods)**
These are methods that Java provides in standard libraries (like `Math`, `String`, `System`).  
#### **Examples**:  
- `Math.sqrt(25)` → Returns 5.0  
- `"hello".toUpperCase()` → Converts to `"HELLO"`  
- `System.out.println("Java")` → Prints `"Java"`  

---

### **2️⃣ User-Defined Methods**  
These are methods created by the programmer. User-defined methods can be further divided into **four types based on parameters and return values** (which we discussed earlier).  

But user-defined methods also have different types based on **behavior and scope**:

### **🔹 Classification of Methods Based on Behavior**
#### **(A) Instance Methods**  
- Defined **without `static`** keyword.  
- Requires an object of the class to be called.  
- Can access instance variables and methods directly.  

✅ **Example:**  
```java
public class Example {
    int num = 10;  // Instance variable

    void display() { // Instance method
        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {
        Example obj = new Example(); // Creating object
        obj.display();  // Calling instance method
    }
}
```
🔹 **Output**:
```
Number: 10
```

---

#### **(B) Static Methods**  
- Defined using the `static` keyword.  
- Can be called without creating an object of the class.  
- Can only access **static variables and other static methods**.  

✅ **Example:**  
```java
public class StaticExample {
    static void greet() {  // Static method
        System.out.println("Hello, Java!");
    }

    public static void main(String[] args) {
        greet();  // Calling static method directly
    }
}
```
🔹 **Output**:
```
Hello, Java!
```

---

#### **(C) Abstract Methods**  
- Declared **without a body** in an `abstract` class.  
- Must be **overridden** in a subclass.  
- Helps in achieving **abstraction**.  

✅ **Example:**  
```java
abstract class Animal {
    abstract void makeSound(); // Abstract method (no body)
}

class Dog extends Animal {
    void makeSound() {  // Implementing the method
        System.out.println("Bark!");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound(); // Calling overridden method
    }
}
```
🔹 **Output**:
```
Bark!
```

---

#### **(D) Final Methods**  
- Declared with `final`, meaning **it cannot be overridden** in a subclass.  
- Ensures the method logic remains unchanged.  

✅ **Example:**  
```java
class Parent {
    final void show() {
        System.out.println("Final Method");
    }
}

class Child extends Parent {
    // void show() {  // ❌ Error! Cannot override final method
    //     System.out.println("Trying to override");
    // }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show(); // Calls the inherited final method
    }
}
```
🔹 **Output**:
```
Final Method
```

---

#### **(E) Synchronized Methods**  
- Used in **multithreading** to prevent multiple threads from accessing the method simultaneously.  
- Declared using the `synchronized` keyword.  

✅ **Example:**  
```java
class SharedResource {
    synchronized void printNumbers(int n) { // Synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try { Thread.sleep(400); } catch (Exception e) {}
        }
    }
}

public class Test {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        // Two threads accessing the synchronized method
        Thread t1 = new Thread(() -> obj.printNumbers(2));
        Thread t2 = new Thread(() -> obj.printNumbers(3));

        t1.start();
        t2.start();
    }
}
```
🔹 **Ensures thread safety.**  

---

### **🔹 Special Types of Methods**
#### **(F) Constructor Methods**
- Special method that initializes objects.  
- Has the same name as the class and **no return type**.  

✅ **Example:**  
```java
public class Car {
    String brand;

    Car(String brand) { // Constructor
        this.brand = brand;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota"); // Constructor called
        myCar.display();
    }
}
```
🔹 **Output**:
```
Car Brand: Toyota
```

---

#### **(G) Main Method**
- The entry point of a Java program.  
- **Syntax**:  
  ```java
  public static void main(String[] args) {
      // Code execution starts here
  }
  ```

---

## **📌 Summary Table: Types of Methods in Java**
| **Method Type**   | **Description** |
|------------------|----------------|
| **Predefined Method** | Built-in methods in Java (e.g., `Math.sqrt()`, `System.out.println()`). |
| **Instance Method** | Non-static method that belongs to an object of the class. |
| **Static Method** | Method declared with `static`, can be called without an object. |
| **Abstract Method** | Method with no body, must be implemented in a subclass. |
| **Final Method** | Cannot be overridden in child classes. |
| **Synchronized Method** | Prevents multiple threads from accessing the method at the same time. |
| **Constructor Method** | Special method to initialize objects. |
| **Main Method** | Entry point of every Java program. |

---

## **📌 Conclusion**
- **User-defined methods** are created by the programmer and classified based on parameters, return type, and behavior.  
- **Java has different types of methods** like **instance methods, static methods, abstract methods, final methods, synchronized methods, and constructors**.  
- Understanding these helps in **better coding practices, modular programming, and efficient execution**.

