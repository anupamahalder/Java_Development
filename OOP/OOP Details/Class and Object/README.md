## Object: 
Real life entity. (Phisical entity). Object will hold memory.

## Class:
Virtual entity. (Logical entity)
```java
class MyClass{
  public static void main(String[] args){
    // rest code
    // data members
    int number;
    String color;
    double price;

    // member functions
    int speed(int number, double price){
      // rest code
    }
    void sound(){
      // rest code
    }
  }
}
```

## Pillar of OOP:
## 1. Encapsulation:
Wrapping up data in a single unit. Used for security purposes. It is called data hiding 

```java
class Employee{
    private int empID = 2;
    private String name;
    private int phoneNumber = 123232;
    private double basicSalary = 20000;
    private int incentive = 400;
  
    // default constructor 
    Employee(){
        // this keyword to call another constructor (parameterized)
        this(120, "Unknown", 2284918, 22000);
    }

    // Constructor 
    Employee(int empID, String name, int phoneNumber, double basicSalary){
        this.empID = empID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.basicSalary = basicSalary;
    }

    private void countSalary(){
      System.out.println(basicSalary + incentive);
    }
  
    // Use getter and setter for implementing encapsulation
    // Getter
    public int getPhoneNumber(){
      return phoneNumber;
    }
    public int getEmpID(){
      return empID;
    }

    // Setter
    public void setPhoneNumber(int phoneNum){
        this.phoneNumber = phoneNum;
    }
  }
  
  class MainClass{
    public static void main(String[] args){
      Employee engineer = new Employee(213, "Sidharth", 343623, 5500);
      System.out.println("Engineer's details:-----------");
      System.out.println("Employee ID:" + engineer.getEmpID());
      System.out.println("Phone Number:" + engineer.getPhoneNumber());

      System.out.println("\nSoftware Engineer details:-----------");
      Employee softwareEngineer = new Employee();
      System.out.println("Employee ID:" + softwareEngineer.getEmpID());
      System.out.println("Phone Number:" + softwareEngineer.getPhoneNumber());
      softwareEngineer.setPhoneNumber(56789);
      System.out.println("New phone number: " + softwareEngineer.getPhoneNumber());
    }
  }
```
#### NOTE:
```java
private Employee{
  // Constructor
}
```
We will create private constructor of a class to not give access to create an object. Mostly for security access.

## 2. Abstraction:
- Abstraction is a process in which we hide the background implementation details. It provides only essential details. It is called implementation hiding.
- To implement abstraction we have
1. abstract keyword
2. interface (blueprint)
- We can achieve 100% abstraction using Interface because when we create abstract class there may or may not be abstract method. Abstract method is where we only declare the method name and will not specify the body of the method.
- We cannot create object of abstract class.

### 🔸 What is an Abstract Class?
An abstract class:
- Cannot be instantiated.
- Can contain **abstract methods** (methods without a body).
- Can also contain **concrete methods** (with implementation).

To **access abstract methods**, you must:
1. Create a **subclass** that **extends** the abstract class.
2. **Override** the abstract methods in the subclass.
3. Create an object of the **subclass** to use the overridden methods.

#### NOTE:
You can **override** a non-abstract method from a parent class in a child class in Java. This is a fundamental concept of **runtime polymorphism**.

##### 🔹 Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting
        a.sound();             // Output: Dog barks
    }
}
```

#### 🔸 Key Points:
- You **can override** any **non-static**, **non-final**, and **accessible** method.
- `@Override` is optional but **recommended** to catch errors at compile-time.
- Overriding gives the **subclass its own version** of the method.


### ✅ **Abstract Class Example: `Bank`**

```java
public abstract class Bank{
    abstract double getInterestRate(); // Abstract method

    public void bankInfo(){
        System.out.println("This is a generic bank");
    }
}

public class HDFC extends Bank{
    public double getInterestRate(){
        return 6.5;
    }
}

public class SBI extends Bank{
    public double getInterestRate(){
        return 7;
    }
}

public class MainClass{
    public static void main(String[] args) {
        // ➡️ Even though both are Bank references, the method behaves differently based on the
        // actual object (SBI, HDFC) — that’s runtime polymorphism!
        Bank b1 = new HDFC();
        Bank b2 = new SBI();

        b1.bankInfo();
        System.out.println(b1.getInterestRate()); // 6.5
        System.out.println(b2.getInterestRate()); // 7
    }
}
```

### 💡 Explanation:
- `Bank` is an abstract class because we can’t define a generic interest rate — it varies by bank.
- Concrete banks like `SBI` and `HDFC` provide specific interest rates using `getInterestRate()`.

---

### ✅ **Interface Example: `ATMService`**

```java
interface ATMService {
    void withdraw(double amount);
    void checkBalance();
}

class SBIATM implements ATMService {
    private double balance = 5000;

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class TestATM {
    public static void main(String[] args) {
        ATMService atm = new SBIATM();
        atm.checkBalance();
        atm.withdraw(1000);
        atm.checkBalance();
    }
}
```

### 💡 Explanation:
- `ATMService` is an interface — a contract that all ATMs must follow.
- `SBIATM` implements the interface and provides actual behavior for `withdraw()` and `checkBalance()`.

---
### Example:
Demonstrating how both a normal class and an abstract class can implement an interface in a single program.
```java
// Defining the interface
public interface Bank {
    // Abstract method to be implemented by any class that implements this interface
    public void openAccount();

    // Another abstract method to be implemented
    public void depositMoney(double amount);
}

// Abstract class implementing the Bank interface
public abstract class AbstractBank implements Bank {

