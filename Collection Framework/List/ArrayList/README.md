# **ArrayList in Java**  

## **1️⃣ What is `ArrayList`?**  
`ArrayList` is a **resizable** array implementation of the `List` interface in Java. Unlike regular arrays, an `ArrayList` **can grow and shrink dynamically** when elements are added or removed.

---

## **2️⃣ Key Features of `ArrayList`**
✔ **Dynamic size** – No need to define size beforehand  
✔ **Indexed access** – Elements can be accessed using index numbers  
✔ **Allows duplicates** – Stores duplicate elements  
✔ **Maintains insertion order** – Elements appear in the order they were inserted  
✔ **Not synchronized** – Not thread-safe by default  

---

## **3️⃣ Creating an `ArrayList`**
We must import `java.util.ArrayList` before using it.

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Printing elements
        System.out.println("ArrayList: " + list);
    }
}
```
**🔹 Output:**
```
ArrayList: [Apple, Banana, Cherry]
```
✅ **Grows dynamically**  
✅ **Maintains order of insertion**  

---

## **4️⃣ Common Methods in `ArrayList`**
| **Method** | **Description** |
|------------|----------------|
| `add(E e)` | Adds an element to the list |
| `add(int index, E e)` | Inserts an element at a specific index |
| `get(int index)` | Retrieves an element at a given index |
| `set(int index, E e)` | Updates an element at a specific index |
| `remove(int index)` | Removes an element at the specified index |
| `size()` | Returns the number of elements |
| `contains(Object o)` | Checks if the list contains an element |
| `indexOf(Object o)` | Returns the index of the first occurrence of an element |
| `clear()` | Removes all elements from the list |
| `isEmpty()` | Checks if the list is empty |

---

## **5️⃣ Accessing and Updating Elements**
We use `get()` to access elements and `set()` to update them.

### **Example: Access and Modify Elements**
```java
import java.util.ArrayList;

public class ModifyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Car");
        list.add("Bike");
        list.add("Bus");

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // Modifying an element
        list.set(1, "Scooter");
        System.out.println("Updated List: " + list);
    }
}
```
**🔹 Output:**
```
Element at index 1: Bike
Updated List: [Car, Scooter, Bus]
```
✅ **Access elements using `get()`**  
✅ **Modify elements using `set()`**  

---

## **6️⃣ Removing Elements from an `ArrayList`**
We can remove elements by **index** or by **value**.

### **Example: Removing Elements**
```java
import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        // Remove by index
        list.remove(1);

        // Remove by value
        list.remove("Green");

        System.out.println("Updated List: " + list);
    }
}
```
**🔹 Output:**
```
Updated List: [Red]
```
✅ **Efficient removal using `remove()`**  

---

## **7️⃣ Iterating Over an `ArrayList`**
We can iterate using:
1. **For loop**
2. **Enhanced for-each loop**
3. **Iterator**
4. **Stream API**

### **Example: Iterating with Different Loops**
```java
import java.util.*;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        // Using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Using for-each loop
        System.out.println("\nUsing for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Using iterator
        System.out.println("\nUsing iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using Stream API
        System.out.println("\nUsing Stream API:");
        numbers.stream().forEach(System.out::println);
    }
}
```
**🔹 Output:**
```
Using for loop:
10
20
30
40

Using for-each loop:
10
20
30
40

Using iterator:
10
20
30
40

Using Stream API:
10
20
30
40
```
✅ **Multiple ways to traverse an `ArrayList`**  

---

## **8️⃣ Sorting an `ArrayList`**
We use `Collections.sort()` to sort elements.

### **Example: Sorting**
```java
import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Mumbai", "Delhi", "Chennai", "Kolkata"));

        // Sorting alphabetically
        Collections.sort(cities);
        System.out.println("Sorted List: " + cities);
    }
}
```
**🔹 Output:**
```
Sorted List: [Chennai, Delhi, Kolkata, Mumbai]
```
✅ **Sorts elements in ascending order**  

---

## **9️⃣ Converting `ArrayList` to an Array**
We use `toArray()` to convert an `ArrayList` to an array.

### **Example: Convert `ArrayList` to Array**
```java
import java.util.*;

public class ConvertToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));

        // Convert to array
        String[] array = list.toArray(new String[0]);

        System.out.println("Array: " + Arrays.toString(array));
    }
}
```
**🔹 Output:**
```
Array: [Java, Python, C++]
```
✅ **Useful when array operations are needed**  

---

## **🔟 Real-World Example: Student Records**
We can use `ArrayList` to store and manage student records.

### **Example: Managing Student Names**
```java
import java.util.*;

public class StudentRecords {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        
        // Adding students
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        // Printing students
        System.out.println("Students: " + students);

        // Checking if "Bob" exists
        if (students.contains("Bob")) {
            System.out.println("Bob is in the list.");
        }

        // Removing a student
        students.remove("Alice");

        System.out.println("Updated Student List: " + students);
    }
}
```
**🔹 Output:**
```
Students: [Alice, Bob, Charlie]
Bob is in the list.
Updated Student List: [Bob, Charlie]
```
✅ **Used for dynamic storage in applications**  

---

## **📌 Summary**
✔ **`ArrayList` is a dynamic array implementation of `List`**  
✔ **Supports adding, removing, and modifying elements**  
✔ **Allows duplicates and maintains insertion order**  
✔ **Iterated using loops, iterators, or streams**  
✔ **Can be sorted and converted to arrays**  
