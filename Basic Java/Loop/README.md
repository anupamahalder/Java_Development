## **🔁 Loops in Java**  

Loops in Java help execute a block of code repeatedly based on a condition. There are **four** types of loops in Java:  

1️⃣ **for loop**  
2️⃣ **while loop**  
3️⃣ **do-while loop**  
4️⃣ **for-each loop** *(used for arrays & collections)*  

---

## **1️⃣ `for` Loop (Entry-Controlled Loop)**
🔹 The `for` loop runs **a fixed number of times**. It consists of **initialization, condition, and increment/decrement**.  

### **Syntax**  
```java
for(initialization; condition; update) {  
    // Code to execute
}
```

### **Example: Print numbers from 1 to 5**
```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}
```
**🔹 Explanation:**  
✔ `i = 1`: Initialization (starting point)  
✔ `i <= 5`: Condition (loop runs till `i` reaches 5)  
✔ `i++`: Increment (`i` increases by 1 each iteration)  

🔹 **When to use?**  
✅ When the number of iterations is known beforehand.  

---

## **2️⃣ `while` Loop (Entry-Controlled Loop)**
🔹 The `while` loop executes **as long as the condition is true**.  
🔹 Used when the number of iterations is **unknown**.  

### **Syntax**  
```java
while(condition) {  
    // Code to execute
}
```

### **Example: Print numbers from 1 to 5**
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;  // Initialization
        while (i <= 5) {  // Condition
            System.out.println("Count: " + i);
            i++;  // Increment
        }
    }
}
```
**🔹 Explanation:**  
✔ The loop **first checks the condition**, then executes the block.  
✔ If `i > 5`, the loop **won't run**.  

🔹 **When to use?**  
✅ When the number of iterations is unknown but the **condition is clear**.  

---

## **3️⃣ `do-while` Loop (Exit-Controlled Loop)**
🔹 **Executes at least once**, even if the condition is false.  
🔹 The condition is checked **after** execution.  

### **Syntax**  
```java
do {  
    // Code to execute
} while (condition);
```

### **Example: Print numbers from 1 to 5**
```java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;  // Initialization
        do {
            System.out.println("Count: " + i);
            i++;  // Increment
        } while (i <= 5);  // Condition
    }
}
```
**🔹 Explanation:**  
✔ The loop **runs at least once** even if the condition is `false`.  

🔹 **When to use?**  
✅ When we need to execute the loop **at least once**, even if the condition is false.  

---

## **4️⃣ `for-each` Loop (Enhanced `for` Loop)**
🔹 Special loop used to **iterate through arrays and collections**.  
🔹 **Simpler syntax** compared to a `for` loop.  

### **Syntax**  
```java
for(dataType variable : arrayName) {  
    // Code to execute
}
```

### **Example: Print elements of an array**
```java
public class ForEachLoopExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};  // Array
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
```
**🔹 Explanation:**  
✔ Directly **iterates through each element** of the array.  
✔ No need for index variables like `i`.  

🔹 **When to use?**  
✅ When working with **arrays or collections** (like `ArrayList`).  

---

## **🔹 Loop Control Statements**
Java provides three **control statements** to modify loop execution:

1️⃣ **`break` Statement** → Terminates the loop **immediately**.  
2️⃣ **`continue` Statement** → Skips the current iteration and moves to the next one.  
3️⃣ **`return` Statement** → Exits from the loop **and the method**.  

### **Example: Using `break` and `continue`**
```java
public class LoopControlExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping 3 using continue...");
                continue;  // Skips iteration when i = 3
            }
            if (i == 5) {
                System.out.println("Breaking at 5...");
                break;  // Exits loop when i = 5
            }
            System.out.println("Count: " + i);
        }
    }
}
```
🔹 **Output:**
```
Count: 1
Count: 2
Skipping 3 using continue...
Count: 4
Breaking at 5...
```

---

## **📌 Summary Table**
| Loop Type | Condition Check | Runs at Least Once? | Best Use Case |
|-----------|---------------|-----------------|--------------|
| **for** | Before execution | No | When number of iterations is known |
| **while** | Before execution | No | When condition controls repetition |
| **do-while** | After execution | Yes | When we want at least one execution |
| **for-each** | N/A (Iterates over elements) | N/A | Iterating over arrays/collections |

---

### **🎯 Key Takeaways**
✔ `for` → Best when iteration count is **known**.  
✔ `while` → Best when iteration count is **unknown**.  
✔ `do-while` → Ensures **at least one execution**.  
✔ `for-each` → Simplifies **array/collection iteration**.  
