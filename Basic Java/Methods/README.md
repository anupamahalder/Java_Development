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

## **📝 Types of Methods in Java**
Java provides different types of methods based on their use case and implementation.

### **🔹 1. Predefined (Built-in) Methods**
Java has a rich library of built-in methods in various classes (like `Math`, `String`, `Arrays`, etc.).

#### **Example: Built-in Methods**
```java
public class BuiltInMethods {
    public static void main(String[] args) {
        System.out.println(Math.max(10, 20)); // Finds the maximum number
        System.out.println("Hello".toUpperCase()); // Converts to uppercase
    }
}
```
**✅ Key Examples:**  
- `Math.max(a, b)` → Returns the maximum of two numbers.  
- `"text".length()` → Returns the length of a string.  
- `Arrays.sort(arr)` → Sorts an array.  

---

### **🔹 2. User-Defined Methods**
These are methods created by the programmer to perform specific tasks.

#### **Example: A Simple User-Defined Method**
```java
public class UserDefinedMethod {
    static void greet() { // Method definition
        System.out.println("Hello, Welcome to Java!");
    }
    
    public static void main(String[] args) {
        greet(); // Calling the method
    }
}
```
**✅ Key Benefits:**  
- Code reusability.  
- Improves program readability.  

---

### **🔹 3. Parameterized Methods**
A method can accept parameters to perform operations dynamically.

#### **Example: Method with Parameters**
```java
public class ParameterizedMethod {
    static int add(int a, int b) { // Method with parameters
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(5, 10); // Calling method with arguments
        System.out.println("Sum: " + sum);
    }
}
```
**✅ Key Benefits:**  
- Methods become flexible.  
- Can perform different operations based on input.

---

### **🔹 4. Return Type Methods**
Methods can return values to the caller using `return`.

#### **Example: Method Returning a Value**
```java
public class ReturnTypeMethod {
    static int multiply(int x, int y) {
        return x * y; // Returns the result
    }

    public static void main(String[] args) {
        int result = multiply(4, 5);
        System.out.println("Multiplication: " + result);
    }
}
```
**✅ Key Benefits:**  
- Used when we need to return a result to the caller.  

---

### **🔹 5. Method Overloading (Same Name, Different Parameters)**
Java allows defining multiple methods with the same name but different parameters.

#### **Example: Method Overloading**
```java
public class MethodOverloading {
    static int multiply(int a, int b) { // Method 1
        return a * b;
    }

    static double multiply(double a, double b) { // Method 2
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(4, 5));    // Calls first method
        System.out.println(multiply(4.5, 5.5)); // Calls second method
    }
}
```
**✅ Key Benefits:**  
- Increases code flexibility.  
- Improves readability with the same method name.

---

### **🔹 6. Static vs Non-Static Methods**
#### **📌 Static Method** → Belongs to the class, can be called without creating an object.  
#### **📌 Non-Static Method** → Requires an object to be invoked.

#### **Example: Static vs Non-Static Methods**
```java
public class StaticVsNonStatic {
    static void staticMethod() { // Static method
        System.out.println("This is a static method.");
    }

    void nonStaticMethod() { // Non-static method
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        staticMethod(); // Calling static method

        StaticVsNonStatic obj = new StaticVsNonStatic();
        obj.nonStaticMethod(); // Calling non-static method using object
    }
}
```
**✅ Key Differences:**  
- **Static methods** are called using the class name (`ClassName.methodName()`).
- **Non-static methods** require an object to call them (`obj.methodName()`).

---

### **🔹 7. Recursive Methods (Method Calling Itself)**
A method that calls itself is called **recursion**.

#### **Example: Factorial using Recursion**
```java
public class RecursionExample {
    static int factorial(int n) {
        if (n == 1) return 1; // Base case
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
```
**✅ Key Benefits:**  
- Used for problems like factorial, Fibonacci series, etc.  
- Reduces code complexity but may consume more memory.

---

### **🔹 8. Abstract Methods (Only Declaration, No Implementation)**
Abstract methods are declared but not defined in an abstract class.

#### **Example: Abstract Method**
```java
abstract class Animal {
    abstract void makeSound(); // Abstract method
}

class Dog extends Animal {
    void makeSound() { // Implementing abstract method
        System.out.println("Dog barks");
    }
}

public class AbstractMethodExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}
```
**✅ Key Benefits:**  
- Used in abstraction, forces subclasses to provide implementation.

---

### **🔹 9. Final Methods (Cannot Be Overridden)**
A `final` method cannot be overridden in child classes.

#### **Example: Final Method**
```java
class Parent {
    final void show() { // Final method
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // Cannot override show() method because it's final
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
```
**✅ Key Benefits:**  
- Prevents accidental method modification.

---

## **📌 Summary Table of Methods**
| Type | Description | Example |
|------|------------|---------|
| **Predefined Methods** | Built-in methods in Java | `Math.max(a, b)`, `"hello".length()` |
| **User-Defined Methods** | Created by the user | `void greet()` |
| **Parameterized Methods** | Accepts parameters | `void add(int a, int b)` |
| **Return Type Methods** | Returns a value | `int multiply(int x, int y)` |
| **Method Overloading** | Multiple methods with same name but different parameters | `int sum(int a)`, `double sum(double a, double b)` |
| **Static Methods** | Belongs to class, no object needed | `static void show()` |
| **Non-Static Methods** | Needs an object to call | `void display()` |
| **Recursive Methods** | Calls itself | `int factorial(int n)` |
| **Abstract Methods** | Declared but not implemented | `abstract void makeSound()` |
| **Final Methods** | Cannot be overridden | `final void show()` |

---

## **🎯 Conclusion**
Methods are essential in Java for organizing code efficiently. Using methods:
- ✅ Improves **code reusability**  
- ✅ Enhances **readability**  
- ✅ Supports **modularity**  

