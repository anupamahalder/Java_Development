# **Polymorphism in Java**  

**Polymorphism** is one of the core concepts of **Object-Oriented Programming (OOP)** in Java. It allows a single interface (method, object, or class) to behave differently based on the context. The word **polymorphism** comes from the Greek words *poly* (many) and *morph* (forms), meaning "many forms."

---

## **🔹 Types of Polymorphism in Java**
Java supports **two types of polymorphism**:

1. **Compile-time Polymorphism (Method Overloading)**
2. **Runtime Polymorphism (Method Overriding)**

---

## **1️⃣ Compile-time Polymorphism (Method Overloading)**
**📌 What is it?**  
- It occurs when multiple methods in the **same class** have the **same name** but different **parameters (different number, type, or order of arguments)**.  
- The method that gets executed is determined **at compile-time** based on the method signature.

### **Example of Method Overloading**
```java
class Calculator {
    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters (different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters (different data type)
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));          // Calls method with 2 int parameters
        System.out.println(calc.add(5, 10, 15));      // Calls method with 3 int parameters
        System.out.println(calc.add(5.5, 2.5));       // Calls method with 2 double parameters
    }
}
```
**📝 Output:**
```
15
30
8.0
```
**✅ Key Points:**
- The method name is **same** (`add`), but parameters are **different**.
- **The compiler decides which method to call at compile-time** based on the argument list.

---

## **2️⃣ Runtime Polymorphism (Method Overriding)**
**📌 What is it?**  
- Occurs when a **subclass (child class) provides a specific implementation of a method** that is already defined in its **superclass (parent class)**.  
- The method that gets executed is determined **at runtime** (not compile-time) based on the object type.  
- Achieved using **method overriding** and **upcasting (parent reference to child object).**

### **Example of Method Overriding**
```java
// Parent Class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child Class
class Car extends Vehicle {
    @Override
    void start() {  // Overriding method from Vehicle class
        System.out.println("Car is starting with a key...");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car(); // Polymorphism (parent reference holding child object)
        myVehicle.start();  // Calls overridden method in Car
    }
}
```
**📝 Output:**
```
Car is starting with a key...
```
**✅ Key Points:**
- **Overriding happens when a subclass provides a specific implementation** of a method already defined in its parent class.
- The method that gets called **depends on the actual object type, not the reference type** (this is called **dynamic method dispatch**).
- The **@Override annotation** ensures that the method is correctly overriding a parent method.

---

## **🔹 Difference Between Overloading & Overriding**
| Feature | Method Overloading | Method Overriding |
|---------|------------------|------------------|
| Definition | Multiple methods with the **same name but different parameters** in the **same class** | Subclass provides a **specific implementation of a method from the parent class** |
| Method Signature | Different parameter list | Same parameter list |
| Return Type | Can be different | Must be same or a subtype (Covariant return type) |
| Access Modifier | Can be different | Cannot reduce visibility (e.g., public → private is not allowed) |
| Execution | Decided at **compile-time** | Decided at **runtime** |
| Object Type | Only one class is involved | Parent class reference can hold child class object |

---

## **🔹 Real-World Example of Polymorphism**
### **Scenario: Payment System (Overriding & Overloading)**
```java
// Parent Class
class Payment {
    void pay() {
        System.out.println("Payment processing...");
    }
}

// Subclasses with specific implementations
class CreditCardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done via Credit Card.");
    }
}

class PayPalPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done via PayPal.");
    }
}

// Overloading: Different ways to pay
class OnlineStore {
    void checkout(int amount) {
        System.out.println("Paid " + amount + " using default method.");
    }

    void checkout(int amount, String method) {
        System.out.println("Paid " + amount + " using " + method + ".");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Runtime Polymorphism (Overriding)
        Payment payment;
        payment = new CreditCardPayment();
        payment.pay();  // Calls CreditCardPayment's pay()

        payment = new PayPalPayment();
        payment.pay();  // Calls PayPalPayment's pay()

        // Compile-time Polymorphism (Overloading)
        OnlineStore store = new OnlineStore();
        store.checkout(1000);
        store.checkout(2000, "UPI");
    }
}
```
**📝 Output:**
```
Payment done via Credit Card.
Payment done via PayPal.
Paid 1000 using default method.
Paid 2000 using UPI.
```

---

## **🔹 Key Takeaways**
1. **Polymorphism** allows **one interface to be used for different types of objects**.
2. **Method Overloading (Compile-time Polymorphism)** – Multiple methods with the **same name but different parameters** in the **same class**.
3. **Method Overriding (Runtime Polymorphism)** – A subclass **redefines** a method from its **superclass**, and the **method call is resolved at runtime**.
4. **Real-world applications** include **payment systems, database connections, and logging frameworks** where different implementations are required.
