# 🔄 Type Casting in Java
- Type casting in Java is the process of converting one data type into another. 
- Java supports two types of type casting:

## 🔹 1. Implicit Type Casting (Widening)
- Automatically converts a smaller data type to a larger one.
- No data loss occurs.
- **Example:**
```java
int num = 10;
double d = num; // int to double (widening)
System.out.println(d); // Output: 10.0
```

### ✅ Allowed conversions:
byte → short → int → long → float → double


## 🔹 2. Explicit Type Casting (Narrowing)
- Manually converts a larger data type to a smaller one.
- May result in data loss.
- **Syntax:**
```java
dataType variable = (dataType) value;
```
- **Example:**
```java
double d = 10.99;
int num = (int) d; // double to int (narrowing)
System.out.println(num); // Output: 10 (decimal part lost)
```

### ✅ Allowed conversions:
double → float → long → int → short → byte

## 🔹 3. Type Casting with Wrapper Classes
- Used to convert primitive types to objects and vice versa.
- **Example:**
```java
int num = 100;
Integer obj = Integer.valueOf(num); // Boxing
int newNum = obj.intValue(); // Unboxing
```

## 🎯 Key Points
- ✔ **Widening (implicit)** happens automatically.
- ✔ **Narrowing (explicit)** requires manual casting.
- ✔ Data loss can occur in narrowing.
- ✔ Wrapper classes help in object-type conversions.
---

# 🚀 **Advanced Type Casting in Java**  

Beyond **basic implicit and explicit type casting**, Java also provides **advanced type casting techniques**, especially useful in **OOP (Object-Oriented Programming)**.

## 🔹 **1. Type Casting in Inheritance (Upcasting & Downcasting)**
When working with **parent and child classes**, type casting helps in polymorphism.

### **✅ Upcasting (Implicit)**
- **Converting a child class object to its parent class type**.
- **No explicit casting required**.
- **Only parent class methods and properties are accessible**.

```java
class Animal {
    void sound() {
        System.out.println("Animals make sound...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks...");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting (Implicit)
        myAnimal.sound(); // Allowed
        // myAnimal.bark(); // ❌ Not allowed (Child-specific method)
    }
}
```

### 🔹 **Why Use Upcasting?**
- ✔ Helps in **polymorphism**.  
- ✔ Parent reference can hold **any child object**.  

---

### **✅ Downcasting (Explicit)**
- **Converting a parent class object back to its child type**.
- **Requires explicit casting**.
- **Unsafe if not done properly (throws `ClassCastException` if incorrect)**.

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks...");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        Dog myDog = (Dog) myAnimal; // Downcasting (Explicit)
        myDog.bark(); // Allowed now
    }
}
```

### 🔹 **Why Use Downcasting?**
- ✔ Allows access to **child-specific methods**.  
- ❌ **Risky** if object isn't actually of child type.  

### 💡 **Safe Downcasting using `instanceof`**  
```java
if (myAnimal instanceof Dog) {
    Dog myDog = (Dog) myAnimal;
    myDog.bark();
}
```

---

## 🔹 **2. Type Casting with Interfaces**
- **Interfaces cannot be instantiated**, but their references can hold objects of classes that implement them.
- **Type casting allows invoking specific methods from an interface reference**.

```java
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
    
    void honk() {
        System.out.println("Car is honking...");
    }
}

public class InterfaceCasting {
    public static void main(String[] args) {
        Vehicle v = new Car(); // Upcasting
        v.start();
        
        // Downcasting to access Car-specific methods
        Car myCar = (Car) v;
        myCar.honk();
    }
}
```

---

## 🔹 **3. Type Casting with Generics**
Generics ensure **type safety** and **reduce the need for explicit casting**.

```java
import java.util.ArrayList;

public class GenericsCasting {
    public static void main(String[] args) {
        // Using Generics (Safe)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        int num = list.get(0); // No need for casting
        
        // Without Generics (Unsafe)
        ArrayList rawList = new ArrayList();
        rawList.add("Hello");
        String str = (String) rawList.get(0); // Explicit casting required
    }
}
```

### 🔹 **Why Use Generics?**
- ✔ Avoids **ClassCastException**.  
- ✔ Eliminates unnecessary casting.  

---

## 🎯 **Key Takeaways**
- ✔ **Upcasting:** Child → Parent (Implicit, Safe).  
- ✔ **Downcasting:** Parent → Child (Explicit, Use `instanceof`).  
- ✔ **Interfaces & Type Casting:** Helps in **polymorphism**.  
- ✔ **Generics & Type Safety:** Avoid **manual casting** and runtime errors.
- ✔ Upcasting → Automatic, Parent reference for Child Object
- ✔ Downcasting → Manual, Use instanceof for safety
- ✔ Interface Casting → Useful in Polymorphism
- ✔ Generics → Eliminates unnecessary casting errors

  
  
