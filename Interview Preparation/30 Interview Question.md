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




