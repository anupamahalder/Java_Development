### 1. **Limitations of OOP**
- Slower performance due to abstraction.
- Steeper learning curve.
- Not ideal for small/simple problems.
- Increased complexity and size.

---

### 2. **Seven Widely Used OOP Languages**
- Java  
- C++  
- Python  
- C#  
- Ruby  
- Kotlin  
- Swift  

---

### 3. **Purpose of Using OOP Concepts**
- To organize code using **objects**.
- Helps in **reusability**, **modularity**, **security**, and **easy maintenance**.

---

### 4. **Four Main Features of OOP**
1. **Encapsulation**  
2. **Inheritance**  
3. **Polymorphism**  
4. **Abstraction**

---

### 5. **OOP vs Structural Programming**

| OOP                          | Structural Programming             |
|-----------------------------|------------------------------------|
| Uses objects and classes     | Uses functions/procedures          |
| Emphasizes **data**         | Emphasizes **functions**           |
| Supports inheritance/polymorphism | No support for OOP features         |

---

### 6. **Pure Object-Oriented Language & Why Java Isn’t One**
- **Pure OOP**: Everything must be an object (e.g., Smalltalk).
- **Java isn't pure** because it uses **primitive data types** like `int`, `double` which aren't objects.

---

### 7. **Object and Class + Example**
- **Class**: Blueprint/template (e.g., `Car`).
- **Object**: Instance of a class (e.g., `myCar`).
```java
class Car {
    String color;
}
Car myCar = new Car();
```

---

### 8. **Characteristics of an Abstract Class**
- Can have both **abstract and non-abstract methods**.
- Cannot be instantiated.
- Used for **partial abstraction**.
- May have constructors and static methods.

---

### 9. **Can a Class Inherit Constructor?**
- **No**, constructors are **not inherited**, but child classes can call parent constructors using `super()`.

---

### 10. **Constructor Chaining**
- Calling one constructor from **another constructor** in the **same class** or **superclass**.
```java
class A {
    A() { this(10); }
    A(int x) { System.out.println(x); }
}
```

---

### 11. **Types of Variables in OOP**
1. **Instance variables** – Belong to object.
2. **Static/Class variables** – Shared across all objects.
3. **Local variables** – Declared inside methods.
4. **Parameters** – Passed to methods/constructors.

---
