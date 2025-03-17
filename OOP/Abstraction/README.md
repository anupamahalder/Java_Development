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

Here's a **brief explanation** of important related topic:

### 🔹 **1. Abstract Methods**
An **abstract method** is a method that **does not have a body** and must be implemented by subclasses. It is declared inside an **abstract class** and forces child classes to provide their own implementation.

✅ **Example:**
```java
abstract class Animal {
    abstract void makeSound(); // Abstract method (no body)
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
```
💡 **Key Point:** Abstract methods ensure that every subclass provides its own specific behavior.

---

### 🔹 **2. Concrete Methods**
A **concrete method** is a normal method with a **complete implementation (body)** inside an abstract or normal class. Subclasses can use it as-is or override it.

✅ **Example:**
```java
abstract class Animal {
    void sleep() {
        System.out.println("Sleeping...");
    }
}
```
💡 **Key Point:** Abstract classes can have both **abstract and concrete methods**.

---

### 🔹 **3. Constructors in an Abstract Class**
An **abstract class can have a constructor**, even though we cannot directly create an object of it. This is useful for initializing common properties for all subclasses.

✅ **Example:**
```java
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {  // Constructor in abstract class
        this.brand = brand;
        System.out.println(brand + " vehicle is created.");
    }
}
```
💡 **Key Point:** Abstract class constructors help initialize **common attributes** before subclass-specific initialization.

---

### 🔹 **4. Instance Variables**
Instance variables are **attributes** of a class. In abstract classes, they store common properties that **subclasses can inherit**.

✅ **Example:**
```java
abstract class Animal {
    String name;  // Instance variable

    Animal(String name) {
        this.name = name;
    }
}
```
💡 **Key Point:** Instance variables in an abstract class help store **shared attributes**.

---

### 🔹 **5. Method Overriding**
Method overriding occurs when a **subclass provides a new implementation** for a method inherited from a parent class.

✅ **Example:**
```java
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");  // Overriding the method
    }
}
```
💡 **Key Point:** Overriding allows subclasses to provide **specific behavior** for a method.

---

### 🔹 **6. Polymorphism**
Polymorphism means **one interface, many implementations**. A superclass reference can hold objects of different subclasses, allowing **dynamic method binding**.

✅ **Example:**
```java
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal myPet = new Dog(); // Polymorphism
        myPet.makeSound(); // Dog barks

        myPet = new Cat();
        myPet.makeSound(); // Cat meows
    }
}
```
💡 **Key Point:** Polymorphism enables **flexibility** and **dynamic behavior** at runtime.

---

## **🚀 Summary**
| Concept | Definition | Example |
|---------|------------|------------|
| **Abstract Method** | A method without a body, must be implemented in subclasses. | `abstract void makeSound();` |
| **Concrete Method** | A method with an implementation inside an abstract or normal class. | `void sleep() { System.out.println("Sleeping..."); }` |
| **Abstract Class Constructor** | A constructor inside an abstract class to initialize variables. | `Vehicle(String brand) { this.brand = brand; }` |
| **Instance Variables** | Variables declared inside a class to store data. | `String name;` |
| **Method Overriding** | A subclass providing a new implementation of a superclass method. | `@Override void makeSound() { System.out.println("Dog barks"); }` |
| **Polymorphism** | A single superclass reference can hold objects of different subclasses. | `Animal myPet = new Dog();` |

---

## **📌 Summary**
🔹 **Abstraction** hides unnecessary details and shows only essential features.  
🔹 **Abstract classes** allow both **abstract** and **concrete methods** (0-100% abstraction).  
🔹 **Interfaces** enforce **full abstraction** in Java 7 and beyond.  
🔹 **Use abstract classes when methods have common behavior**, and **use interfaces for full abstraction & multiple inheritance**.

