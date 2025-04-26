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
abstract class Bank {
    abstract double getInterestRate(); // Abstract method

    void bankInfo() {
        System.out.println("This is a generic bank.");
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.2;
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        b1.bankInfo();
        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
    }
}
```

### 💡 Explanation:
- `Bank` is an abstract class because we can’t define a generic interest rate — it varies by bank.
- Concrete banks like `SBI` and `HDFC` provide specific interest rates using `getInterestRate()`.

---

## ✅ **Interface Example: `ATMService`**

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





