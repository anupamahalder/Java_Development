## ✅ **Example: Using `this` keyword to refer to current object**

```java
class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name; // 'this.name' refers to instance variable, 'name' is parameter
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name); // optional here, just shows it's the instance's variable
        System.out.println("Age: " + this.age);
    }
}
```

### 🔹 Why use `this.name = name;`?

Without `this`, if you wrote `name = name;`, Java would just assign the parameter `name` to itself — and the instance variable `name` would remain uninitialized.

---

### ✅ **Other common uses of `this` keyword**

1. **To call another constructor in the same class**:
```java
class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 0); // calling parameterized constructor from default constructor
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

2. **To return the current object**:
```java
class Student {
    Student getStudent() {
        return this;
    }
}
```

3. **To pass the current object as a parameter**:
```java
class Student {
    void show(Student obj) {
        System.out.println("Method called");
    }

    void call() {
        show(this); // passing current object
    }
}
```
