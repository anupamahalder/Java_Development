# 📌 **Variables and Data Types in Java**

## 🔹 **Variables in Java**
A **variable** is a named storage location in memory that holds a value.

### ✅ **Types of Variables**
1️⃣ **Local Variables**  
   - Declared inside a method or block.  
   - Only accessible within that method/block.  
   - **Example:**
     ```java
     void show() {
         int x = 10;  // Local variable
         System.out.println(x);
     }
     ```

2️⃣ **Instance Variables** (Non-Static Variables)  
   - Declared inside a class but **outside** any method.  
   - Belongs to an **object** (each object gets a separate copy).  
   - **Example:**
     ```java
     class Example {
         int age = 25;  // Instance variable
     }
     ```

3️⃣ **Static Variables (Class Variables)**  
   - Declared using the `static` keyword.  
   - Shared among all objects of the class.  
   - **Example:**
     ```java
     class Example {
         static int count = 0;  // Static variable
     }
     ```

---

# 📌 **Data Types in Java**
Java is a **statically-typed** language, meaning variable types must be defined.

## 🔹 **Types of Data Types in Java**

Java data types are divided into two main categories:  
1️⃣ **Primitive Data Types** (Basic types like `int`, `char`, `boolean`, etc.)  
2️⃣ **Non-Primitive (Reference) Data Types** (Objects, arrays, strings, etc.)

---

## ✅ **1. Primitive Data Types**  
Primitive data types are the **basic building blocks** of Java programs.  
🔹 They store simple values directly in memory.  
🔹 Java has **8 primitive data types**, classified into four categories:

### 🔹 **1.1 Integer Types** (Whole numbers)
| Data Type | Size | Range | Default Value | Example |
|-----------|------|----------------------|--------------|---------|
| `byte`    | 1 byte | -128 to 127 | `0` | `byte a = 100;` |
| `short`   | 2 bytes | -32,768 to 32,767 | `0` | `short b = 30000;` |
| `int`     | 4 bytes | -2^31 to 2^31-1 | `0` | `int num = 100000;` |
| `long`    | 8 bytes | -2^63 to 2^63-1 | `0L` | `long bigNum = 9999999999L;` |

### 🔹 **1.2 Floating-Point Types** (Decimal numbers)
| Data Type | Size | Precision | Default Value | Example |
|-----------|------|-----------|--------------|---------|
| `float`   | 4 bytes | 6–7 decimal digits | `0.0f` | `float pi = 3.14f;` |
| `double`  | 8 bytes | 15–16 decimal digits | `0.0` | `double precise = 99.9999;` |

### 🔹 **1.3 Character Type**
| Data Type | Size | Stores | Default Value | Example |
|-----------|------|--------|--------------|---------|
| `char`    | 2 bytes | A single character | `'\u0000'` | `char letter = 'A';` |

### 🔹 **1.4 Boolean Type**
| Data Type | Size | Stores | Default Value | Example |
|-----------|------|--------|--------------|---------|
| `boolean` | 1 bit | `true` or `false` | `false` | `boolean isJavaFun = true;` |

---

## ✅ **2. Non-Primitive (Reference) Data Types**
Non-primitive data types **store memory addresses (references) instead of actual values**.  
They are derived from Java's **Object class** and can store multiple values.

### 🔹 **2.1 String Type**
- A `String` is an object that represents a sequence of characters.  
- Strings are **immutable** (cannot be changed after creation).  
- **Example:**
```java
  String greeting = "Hello, Java!";
``` 
### 🔹 **2.2 Array Type**
- Arrays store multiple values of the same data type.
- **Example:**
```java
int[] numbers = {1, 2, 3, 4, 5};
```
### 🔹 **2.3 Class Type**
- A class is a blueprint for creating objects.
- **Example:**
```java
class Car {
    String model = "Tesla";
}
```
### 🔹 **2.4 Interface Type**
- An interface is a contract that defines methods a class must implement.
- **Example:**
```java
interface Animal {
    void makeSound();
}
```
## 🎯 Key Takeaways for Variables and Datatypes
- ✔ Primitive Data Types store single values (int, double, char, etc.).
- ✔ Non-Primitive Data Types store references to objects (String, Arrays, Classes, etc.).
- ✔ Primitive types are stored in stack memory, while objects are stored in heap memory.
- ✔ Java is strongly typed, meaning every variable must have a defined type.
---
