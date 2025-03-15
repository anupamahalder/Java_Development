# **📌 Understanding Arrays in Java**  

## **🔹 What is an Array?**  
An **array** in Java is a **fixed-size** collection of elements of the **same data type**. It stores elements in **contiguous memory locations** and allows **random access** using an index.

✅ **Key Features of Arrays:**  
- **Fixed size** (cannot grow/shrink dynamically).  
- **Index-based access** (zero-based index).  
- **Homogeneous** (stores elements of the same type).  
- **Efficient for searching and sorting.**  

---

## **🔹 Types of Arrays in Java**
Java supports three types of arrays:  

1️⃣ **Single-Dimensional Array** → Linear structure.  
2️⃣ **Multi-Dimensional Array** → Like a table or matrix.  
3️⃣ **Jagged Array** → Rows can have different column sizes.  

---

## **1️⃣ Single-Dimensional Array**
**📌 Declaration and Initialization:**  
```java
int[] arr = new int[5];  // Array of size 5
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;
```
**OR (Direct Initialization)**
```java
int[] arr = {10, 20, 30, 40, 50};
```

**✅ Example: Traversing an Array**
```java
class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Using a for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Using an enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
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
50
Using enhanced for loop:
10
20
30
40
50
```

---

## **2️⃣ Multi-Dimensional Array (2D Array)**
A **2D array** is an array of arrays (like a matrix).

**📌 Declaration & Initialization:**
```java
int[][] matrix = { 
    {1, 2, 3}, 
    {4, 5, 6}, 
    {7, 8, 9} 
};
```

**✅ Example: Traversing a 2D Array**
```java
class MultiDimArray {
    public static void main(String[] args) {
        int[][] matrix = { 
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9} 
        };

        // Using nested loops
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line for each row
        }
    }
}
```

**🔹 Output:**
```
1 2 3
4 5 6
7 8 9
```

---

## **3️⃣ Jagged Array**
A **jagged array** is a special type of **2D array** where each row can have a different number of columns.

**✅ Example:**
```java
class JaggedArrayExample {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][]; // 3 rows, but columns not defined

        // Defining different column sizes for each row
        jaggedArray[0] = new int[]{1, 2};     
        jaggedArray[1] = new int[]{3, 4, 5};  
        jaggedArray[2] = new int[]{6, 7, 8, 9}; 

        // Printing the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

**🔹 Output:**
```
1 2
3 4 5
6 7 8 9
```

---

## **🔹 Common Array Operations**
| **Operation** | **Example** |
|--------------|------------|
| **Finding Length** | `arr.length` |
| **Sorting** | `Arrays.sort(arr)` |
| **Copying** | `Arrays.copyOf(arr, newSize)` |
| **Searching** | `Arrays.binarySearch(arr, key)` |

✅ **Example: Sorting & Searching**
```java
import java.util.Arrays;
class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 10, 30};

        Arrays.sort(arr); // Sort the array
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 30); // Binary search (Only works in sorted arrays)
        System.out.println("Index of 30: " + index);
    }
}
```

**🔹 Output:**
```
Sorted Array: [10, 20, 30, 40, 50]
Index of 30: 2
```

---

## **🔹 Advantages & Disadvantages of Arrays**
### ✅ **Advantages**
✔️ **Fast Access** (O(1) time complexity for index-based access).  
✔️ **Memory Efficient** (contiguous memory).  
✔️ **Easy Sorting & Searching** using in-built methods.  

### ❌ **Disadvantages**
❌ **Fixed Size** (Cannot grow dynamically, unlike `ArrayList`).  
❌ **Insertion & Deletion is Costly** (Shifting required).  

---

## **🔹 When to Use Arrays?**
- If you **know the size** of the data beforehand.  
- When you need **fast random access** (O(1) lookup).  
- When the **insertion & deletion rate is low** (otherwise, `ArrayList` is better).  

---

## **📌 Summary**
✅ **Types of Arrays in Java:** <br>
1️⃣ **Single-Dimensional Array** → Fixed-size linear storage.  
2️⃣ **Multi-Dimensional Array** → Matrix-like structure.  
3️⃣ **Jagged Array** → Rows with different sizes.  

✅ **Common Operations:** Sorting, Searching, Copying.  
✅ **Pros & Cons:** Fast access but fixed size.  
✅ **Use Case:** Best when size is known and memory efficiency is needed.  
