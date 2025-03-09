### **🔹 Operators in Java (Short Summary)**  

Operators in Java are special symbols that perform operations on variables and values.  

#### **1️⃣ Arithmetic Operators**  
Used for basic mathematical operations.  
| Operator | Meaning       | Example (a=10, b=5) | Result |
|----------|-------------|------------------|--------|
| `+`      | Addition     | `a + b`          | `15`   |
| `-`      | Subtraction  | `a - b`          | `5`    |
| `*`      | Multiplication | `a * b`        | `50`   |
| `/`      | Division     | `a / b`          | `2`    |
| `%`      | Modulus (Remainder) | `a % b`  | `0`    |

---

#### **2️⃣ Relational (Comparison) Operators**  
Used to compare values, returns `true` or `false`.  
| Operator | Meaning       | Example (`a=10, b=5`) | Result |
|----------|-------------|------------------|--------|
| `==`     | Equal to     | `a == b`         | `false`|
| `!=`     | Not equal to | `a != b`         | `true` |
| `>`      | Greater than | `a > b`          | `true` |
| `<`      | Less than    | `a < b`          | `false`|
| `>=`     | Greater or equal | `a >= b`   | `true` |
| `<=`     | Less or equal | `a <= b`       | `false`|

---

#### **3️⃣ Logical Operators**  
Used to perform logical operations (mainly in conditions).  
| Operator | Meaning       | Example (`a=10, b=5`) | Result |
|----------|-------------|------------------|--------|
| `&&`     | AND (Both true) | `(a > 5 && b < 10)` | `true` |
| `||`     | OR (Either true) | `(a > 5 || b > 10)` | `true` |
| `!`      | NOT (Reverse) | `!(a > b)`      | `false`|

---

#### **4️⃣ Bitwise Operators**  
Works at the **bit level** (useful in low-level programming).  
| Operator | Meaning       | Example (`a=5, b=3`) | Result |
|----------|-------------|------------------|--------|
| `&`      | AND          | `a & b` (`0101 & 0011`) | `0001` (1) |
| `|`      | OR           | `a | b` (`0101 | 0011`) | `0111` (7) |
| `^`      | XOR          | `a ^ b` (`0101 ^ 0011`) | `0110` (6) |
| `~`      | Complement   | `~a` (Inverts bits) | `-6` |
| `<<`     | Left Shift   | `a << 1` (Multiply by 2) | `10` |
| `>>`     | Right Shift  | `a >> 1` (Divide by 2) | `2` |

---

#### **5️⃣ Assignment Operators**  
Used to assign values to variables.  
| Operator | Meaning       | Example (`a = 10`) | Equivalent To |
|----------|-------------|------------------|--------------|
| `=`      | Assign      | `a = 10`         | `a = 10` |
| `+=`     | Add & Assign | `a += 5`        | `a = a + 5` |
| `-=`     | Subtract & Assign | `a -= 3`  | `a = a - 3` |
| `*=`     | Multiply & Assign | `a *= 2`  | `a = a * 2` |
| `/=`     | Divide & Assign | `a /= 2`    | `a = a / 2` |
| `%=`     | Modulus & Assign | `a %= 3`  | `a = a % 3` |

---

#### **6️⃣ Unary Operators**  
Work on a single operand.  
| Operator | Meaning       | Example (`a = 5`) | Result |
|----------|-------------|------------------|--------|
| `+`      | Positive    | `+a`             | `5`    |
| `-`      | Negative    | `-a`             | `-5`   |
| `++`     | Increment   | `a++` or `++a`   | `6`    |
| `--`     | Decrement   | `a--` or `--a`   | `4`    |

---

#### **7️⃣ Ternary Operator (`?:`)**  
Shorthand for `if-else`.  
```java
int num = 10;
String result = (num > 5) ? "Greater" : "Smaller";
System.out.println(result);  // Output: Greater
```

---
# NOTE:
## In Java, the bitwise shift operators include:

- 1️⃣ Left Shift (<<) – Shifts bits to the left, filling with 0s.
- 2️⃣ Right Shift (>>) – Shifts bits to the right, preserving the sign bit (arithmetic shift).
- 3️⃣ Unsigned Right Shift (>>>) – Shifts bits to the right, filling with 0s (logical shift).

---

### **🎯 Key Takeaways**
- ✔ Java has **8 types of operators** for different purposes.  
- ✔ `+ - * / %` are used for arithmetic operations.  
- ✔ `== != > < >= <=` help in **comparisons**.  
- ✔ `&& || !` are used for **logical decisions**.  
- ✔ **Bitwise operators** work at the **binary level**.  
- ✔ `+= -= *= /=` help in **shorthand assignments**.  
- ✔ `++ --` increase or decrease values by 1.  
- ✔ `? :` is a compact `if-else`.  
