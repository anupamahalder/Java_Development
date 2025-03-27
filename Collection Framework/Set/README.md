# **Set in Java**

The **`Set`** interface in Java is a part of the **Java Collection Framework (JCF)** and is used to **store unique elements** in an **unordered collection**. Unlike `List`, `Set` **does not allow duplicate elements** and follows **mathematical set properties**.

---

## **1️⃣ Key Features of `Set`**
✔ **No Duplicates Allowed** → Each element is unique  
✔ **Unordered Collection** → Elements may not maintain insertion order  
✔ **Efficient Searching** → Uses hashing or tree structures  
✔ **Allows Null Value** → But only one null element is allowed  
✔ **Supports Iteration** → `for`, `forEach()`, `Iterator`  

---

## **2️⃣ Set Interface & Implementations**
The `Set` interface has **three major implementations**:

| **Implementation** | **Characteristics** |
|-------------------|-------------------|
| `HashSet` | Fastest (uses HashMap internally), no ordering |
| `LinkedHashSet` | Maintains insertion order, slightly slower |
| `TreeSet` | Sorted order (ascending by default), uses a balanced tree |

---

## **3️⃣ Creating a Set in Java**
We can create a `Set` using different implementations:

### **Example 1: Creating and Using a `HashSet`**
```java
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        // Adding elements
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("India"); // Duplicate element, will be ignored

        // Displaying elements
        System.out.println("Countries Set: " + countries);

        // Checking if an element exists
        System.out.println("Contains USA? " + countries.contains("USA"));

        // Removing an element
        countries.remove("UK");

        // Iterating over elements
        System.out.println("Updated Countries:");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
```
**🔹 Output:**
```
Countries Set: [USA, UK, India]
Contains USA? true
Updated Countries:
USA
India
```
✅ **No duplicates (India appears only once)**  
✅ **Unordered collection (Output order may vary)**  

---

## **4️⃣ Iterating Over a Set**
We can iterate over a `Set` in multiple ways:

### **Example 2: Iterating Using Different Methods**
```java
import java.util.*;

public class SetIterationExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));

        // 1️⃣ Using for-each loop
        System.out.println("Using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 2️⃣ Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3️⃣ Using forEach() (Java 8+)
        System.out.println("\nUsing forEach:");
        numbers.forEach(System.out::println);
    }
}
```
✅ **Multiple ways to iterate a Set**  
✅ **forEach() is the easiest method (Java 8+)**  

---

## **5️⃣ Different Types of Set Implementations**
| **Feature** | **HashSet** | **LinkedHashSet** | **TreeSet** |
|------------|------------|----------------|-----------|
| **Storage Mechanism** | Hash Table (uses `HashMap`) | Linked Hash Table | Balanced Tree (`TreeMap`) |
| **Allows Duplicates?** | ❌ No | ❌ No | ❌ No |
| **Insertion Order Maintained?** | ❌ No | ✅ Yes | ❌ No (Sorted Order) |
| **Null Elements Allowed?** | ✅ Yes (Only one) | ✅ Yes (Only one) | ❌ No |
| **Performance (Best Case)** | ✅ `O(1)` | ✅ `O(1)` | ❌ `O(log n)` |
| **Sorting** | ❌ No Sorting | ❌ No Sorting | ✅ Sorted (Ascending) |

---

## **6️⃣ Real-World Example of Set**
### **Unique Employee IDs Management**
```java
import java.util.*;

public class EmployeeSet {
    public static void main(String[] args) {
        Set<Integer> employeeIds = new HashSet<>();

        // Adding employee IDs
        employeeIds.add(101);
        employeeIds.add(102);
        employeeIds.add(103);
        employeeIds.add(101);  // Duplicate, will be ignored

        // Displaying employee IDs
        System.out.println("Unique Employee IDs: " + employeeIds);

        // Checking if an ID exists
        System.out.println("Is 102 present? " + employeeIds.contains(102));

        // Removing an employee ID
        employeeIds.remove(103);

        System.out.println("Updated Employee IDs: " + employeeIds);
    }
}
```
**🔹 Output:**
```
Unique Employee IDs: [101, 102, 103]
Is 102 present? true
Updated Employee IDs: [101, 102]
```
✅ **Ensures unique IDs**  
✅ **Efficient lookups (`contains()`)**  

---

## **7️⃣ Sorting a `TreeSet`**
If we need a **sorted Set**, we can use `TreeSet`:

### **Example 4: Sorting a Set Using `TreeSet`**
```java
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> cities = new TreeSet<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Chennai");

        System.out.println("Sorted Cities: " + cities);
    }
}
```
**🔹 Output (Sorted Order):**
```
Sorted Cities: [Bangalore, Chennai, Delhi, Mumbai]
```
✅ **Maintains sorted order (Alphabetical in this case)**  
✅ **Uses `O(log n)` operations**  

---

## **8️⃣ Set Methods & Functions**
| **Method** | **Description** |
|------------|----------------|
| `add(E e)` | Adds an element (ignores duplicates) |
| `remove(Object o)` | Removes an element |
| `contains(Object o)` | Checks if an element exists |
| `size()` | Returns Set size |
| `isEmpty()` | Checks if Set is empty |
| `clear()` | Removes all elements |
| `iterator()` | Returns an iterator for traversal |

---

## **9️⃣ When to Use Which Set?**
| **Scenario** | **Best Set Type** |
|-------------|----------------|
| Need fast lookups & uniqueness | `HashSet` |
| Need to maintain insertion order | `LinkedHashSet` |
| Need sorted unique elements | `TreeSet` |

---

## **🔟 Conclusion**
🔹 `Set` is an **unordered collection** that **does not allow duplicates**  
🔹 `HashSet` is **fastest**, `LinkedHashSet` keeps **insertion order**, `TreeSet` keeps **sorted order**  
🔹 **Sorting, Iteration & Searching** are easy with `Set`  
