## Java Interview Questions

### 1. What is the difference between JDK, JRE, and JVM?
- JDK (Java Development Kit) is a software development kit that includes tools for developing and compiling Java applications.
- JRE (Java Runtime Environment) provides the necessary runtime environment to execute Java applications.
- JVM (Java Virtual Machine) is a virtual machine responsible for running Java bytecode (.class file after compilation) on a specific platform (Windows/Linux/MacOS).
---
### 2. How many types of memory areas are allocated by JVM?
1. **Class Area:** Stores per-class structures like runtime constant pool, field, method data, and code for methods.
2. **Heap**: Runtime data area where memory is allocated to objects.
3. **Stack**:Holds local variables and partial results, crucial for method invocation and resturn. Each thread has a private JVM stack, with frames created for method invocations and destroyed upon completion.
4. **Program Counter Register**: Contains the address of the curreently executing Java Virtual machine instruction.
5. **Native Method Stack**: Holds all native methods used in the application.
---
### 3. Is Java 100% Object Oriented programming, if no then why?
No, Java is not 100% object-oriented because it has primitive(int, double) data types, static members, and supports procedural(One by one code execution) programming.
1. **Primitive Data Types:**
- Java has 8 `primitive types` (e.g., int, char, boolean) which are not objects.
2. **Static Members:**
- `static` methods and variables belong to the class, not objects. You can access them without creating objects.
3. **Procedural Programming:**
- Java allows writing code `sequentially` using methods in a procedural style, like C. 
4. **Primitive Wrapper Classes:**
- Java provides `wrapper classes` (like Integer, Double) to make primitives behave like objects, but the core types are still not objects.
5. **String in Java:**
- `String` behaves like an object, but Java has special handling for it (e.g., string pool, + operator overloading), which bends strict OOP rules.
- Although String is a class (object), the fact that it is built using `char[]` — and `char` is primitive — means Java relies partly on non-object data types.

---
### 4. Why is the main method is static?
- Beacuse the object is not required to call the static method. If we make the main method non-static, JVM will have to create its object first and then call main() method which lead to the extra memory allocation.
---
### 5. Can we execute a program without main() method?
- Yes, it was possible before JDK 1.7 using static block. Since JDK 1.7 it is not possible.
---
### 6. How is exception handling implemented in Java?
- Java uses `try-catch` blocks to handle exceptions.
- Code that may `throw` an exception is enclosed within the `try` block, and corresponding exception handling is performed in the `catch` block.
- Additionally, `fianlly` blocks can be used to ensure certain code is executed regardless of wheather an exception occurs or not.
---
### 7. Can you catch multiple exceptions in a single catch block in Java?
- Yes, starting from Java 7, we can catch multiple exceptions in a single catch block using a multi-catch syntax.
---
### 8. What are the main principles of object-oriented programming?
- Encapsulation, Inheritance, Polymorphism, and Abstraction (EIPA).
---
### 9. What is the between abstract classes and interfaces?
- Abstract classes can have both abstract and concrete methods, while interfaces can only have abstract methods (Java 8 onwords can have default and static methods in interfaces).
---
### 10. What is the use of "static" keyword in Java?
- The `static` keyword is used to define class-level members (variables and methods) that belong to the class itself rather than to instances of the class.
---
### 11. Why can't we create static constructors in Java?
1. Constructors are used to create instances of a class.
2. static means something belongs to the class, not instances.
3. Therefore, a constructor can’t be static — because that would contradict its purpose.
---
### 12. What is the purpose of the "final" keyword in Java? 
- The `final` keyword is used to make a variable constant, a method unchangeable (cannot be overridden), or a class not extensible (cannot be subclassed).
---
### 13. What is the difference between String, StringBuilder, and StringBuffer?
- **String**: Immutable (cannot be changed after creation).
- **StringBuilder**: Mutable (can be modified without creating a new object). Not thread-safe.
- **StringBuffer**: Similar to StringBuilder but thread-safe.
---
### 14. Hpow does Java handle multiple exceptions in a try-catch block?
- Multiple catch blocks can be used to handle different types of exceptions separately.
---
### 15. What is the difference between == and .equals() method in Java?
- `==` is used for reference comparison (checking if two objects point to the same memory location), while `.equals()` is used for content comparison (checking if two objects have the same content or values).
```java
String a = new String("Hello");
String b = new String("Hello");

System.out.println(a == b); // false – because different memory locations
```
```java
String a = new String("Hello");
String b = new String("Hello");

System.out.println(a.equals(b)); // true – because values are same
```
--- 
### 16. hat are the access modifiers in Java, and what do they signify?
- Access modifiers control the visibility of classes, variables, and methods in Java.
- `public`: Accessible from any class.
- `protected`: Accessible within the package and subclasses.
- `default`(no modifier): Accessible within the package.
- `private`: Accessible only within the class. (child class cannot be accessed if any methods/variables are in private)
---
### 17. Explain the concept of method overloading.
- Method overloading allows mutiple methods with the same name but different parameters (number or types of parameters) within the same class.
---
### 18. Difference between method overloading and method overriding.
- **Method Overloading**: Same method name with different parameters in the same class – happens at `compile-time`.
- **Method Overriding**: Same method name and parameters in parent-child classes – happens at `run-time`.
---
### 19. Difference between Run-time polymorphism and compile-time polymorphism.

#### ✅ **Compile-time Polymorphism (Method Overloading)**  
1. **Decided at compile time** – multiple methods with the same name but different parameters.  
2. Achieved using **method overloading**.

```java
class Demo {
    void show(int a) { System.out.println("int"); }
    void show(String s) { System.out.println("String"); }
}
```
#### ✅ **Runtime Polymorphism (Method Overriding)**  
1. **Decided at runtime** – method in subclass overrides the method in superclass.  
2. Achieved using **method overriding** and **inheritance**.

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
}
```
---
### 20. Difference between Run-time and Compile-time.
- **Compile-time**:
Errors are checked before the program runs (e.g., syntax errors, type mismatches).
➤ Happens when you compile the code.
- **Run-time**:
Errors occur while the program is running (e.g., dividing by zero, null pointer).
➤ Happens when you execute the code.
---
### 21. What is Java Collection Framework?
- The Java Collection Framework a set of interfaces, classes and algorithm, that provide various data structures like lists, sets, queues, and maps to store, manage, and manipulate collections of objects.












