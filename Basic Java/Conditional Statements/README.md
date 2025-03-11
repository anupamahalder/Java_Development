## **🔹 Conditional Statements in Java**
Conditional statements allow a program to make decisions and execute different code blocks based on conditions.

### **🔸 1. if Statement**
The `if` statement executes a block of code **only if the condition is true**.

```java
int age = 18;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
}
```
✔ **If the condition is false, the code inside `{}` will be skipped.**


---

### **🔸 2. if-else Statement**
The `if-else` statement provides an **alternative block** if the condition is false.

```java
int age = 16;
if (age >= 18) {
    System.out.println("You can vote.");
} else {
    System.out.println("You cannot vote yet.");
}
```

✔ **If the condition is false, the `else` block executes.**


---

### **🔸 3. if-else-if Ladder**
Used when we have **multiple conditions** to check.

```java
int marks = 75;
if (marks >= 90) {
    System.out.println("Grade: A+");
} else if (marks >= 80) {
    System.out.println("Grade: A");
} else if (marks >= 70) {
    System.out.println("Grade: B");
} else {
    System.out.println("Grade: C");
}
```
✔ **Executes only the first true condition and skips the rest.**


---

### **🔸 4. Nested if Statements**
We can place an `if` statement inside another `if` statement.

```java
int num = 10;
if (num > 0) {
    if (num % 2 == 0) {
        System.out.println("Positive Even Number");
    } else {
        System.out.println("Positive Odd Number");
    }
}
```
✔ **The inner `if` is executed only if the outer `if` condition is true.**


---

### **🔸 5. switch Statement (Better than if-else for multiple conditions)**
Used when we compare **one variable against multiple values**.

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```
✔ **`break` stops execution after a case matches, preventing fall-through.**  
✔ **Use `default` to handle unexpected values.**


---

### **🔸 6. Ternary Operator (Shorter if-else)**
A compact way to write simple conditions.

```java
int num = 10;
String result = (num % 2 == 0) ? "Even" : "Odd";
System.out.println(result);
```
✔ **If the condition is true, it returns the first value, else the second.**  


---

## **📌 Summary Table**
| Statement | Used for | Example |
|-----------|---------|---------|
| `if` | Single condition | `if (a > b) {}` |
| `if-else` | Two conditions | `if (a > b) {} else {}` |
| `if-else-if` | Multiple conditions | `if (a > b) {} else if (a == b) {}` |
| `Nested if` | Condition inside another condition | `if (a > 0) { if (a % 2 == 0) {}}` |
| `switch` | Many cases for one variable | `switch (day) { case 1: break; }` |
| Ternary `? :` | Short if-else | `a > b ? "Big" : "Small"` |

---

### **✅ Conclusion**
- Use **if-else** for general conditions.
- Use **switch** when checking **one variable against multiple values**.
- Use **ternary operator** for simple conditions.

🚀 **Conditional statements help control the flow of a Java program efficiently!**  
