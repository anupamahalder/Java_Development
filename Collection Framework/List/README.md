## **List in Java**

The **`List`** interface in Java is a part of the **Java Collection Framework (JCF)** and is used to **store ordered collections** of elements. It allows **duplicates** and provides **indexed access** to elements.

---

## **1️⃣ Key Features of `List`**
✔ **Ordered Collection** → Maintains insertion order  
✔ **Allows Duplicates** → Same values can be stored multiple times  
✔ **Indexed Access** → Access elements via index (`get(index)`)  
✔ **Resizable** → `ArrayList` & `LinkedList` can dynamically grow/shrink  
✔ **Supports Iteration** → `for`, `forEach()`, `Iterator`  

---

## **2️⃣ List Interface & Implementations**
The `List` interface has **four major implementations**:

| **Implementation** | **Characteristics** |
|-----------------|-----------------|
| `ArrayList` | Fast access (`get()`), dynamic array, better for reading |
| `LinkedList` | Fast insertion/removal, uses nodes, better for modifications |
| `Vector` | Synchronized version of `ArrayList`, thread-safe |
| `Stack` | LIFO (Last In, First Out), extends `Vector` |

---

## **3️⃣ Creating a List in Java**
We can create a `List` using different implementations:

### **Example 1: Creating and Using an `ArrayList`**
```java
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");  // Duplicates allowed

        // Displaying elements
        System.out.println("Fruits List: " + fruits);

        // Accessing an element
        System.out.println("First fruit: " + fruits.get(0));

        // Modifying an element
        fruits.set(1, "Orange");

        // Removing an element
        fruits.remove("Mango");

        System.out.println("Updated Fruits List: " + fruits);
    }
}
```
**🔹 Output:**
```
Fruits List: [Apple, Banana, Mango, Apple]
First fruit: Apple
Updated Fruits List: [Apple, Orange, Apple]
```

✅ **Maintains insertion order**  
✅ **Allows duplicate values**  
✅ **Provides index-based access**  

---

## **4️⃣ Iterating Over a List**
We can iterate over a `List` in multiple ways:

### **Example 2: Iterating Using Different Methods**
```java
import java.util.*;

public class ListIterationExample {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("New York", "London", "Paris", "Tokyo");

        // 1️⃣ Using a for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        // 2️⃣ Using an enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (String city : cities) {
            System.out.println(city);
        }

        // 3️⃣ Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4️⃣ Using forEach() (Java 8+)
        System.out.println("\nUsing forEach:");
        cities.forEach(System.out::println);
    }
}
```
✅ **Multiple ways to iterate a List**  
✅ **forEach() is the easiest method (Java 8+)**  

---

## **5️⃣ List Implementations & Their Differences**
| **Feature** | **ArrayList** | **LinkedList** | **Vector** | **Stack** |
|------------|-------------|-------------|--------|--------|
| **Storage** | Dynamic array | Doubly linked list | Dynamic array | Inherits `Vector` |
| **Insertion Order** | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |
| **Allows Duplicates** | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |
| **Fast Random Access** | ✅ Yes (`O(1)`) | ❌ No (`O(n)`) | ✅ Yes (`O(1)`) | ✅ Yes (`O(1)`) |
| **Insertion/Deletion Speed** | ❌ Slow (`O(n)`) | ✅ Fast (`O(1)`) | ❌ Slow (`O(n)`) | ❌ Slow (`O(n)`) |
| **Thread Safety** | ❌ No | ❌ No | ✅ Yes | ✅ Yes |

---

## **6️⃣ Real-World Example of List**
### **Student Management System**
```java
import java.util.*;

class Student {
    String name;
    int id;
    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Adding students
        students.add(new Student(101, "Alice"));
        students.add(new Student(102, "Bob"));
        students.add(new Student(103, "Charlie"));

        // Displaying students
        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Removing a student
        students.remove(1);
        System.out.println("\nAfter removing Bob:");
        students.forEach(System.out::println);
    }
}
```
**🔹 Output:**
```
Student List:
101 - Alice
102 - Bob
103 - Charlie

After removing Bob:
101 - Alice
103 - Charlie
```
✅ **Practical use case for managing student records**  
✅ **Easy removal and retrieval using List**  

---

## **7️⃣ List Methods & Functions**
| **Method** | **Description** |
|------------|----------------|
| `add(E e)` | Adds an element |
| `get(int index)` | Returns element at given index |
| `remove(int index)` | Removes element at index |
| `set(int index, E element)` | Updates element at index |
| `contains(Object o)` | Checks if List contains element |
| `size()` | Returns List size |
| `isEmpty()` | Checks if List is empty |

---

## **8️⃣ Sorting a List**
We can **sort a `List`** using the **Collections API**.

### **Example: Sorting a List**
```java
import java.util.*;

public class SortingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        
        // Sorting in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted List (Ascending): " + numbers);
        
        // Sorting in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + numbers);
    }
}
```
**🔹 Output:**
```
Sorted List (Ascending): [1, 2, 3, 5, 8]
Sorted List (Descending): [8, 5, 3, 2, 1]
```
✅ **Sorting with `Collections.sort()`**  
✅ **`reverseOrder()` for descending sort**  

---

## **9️⃣ When to Use Which List?**
| **Scenario** | **Best List Type** |
|-------------|----------------|
| Need fast access (`get(index)`) | `ArrayList` |
| Need frequent insertions/removals | `LinkedList` |
| Need thread-safe collection | `Vector` |
| Need Last-In-First-Out (LIFO) | `Stack` |

---

## **🔟 Conclusion**
🔹 `List` is an **ordered collection** that allows **duplicates**  
🔹 `ArrayList` is best for **fast access**, `LinkedList` is best for **modifications**  
🔹 `Vector` is **thread-safe**, `Stack` follows **LIFO**  
🔹 **Sorting, Iterating & Searching** are easy with `List`  
