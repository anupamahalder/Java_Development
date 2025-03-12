### **📌 Understanding the Classification of User-Defined Methods in Java**  

User-defined methods in Java can be classified in **two ways**:  

1️⃣ **Based on Return Type and Parameters** → (The four basic types)  
2️⃣ **Based on Functionality and Behavior** → (Other specialized types)  

---

## **1️⃣ Classification Based on Return Type & Parameters**
This is the **most basic** classification:  

| **Method Type** | **Description** |
|----------------|---------------|
| **Method without Return Type & No Parameters** | Does not return a value and does not take any input. |
| **Method without Return Type but with Parameters** | Takes input values but does not return anything. |
| **Method with Return Type but No Parameters** | Returns a value but does not take any input. |
| **Method with Return Type and Parameters** | Takes input and returns a value. |

✅ **Example:**  
```java
class BasicMethods {
    void greet() { // No return, no parameter
        System.out.println("Hello!");
    }

    void add(int a, int b) { // No return, but has parameters
        System.out.println("Sum: " + (a + b));
    }

    int getNumber() { // Returns a value, no parameters
        return 100;
    }

    int multiply(int x, int y) { // Returns value, has parameters
        return x * y;
    }

    public static void main(String[] args) {
        BasicMethods obj = new BasicMethods();
        obj.greet();  
        obj.add(5, 3); 
        System.out.println("Number: " + obj.getNumber());
        System.out.println("Product: " + obj.multiply(4, 5));
    }
}
```
---

## **2️⃣ Classification Based on Functionality & Behavior**
Apart from return type and parameters, **methods can be categorized based on how they behave and their role in the program**:  

| **Method Type**         | **Purpose** |
|------------------------|------------|
| **Instance Method**    | Belongs to an object, requires an instance to call. |
| **Static Method**      | Belongs to a class, can be called without an object. |
| **Abstract Method**    | Declared but not implemented in an abstract class. |
| **Final Method**       | Cannot be overridden in child classes. |
| **Synchronized Method**| Ensures only one thread executes at a time. |
| **Recursive Method**   | Calls itself for repetitive tasks. |
| **Getter/Setter**      | Used to access and modify private variables. |

✅ **Example for Each Type:**  

```java
abstract class Animal {  
    abstract void makeSound(); // Abstract Method
}

class Dog extends Animal {
    void makeSound() { // Implementing abstract method
        System.out.println("Dog barks");
    }
}

class MethodsExample {
    int instanceVar = 10; // Instance variable

    // Instance Method
    void display() {
        System.out.println("Instance Method: " + instanceVar);
    }

    // Static Method
    static void showMessage() {
        System.out.println("This is a static method.");
    }

    // Final Method
    final void finalMethod() {
        System.out.println("This is a final method.");
    }

    // Recursive Method
    int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Synchronized Method
    synchronized void printNumbers(int n) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(n * i);
        }
    }

    // Getter/Setter
    private String name;
    void setName(String newName) { name = newName; }
    String getName() { return name; }

    public static void main(String[] args) {
        MethodsExample obj = new MethodsExample();
        obj.display();  // Instance Method
        showMessage();  // Static Method
        obj.finalMethod();  // Final Method
        System.out.println("Factorial of 5: " + obj.factorial(5)); // Recursive Method
        
        obj.setName("Anupama");
        System.out.println("Student Name: " + obj.getName()); // Getter
        
        Dog myDog = new Dog();
        myDog.makeSound(); // Abstract Method Implementation
    }
}
```

---

## **📌 Summary**
### **🔹 Main Classifications of User-Defined Methods:**
1️⃣ **Based on Return Type & Parameters**  
   - With or without return values  
   - With or without parameters  

2️⃣ **Based on Functionality & Behavior**  
   - **Instance, Static, Abstract, Final, Synchronized, Recursive, Getter/Setter**  
