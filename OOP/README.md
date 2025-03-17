# **📌 Object-Oriented Programming (OOP) in Java**  

Java is **an object-oriented programming (OOP) language**, which means it revolves around objects and follows OOP principles to design programs.  

### **🔹 What is OOP?**  
OOP is a programming paradigm that **organizes code into objects** rather than functions and logic. It makes code **modular, reusable, and scalable**.  

### **🔹 Key Principles of OOP in Java**  
Java follows **four core principles** of OOP:  

| **OOP Principle**   | **Definition** | **Example** |
|---------------------|---------------|-------------|
| **Encapsulation** | Wrapping data and methods into a single unit (class) and **restricting direct access** using `private` variables. | Private variables with getter & setter methods. |
| **Abstraction** | Hiding complex implementation and **only showing essential details** using abstract classes and interfaces. | Abstract classes and interfaces. |
| **Inheritance** | Allows a child class to **inherit properties and methods** from a parent class, reducing redundancy. | `extends` keyword for class inheritance. |
| **Polymorphism** | **Same method but different implementations** (Method Overloading & Overriding). | Method overloading (same method name but different parameters). |

---

## **🔹 1. Encapsulation (Data Hiding)**
Encapsulation restricts direct access to class data and allows **controlled access via methods**.

✅ **Example:**
```java
class Student {
    private String name; // Private variable (cannot be accessed directly)

    // Getter method to access private variable
    public String getName() {
        return name;
    }

    // Setter method to set the value
    public void setName(String newName) {
        name = newName;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Anupama"); // Setting value using setter
        System.out.println(s1.getName()); // Accessing value using getter
    }
}
```
✅ **Output:**
```
Anupama
```
---

## **🔹 2. Abstraction (Hiding Implementation)**
Abstraction allows us to **define methods without implementing them**, forcing subclasses to implement them.

✅ **Example Using Abstract Class:**
```java
abstract class Animal {
    abstract void makeSound(); // Abstract method (must be implemented in child class)
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal obj = new Dog(); // Parent reference, child object
        obj.makeSound();
    }
}
```
✅ **Output:**
```
Dog barks
```
---

## **🔹 3. Inheritance (Reusing Code)**
Inheritance allows **one class to inherit properties and methods** from another class.

✅ **Example Using `extends` Keyword:**
```java
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class method");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();   // Inherited method
        obj.display(); // Child class method
    }
}
```
✅ **Output:**
```
Parent class method
Child class method
```
---

## **🔹 4. Polymorphism (Many Forms)**
Polymorphism allows **one method to have multiple forms** via **Method Overloading** and **Method Overriding**.

✅ **Method Overloading (Same method name, different parameters)**
```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(5, 3));       // Calls add(int, int)
        System.out.println(obj.add(5, 3, 2));    // Calls add(int, int, int)
    }
}
```
✅ **Output:**
```
8
10
```
---

✅ **Method Overriding (Same method name in Parent & Child class)**
```java
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal obj = new Dog(); // Parent reference, child object
        obj.sound(); // Calls Dog's overridden method
    }
}
```
✅ **Output:**
```
Dog barks
```
---

## **🔹 Other Important OOP Features in Java**
### ✅ **Interfaces (Multiple Inheritance Alternative)**
Java **does not support multiple inheritance** using classes, but we can achieve it using **interfaces**.

```java
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}
```
✅ **Output:**
```
Car starts with key
```
---

## **📌 Summary:**
| **OOP Concept**  | **Definition** | **Key Feature** |
|------------------|---------------|----------------|
| **Encapsulation** | Hides data and allows access via methods | Private variables with getter/setter |
| **Abstraction** | Hides implementation details | Abstract classes & interfaces |
| **Inheritance** | Child class acquires properties of parent class | `extends` keyword |
| **Polymorphism** | One method, multiple forms | Method Overloading & Overriding |

