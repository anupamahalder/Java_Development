# 📝 Comments in Java
Comments in Java are used to make code more readable and help developers understand the logic. Java ignores comments during compilation.

## 🔹 Types of Comments in Java
### 1️⃣ Single-line Comment (//)
Used for short explanations or disabling code.

```java
// This is a single-line comment
System.out.println("Hello, Java!"); // Printing message
```

### 2️⃣ Multi-line Comment (/* ... */)
Used for detailed descriptions or disabling multiple lines of code.

```java
/* This is a multi-line comment.
   It can span multiple lines. */
System.out.println("Multi-line comment example.");
```

### 3️⃣ Documentation Comment (/** ... */)
Used to generate API documentation using Javadoc.

```java
/**
 * This class demonstrates Java comments.
 * @author Anupama
 * @version 1.0
 */
public class CommentExample {
    /**
     * This method prints a message.
     * @param name The user's name
     */
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
}
```

## 🎯 Why Use Comments?
- ✅ Improves code readability
- ✅ Helps in debugging
- ✅ Generates documentation
  
