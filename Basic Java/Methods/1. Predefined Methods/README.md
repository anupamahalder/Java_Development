# **1. Predefined (Built-in) Methods in Java**
Predefined methods are built-in methods that Java provides in standard libraries like `Math`, `String`, `Arrays`, and `System`.

These methods **eliminate the need for writing extra logic**, as Java has already implemented them for us.

---

## **📌 Categories of Predefined Methods**
1. **Math Methods** (`Math` class)  
2. **String Methods** (`String` class)  
3. **Array Methods** (`Arrays` class)  
4. **Input/Output Methods** (`System` class)

---

## **📝 1. Math Methods (Perform Mathematical Operations)**
The `Math` class provides functions for mathematical calculations like finding the square root, power, max/min values, etc.

### **📌 Example: Math Methods**
```java
public class MathMethodsExample {
    public static void main(String[] args) {
        System.out.println("Maximum of 10 and 20: " + Math.max(10, 20));
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("Power of 2^3: " + Math.pow(2, 3));
        System.out.println("Absolute value of -10: " + Math.abs(-10));
        System.out.println("Random number: " + Math.random()); // Generates a random number between 0 and 1
    }
}
```
### **🧐 Explanation**
- `Math.max(a, b)`: Returns the maximum of two numbers.
- `Math.sqrt(x)`: Returns the square root of `x`.
- `Math.pow(a, b)`: Returns `a` raised to the power `b`.
- `Math.abs(x)`: Returns the absolute (positive) value of `x`.
- `Math.random()`: Generates a random number between 0 and 1.

---

## **📝 2. String Methods (Perform Operations on Strings)**
Java provides multiple string methods to manipulate text.

### **📌 Example: String Methods**
```java
public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        System.out.println("Length of string: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (0 to 5): " + str.substring(0, 5));
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));
    }
}
```
### **🧐 Explanation**
- `str.length()`: Returns the length of the string.
- `str.toUpperCase()`: Converts all characters to uppercase.
- `str.toLowerCase()`: Converts all characters to lowercase.
- `str.substring(a, b)`: Extracts part of a string from index `a` to `b-1`.
- `str.replace(old, new)`: Replaces old substring with a new one.

---

## **📝 3. Arrays Methods (Perform Operations on Arrays)**
Java provides built-in methods to sort, search, and manipulate arrays.

### **📌 Example: Arrays Methods**
```java
import java.util.Arrays; // Importing Arrays class

public class ArraysMethodsExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9};

        Arrays.sort(numbers); // Sort the array
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 8); // Search for number 8
        System.out.println("Index of 8: " + index);

        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }
}
```
### **🧐 Explanation**
- `Arrays.sort(arr)`: Sorts the array in ascending order.
- `Arrays.toString(arr)`: Converts the array into a string representation.
- `Arrays.binarySearch(arr, key)`: Searches for a key in a sorted array and returns its index.
- `Arrays.copyOf(arr, newSize)`: Copies elements of `arr` into a new array of given size.

---

## **📝 4. System Methods (Input and Output Operations)**
Java provides predefined methods in the `System` class to interact with input/output.

### **📌 Example: System Methods**
```java
public class SystemMethodsExample {
    public static void main(String[] args) {
        System.out.println("This is a built-in method!"); // Prints output
        System.err.println("This is an error message!"); // Prints error message

        long startTime = System.currentTimeMillis(); // Get current time in milliseconds
        for (int i = 0; i < 1000000; i++) {} // Dummy loop for time calculation
        long endTime = System.currentTimeMillis();

        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}
```
### **🧐 Explanation**
- `System.out.println(x)`: Prints `x` with a new line.
- `System.err.println(x)`: Prints error messages in red.
- `System.currentTimeMillis()`: Returns the current time in milliseconds.

---

## **🎯 Conclusion**
Predefined methods in Java make programming easier by providing built-in functionality. They:
- **Reduce code complexity**
- **Improve performance**
- **Provide reliability (as they are well-tested)**