    // Concrete method in the abstract class
    public void openAccount() {
        System.out.println("Opening an account in the abstract bank.");
    }

    // Abstract method can be partially implemented or left as abstract to be implemented by subclasses
    public abstract void depositMoney(double amount);
}

// Concrete class that extends the AbstractBank and implements the interface method
public class SBI extends AbstractBank {

    // Implementing the abstract method from the interface
    public void depositMoney(double amount) {
        System.out.println("Depositing " + amount + " into SBI account.");
    }

    // Optional: We can override openAccount() if needed, but we already inherited it from AbstractBank
    @Override
    public void openAccount() {
        System.out.println("Opening an SBI account.");
    }
}

// Another concrete class implementing the interface directly
class HDFC implements Bank {

    // Implementing the interface methods
    public void openAccount() {
        System.out.println("Opening an HDFC account.");
    }

    public void depositMoney(double amount) {
        System.out.println("Depositing " + amount + " into HDFC account.");
    }
}

public class MainClass {
    public static void main(String[] args) {

        // Creating an object of SBI (concrete class extending abstract class)
        Bank sbi = new SBI();
        sbi.openAccount();
        sbi.depositMoney(5000.0);

        // Creating an object of HDFC (directly implementing the interface)
        Bank hdfc = new HDFC();
        hdfc.openAccount();
        hdfc.depositMoney(10000.0);
    }
}
```

### Output:
```
Opening an SBI account.
Depositing 5000.0 into SBI account.
Opening an HDFC account.
Depositing 10000.0 into HDFC account.
```

### Explanation:

1. **Interface `Bank`:**  
   - Defines abstract methods `openAccount()` and `depositMoney(double amount)`.
   - These methods must be implemented by any class that implements the `Bank` interface.

2. **Abstract Class `AbstractBank`:**  
   - Implements the `Bank` interface partially, meaning it provides a concrete implementation of `openAccount()` but leaves the `depositMoney(double amount)` method abstract (to be implemented by subclasses).
   
3. **Concrete Class `SBI`:**  
   - Extends the abstract class `AbstractBank` and provides the implementation for the `depositMoney(double amount)` method.
   - It inherits the `openAccount()` method from `AbstractBank` but can override it if needed.

4. **Concrete Class `HDFC`:**  
   - Directly implements the `Bank` interface and provides concrete implementations for both `openAccount()` and `depositMoney(double amount)` methods.

### Benefits:
- **Flexibility**: Both the abstract class and the concrete class can implement the interface, offering flexibility in code structure.
- **Reusability**: Code from `AbstractBank` can be reused in the `SBI` class while still requiring concrete implementation for specific behaviors.
- 
---
## 3. Inheritance:

**Inheritance** is a fundamental concept in Object-Oriented Programming (OOP) that allows a class (called a subclass or derived class) to inherit properties and behaviors (fields and methods) from another class (called a superclass or base class). Inheritance promotes code reusability and establishes a relationship between the base and derived classes.

### Types of Inheritance:

1. **Single Inheritance:**
   - A subclass inherits from only one superclass.
   - Example: `class Dog extends Animal { }`

2. **Multilevel Inheritance:**
   - A subclass is derived from another subclass, forming a chain of inheritance.
   - Example: `class Animal { }`, `class Mammal extends Animal { }`, `class Dog extends Mammal { }`

3. **Hierarchical Inheritance:**
   - Multiple subclasses inherit from a single superclass.
   - Example: `class Animal { }`, `class Dog extends Animal { }`, `class Cat extends Animal { }`

4. **Multiple Inheritance (Not allowed in Java):**
   - A subclass inherits from multiple superclasses. Java does not support this directly, but we can simulate it using interfaces.
   - Example (simulated in Java using interfaces):
     ```java
     interface Animal { }
     interface Pet { }
     class Dog implements Animal, Pet { }
     ```

5. **Hybrid Inheritance (Not allowed in Java):**
   - A combination of multiple types of inheritance (e.g., a subclass that inherits from multiple classes and also participates in multilevel inheritance).
   - This is not allowed in Java directly to avoid complexity and ambiguity (like the "Diamond Problem").

### Benefits of Inheritance:
- **Code Reusability**: The child class can reuse the methods and properties of the parent class.
- **Method Overriding**: The child class can provide its own specific implementation of a method inherited from the parent class.
- **Establishes Relationship**: It creates a natural hierarchy between the classes.

### Example of Inheritance:
```java
// Parent Class
class Language {
    private String name;

    // Constructor 
    Language(){
        this.name = "Programming language"; // Initalizing if not initalized
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
    public void setAdditionalName(String name){
        this.name = this.name + ": " + name;
    }

    // Getter method
    public void getName() {
        System.out.println("Language name: " + name);
    }
}

// Child Class 1 - Overrides setName
class CPP extends Language {
    @Override
    public void setName(String name) {
        super.setName("C++: " + name); // Prefixes "C++" to the name
    }
}

// Child Class 2 - Inherits without overriding
class Java extends Language {
    // Inherits everything as is
}

// Main class
public class MainClass {
    public static void main(String[] args) {

        CPP cpp = new CPP();
        cpp.setName("Object-Oriented");
        cpp.getName(); // Output: Language name: C++: Object-Oriented

        Java java = new Java();
        java.setName("Java");
        java.setAdditionalName("Platform Independent");
        java.getName(); // Output: Language name: Java: Platform Independent
    }
}
```

---
