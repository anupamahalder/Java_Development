# **📌 Inheritance in Java**
**Inheritance** is one of the four fundamental **OOP (Object-Oriented Programming)** concepts in Java. It allows a class to **acquire properties and behaviors** from another class, promoting **code reuse** and **hierarchical relationships**.

---
## **1️⃣ What is Inheritance?**
🔹 **Definition:**  
Inheritance allows one class (**child/subclass**) to inherit fields and methods from another class (**parent/superclass**).  

🔹 **Key Benefits:**
- Reusability (Avoids code duplication)  
- Extensibility (Child class can add more features)  
- Maintainability (Easy to modify and scale)  

🔹 **Syntax:**
```java
class Parent {
    // Parent class properties and methods
}

class Child extends Parent {
    // Child class inherits Parent class properties & methods
}
```

---
## **2️⃣ Types of Inheritance in Java**
| **Type**         | **Description** | **Example** |
|-----------------|---------------|------------|
| **Single Inheritance** | A class inherits from one parent class. | `class A → class B` |
| **Multilevel Inheritance** | A class inherits from a class that already extends another class. | `class A → class B → class C` |
| **Hierarchical Inheritance** | Multiple child classes inherit from the same parent class. | `class A → class B, class C` |
| **Multiple Inheritance using Interface** | A class implements multiple interfaces to achieve multiple inheritance behavior. | `class A implements I1, I2` |

---
## **3️⃣ Example Codes for Each Type**
### **(A) Single Inheritance**
```java
// Parent Class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child Class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks!");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited from Animal
        d.bark(); // Dog class method
    }
}
```

**📌 Output:**  
```
This animal eats food.  
Dog barks!  
```

---
### **(B) Multilevel Inheritance**
```java
// Parent Class
class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

// Intermediate Class (Child of Animal, Parent of Puppy)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks!");
    }
}

// Child Class
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();  // From Animal class
        p.bark(); // From Dog class
        p.weep(); // Puppy class method
    }
}
```
---
### **(C) Hierarchical Inheritance**
```java
// Parent Class
class Vehicle {
    void move() {
        System.out.println("Vehicles can move.");
    }
}

// Child Class 1
class Car extends Vehicle {
    void fourWheels() {
        System.out.println("Car has four wheels.");
    }
}

// Child Class 2
class Bike extends Vehicle {
    void twoWheels() {
        System.out.println("Bike has two wheels.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.fourWheels();

        Bike bike = new Bike();
        bike.move();
        bike.twoWheels();
    }
}
```
---
### **(D) Multiple Inheritance Using Interfaces**
```java
// Interface 1
interface Engine {
    void start();
}

// Interface 2
interface MusicSystem {
    void playMusic();
}

// Class implementing multiple interfaces
class Car implements Engine, MusicSystem {
    public void start() {
        System.out.println("Car engine started.");
    }

    public void playMusic() {
        System.out.println("Playing music in the car.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.playMusic();
    }
}
```
---
## **4️⃣ Important Notes**
🔹 **Java does not support multiple inheritance with classes** (avoids ambiguity).  
🔹 **Multiple inheritance can be achieved using interfaces**.  
🔹 **The `super` keyword** can be used to call the parent class constructor and methods.  

---
## **5️⃣ Key Differences: Abstract Class vs. Inheritance**
| **Feature**  | **Inheritance (extends)** | **Abstraction (abstract class & interface)** |
|-------------|------------------|--------------------|
| **Purpose** | Code reuse | Hiding implementation |
| **Usage** | "is-a" relationship | Define a contract |
| **Can have method implementations?** | Yes | Abstract methods (only in interfaces) |
| **Multiple Inheritance?** | No | Yes (via interfaces) |

---
## **📌 Summary**
🔹 **Inheritance** allows a child class to acquire properties of a parent class.  
🔹 Java supports **Single, Multilevel, Hierarchical, and Multiple Inheritance (via Interfaces)**.  
🔹 **Code reuse & modularity** are the main advantages.  

