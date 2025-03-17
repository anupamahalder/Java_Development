## **📌 Encapsulation in Java**  

### **🔹 What is Encapsulation?**  
Encapsulation is one of the four main **OOP principles** in Java. It is the process of **hiding data** within a class and allowing access only through public methods (getters and setters). This prevents direct modification of variables, ensuring **data security and integrity**.

### **🔹 Key Features of Encapsulation:**
✅ **Data Hiding** – Restricts direct access to class variables.  
✅ **Controlled Access** – Variables can only be accessed via public methods.  
✅ **Improves Maintainability** – Easier to modify and extend code.  
✅ **Protects Object Integrity** – Prevents accidental modification of data.  

---

## **🔹 How to Achieve Encapsulation in Java?**
1. **Declare variables as `private`** (restricts direct access).  
2. **Provide `public` getter and setter methods** to access and update variables.  
3. **Encapsulate class behavior** using methods that operate on private data.  

---

## **🔹 Example of Encapsulation in Java**
```java
// Encapsulated Class
class Student {
    // Private data members (data hiding)
    private String name;
    private int age;

    // Public getter method (read access)
    public String getName() {
        return name;
    }

    // Public setter method (write access)
    public void setName(String newName) {
        this.name = newName;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age (ensures valid age)
    public void setAge(int newAge) {
        if (newAge > 0) { // Validation
            this.age = newAge;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }
}

// Main class
public class EncapsulationExample {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting values using setter methods
        s1.setName("Anupama");
        s1.setAge(95);

        // Getting values using getter methods
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());

        // Trying to set an invalid age
        s1.setAge(-5); // Will display an error message
    }
}
```

✅ **Output:**
```
Student Name: Anupama
Student Age: 24
Age cannot be negative!
```

---

## **🔹 Why Use Encapsulation?**
🔹 **Improves Security** – Prevents unauthorized access.  
🔹 **Enhances Code Maintainability** – Changes in one part of the code don’t affect others.  
🔹 **Allows Validation** – Ensures only valid data is stored.  
🔹 **Encapsulates Complexity** – Hides unnecessary details from users.  

---

## **🔹 Real-World Example of Encapsulation**
Think of **Encapsulation like a Bank Account**:  
✔ Your **account balance (private variable)** is hidden.  
✔ You can **only deposit or withdraw money (public methods)** with certain rules.  
✔ No one can directly **modify** your balance.  

```java
class BankAccount {
    private double balance; // Private variable (data hiding)

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative!");
        }
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Getter method to check balance
    public double getBalance() {
        return balance;
    }
}

// Main class
public class Bank {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(5000); // Initial balance
        myAccount.deposit(2000);
        myAccount.withdraw(3000);
        System.out.println("Current Balance: " + myAccount.getBalance());
    }
}
```

✅ **Output:**
```
Deposited: 2000
Withdrawn: 3000
Current Balance: 4000
```

---

## **📌 Summary of Encapsulation:**
| **Feature**       | **Description** |
|------------------|----------------|
| **Data Hiding**  | Prevents direct access to class variables (declared as `private`). |
| **Controlled Access** | Provides `public` getter and setter methods. |
| **Validation**   | Ensures only valid data is stored in variables. |
| **Security**     | Protects object data from unauthorized modification. |
| **Maintainability** | Changes in one part of code do not affect others. |
