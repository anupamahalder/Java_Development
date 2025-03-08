# 📌 Keywords in Java
Java has 50 reserved keywords that have predefined meanings and cannot be used as identifiers (variable names, method names, class names, etc.).

## 🔹 Categories of Java Keywords
### 1️⃣ Data Type Keywords
Used to define data types.

| Keyword	| Description |
|---------|-------------|
| `byte` |	8-bit integer |
| `short`	| 16-bit integer |
| `int` |	32-bit integer |
| `long` |	64-bit integer |
| `float` |	Single-precision floating point |
| `double` | Double-precision floating point |
| `char` |	16-bit character |
| `boolean` |	Stores true or false |

## 2️⃣ Access Modifiers
Used to set access levels.

| Keyword |	Description |
|---------|-------------|
| `public` |	Accessible from anywhere |
| `private` |	Accessible only within the class |
| `protected` |	Accessible within the package and subclasses |
| `default`	| Accessible within the same package (if no modifier is specified) |

## 3️⃣ Control Flow Statements
Used for decision-making and looping.

| Keyword |	Description |
|---------|-------------|
| `if` |	Executes a block if a condition is true |
| `else` |	Executes a block if if condition is false |
| `switch` |	Selects among multiple options |
| `case` |	Defines a condition in switch |
| `default` |	Defines a default block in switch |
| `for` |	Looping structure |
| `while` |	Looping structure |
| `do` |	Executes loop body at least once |
| `break` |	Exits a loop or switch case |
| `continue`|	Skips the current iteration and proceeds to the next|

## 4️⃣ Class & Object Keywords
Used for defining classes and objects.

| Keyword |	Description |
|---------|-------------|
| `class` |	Defines a class |
| `interface` |	Defines an interface |
| `extends`	| Inherits from a superclass |
| `implements` |	Implements an interface |
| `new`	| Creates a new object |
| `this` |	Refers to the current instance |
| `super` |	Refers to the parent class |

## 5️⃣ Exception Handling Keywords 
Used for handling exceptions.

| Keyword |	Description |
|---------|-------------|
| `try` |	Defines a block to test code for exceptions |
| `catch` |	Handles exceptions |
| `finally` |	Block that executes after try-catch, always runs |
| `throw`	| Throws an exception manually |
| `throws` |	Declares exceptions a method might throw |

## 6️⃣ Method-Related Keywords
Used for defining and modifying methods.

| Keyword |	Description |
|---------|-------------|
| `void` |	Specifies that a method returns no value |
| `return` |	Exits a method and optionally returns a value |
| `static` |	Declares a static method or variable (shared by all instances) |
| `final`	| Declares constants, prevents method overriding & inheritance |
| `abstract` |	Declares an abstract class or method |
| `synchronized` |	Ensures thread-safe execution |

## 7️⃣ Multi-threading Keywords
Used in concurrent programming.

| Keyword |	Description |
|---------|-------------|
| `synchronized` |	Ensures only one thread executes a block at a time |
| `volatile` |	Ensures visibility of changes across threads |

## 8️⃣ Memory Management Keywords
Used for garbage collection and memory handling.

| Keyword |	Description |
|---------|-------------|
| `null` |	Represents an empty reference |
| `new`	| Allocates memory for objects |
| `finalize` |	Called before an object is garbage collected |

## 9️⃣ Package & Import Keywords
Used for organizing and importing code.

| Keyword |	Description |
|---------|-------------|
| `package`	| Defines a package (namespace) |
| `import` | Imports classes from other packages |

## 🔟 Instance & Type Checking Keywords
Used to check object types.

| Keyword |	Description |
|---------|-------------|
| `instanceof` |	Checks if an object is an instance of a class |
| `typeof`	| (Not available in Java, used in JavaScript) |

## 1️⃣1️⃣ Miscellaneous Keywords

| Keyword |	Description |
|---------|-------------|
| `enum` |	Defines a fixed set of constants |
| `transient` |	Prevents serialization of a variable |
| `assert` |	Used for debugging to check conditions |
| `strictfp` |	Ensures floating-point calculations follow IEEE standards |
| `native` |	Specifies a method implemented in another language (like C/C++) |

## ❌ Keywords That Are Reserved but Unused in Java
| Keyword |	Notes |
|---------|-------|
| `goto` |	Reserved but not used (discouraged due to readability issues) |
| `const` | Replaced by final |

---
## 🎯 Key Points to Remember
- ✅ Case-Sensitive: All keywords are in lowercase.
- ✅ Cannot be used as Identifiers: You cannot name a variable int, class, or if.
- ✅ Some Keywords Are Unused: goto and const are reserved but not used.
  
