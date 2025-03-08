# 📌 **Wrapper Classes in Java**

## 🔹 **What is a Wrapper Class?**
A **wrapper class** in Java is an **object representation** of a primitive data type.  
Java provides **wrapper classes** to **convert** primitive data types (`int`, `char`, `boolean`, etc.) into objects.  
This is useful when working with collections (like `ArrayList`) that require objects instead of primitive types.

| **Primitive Type** | **Wrapper Class** |
|--------------------|------------------|
| `byte`            | `Byte`            |
| `short`           | `Short`           |
| `int`             | `Integer`         |
| `long`            | `Long`            |
| `float`           | `Float`           |
| `double`          | `Double`          |
| `char`            | `Character`       |
| `boolean`         | `Boolean`         |

---

## 🔹 **Why Use Wrapper Classes?**
✔ **Primitive types cannot be used in collections** (like `ArrayList<Integer>`).  
✔ **Convert between primitive and objects** (Boxing & Unboxing).  
✔ **Useful for utility methods** (`Integer.parseInt()`, `Double.valueOf()`).  
✔ **Allows null values**, unlike primitive types.  

---

## 🔹 **Example: Using Wrapper Class**
```java
public class WrapperExample {
    public static void main(String[] args) {
        // Primitive to Wrapper (Boxing)
        int num = 10;
        Integer obj = Integer.valueOf(num);  // Explicit Boxing
        Integer obj2 = num; // Auto-Boxing

        // Wrapper to Primitive (Unboxing)
        int num2 = obj.intValue();  // Explicit Unboxing
        int num3 = obj2; // Auto-Unboxing

        System.out.println("Primitive: " + num);
        System.out.println("Wrapper Object: " + obj);
        System.out.println("Unboxed Value: " + num2);
    }
}
```
### 🔹 Output
```
Primitive: 10
Wrapper Object: 10
Unboxed Value: 10
```
---
# 🤔 **Why is Java Not 100% Object-Oriented?**

Java is considered **"not 100% Object-Oriented"** because it **supports primitive data types** like `int`, `char`, `boolean`, etc.  
In a **pure OOP language**, everything should be an **object**, but Java includes **non-object** primitive types.

---

## 🔹 **Reasons Why Java is Not Fully OOP**
| 🔢 **Reason** | 🔍 **Explanation** |
|--------------|------------------|
| **1️⃣ Presence of Primitive Data Types** | Java has `int`, `double`, `char`, `boolean`, etc., which are not objects. A fully OOP language should treat **everything as an object**. |
| **2️⃣ Static Methods (e.g., `Math.pow()`)** | Static methods belong to **class-level**, not object-level. This violates OOP principles since **objects should control behavior**. |
| **3️⃣ Operators Not as Methods** | In Java, operators (`+`, `-`, `*`, etc.) work with primitives directly. In **fully OOP languages** (like Smalltalk), even arithmetic operations are done through **methods**. |
| **4️⃣ No Multiple Inheritance (Directly)** | Java does not support **multiple class inheritance** to avoid ambiguity, but true OOP languages allow it. Instead, Java uses **interfaces**. |
| **5️⃣ Presence of `static` Keyword** | `static` variables and methods belong to a class, not an object, which contradicts OOP concepts. |

---

## 🔹 **How Java Achieves OOP with Workarounds**
✔ **Wrapper Classes** (`Integer`, `Double`, `Boolean`, etc.) allow primitives to behave as objects.  
✔ **Encapsulation, Inheritance, Polymorphism, and Abstraction** are fully supported.  
✔ **Collections and Generics** work with objects instead of primitives. 
✔ **Autoboxing** converts **primitive → object** (Wrapper class).
✔ **Unboxing** converts **object → primitive** (Loses object properties).
✔ After unboxing, the value is stored as a primitive, not as an object anymore.
✔ This means **Java is not 100% Object-Oriented** because it still allows **primitives** after unboxing.

---

## 🎯 **Conclusion**
🚀 Java is **Object-Oriented**, but **not 100% pure OOP** because of **primitive types and static methods**.  
However, Java maintains a balance between **performance (using primitives)** and **OOP concepts**.  
To be fully OOP, **everything must be an object**, like in **Smalltalk or Python**.
