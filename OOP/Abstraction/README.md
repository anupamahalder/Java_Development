# **📌 Abstraction in Java**

### **🔹 What is Abstraction?**
Abstraction in Java is the process of **hiding implementation details** and **showing only the essential features** of an object. It helps to reduce complexity by providing a clear interface for interaction.

---

### **🔹 How is Abstraction Achieved in Java?**
Java provides **two ways** to achieve abstraction:  
1️⃣ **Abstract Classes** (0-100% abstraction)  
2️⃣ **Interfaces** (100% abstraction in Java 7, improved in Java 8+)

---

## **1️⃣ Abstract Classes (Partial Abstraction)**
An **abstract class** is a class that **cannot be instantiated** and may contain **both abstract (unimplemented) and concrete (implemented) methods**.

### ✅ **Example: Abstract Class**
```java
// Abstract class (Cannot be instantiated)
abstract class Vehicle {
    abstract void start(); // Abstract method (No implementation)
    
    void stop() { // Concrete method
        System.out.println("Vehicle is stopping...");
    }
}

// Concrete class inheriting abstract class
class Car extends Vehicle {
    void start() { // Implementing abstract method
        System.out.println("Car starts with a key ignition.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Polymorphism
        myCar.start();  // Calls implemented method from Car
        myCar.stop();   // Calls concrete method from Vehicle
    }
}
```
### **🔹 Key Points:**
- The **abstract class `Vehicle`** has one **abstract method (`start()`)** and one **concrete method (`stop()`)**.
- The **`Car` class extends `Vehicle`** and provides an implementation for `start()`.
- Abstract classes **can have constructors and instance variables**.

---

## **2️⃣ Interfaces (Full Abstraction)**
An **interface** is a collection of abstract methods. In **Java 7**, interfaces contained only **abstract methods** (100% abstraction).  
From **Java 8**, interfaces can also have **default and static methods**.

### ✅ **Example: Interface**
```java
// Interface (100% abstraction in Java 7)
interface Animal {
    void makeSound(); // Abstract method
}

// Class implementing interface
class Dog implements Animal {
    public void makeSound() { // Implementing interface method
        System.out.println("Dog barks");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism
        myDog.makeSound(); // Calls Dog's implementation
    }
}
```
### **🔹 Key Points:**
- Interfaces **only have method declarations (in Java 7).**
- The **`Dog` class must implement `makeSound()`**, or it will give an error.
- **A class can implement multiple interfaces** (unlike abstract classes, which support single inheritance).

---

## **🔹 Differences Between Abstract Class & Interface**
| Feature           | Abstract Class | Interface |
|------------------|---------------|-----------|
| **Abstraction Level** | 0-100% | 100% (Java 7), Can have default/static methods (Java 8) |
| **Methods** | Can have abstract & concrete methods | Only abstract methods (Java 7), Can have default/static methods (Java 8) |
| **Variables** | Can have instance variables | Only `public static final` variables (constants) |
| **Access Modifiers** | Can be `public`, `protected`, `private` | All methods are `public` by default |
| **Inheritance** | Supports single inheritance (`extends`) | Supports multiple inheritance (`implements`) |
| **Performance** | Faster than interfaces | Slightly slower due to dynamic method resolution |

---

## **📌 Summary**
🔹 **Abstraction** hides unnecessary details and shows only essential features.  
🔹 **Abstract classes** allow both **abstract** and **concrete methods** (0-100% abstraction).  
🔹 **Interfaces** enforce **full abstraction** in Java 7 and beyond.  
🔹 **Use abstract classes when methods have common behavior**, and **use interfaces for full abstraction & multiple inheritance**.

