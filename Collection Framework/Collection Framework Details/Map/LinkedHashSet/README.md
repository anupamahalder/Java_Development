# LinkedHashSet in Java

## 📌 Overview
`LinkedHashSet` is a part of the Java Collections Framework and implements the `Set` interface.
It maintains **unique elements** while preserving the **insertion order**.

It is backed by a **hash table + doubly linked list**.

---

## 🧩 Key Features
- Stores **unique elements only**
- Maintains **insertion order**
- Allows **null elements**
- Not synchronized
- Faster than `TreeSet`, slightly slower than `HashSet`

---

## 🏗 Class Hierarchy
Object <br>
└── AbstractCollection <br>
└── AbstractSet <br>
└── HashSet <br>
└── LinkedHashSet <br>

---

## 🛠 Operations Demonstrated
- Adding elements
- Preventing duplicates
- Iteration using Iterator
- Removing elements
- Checking size
- Clearing the set

---

## ▶ Example Output
LinkedHashSet elements:
[Apple, Banana, Mango, Orange]
Contains Mango? true

After removing Banana:
[Apple, Mango, Orange]

Iterating using Iterator:
Apple
Mango
Orange

Size of LinkedHashSet: 3

After clearing LinkedHashSet:
[]


---

## 📚 When to Use LinkedHashSet?
Use `LinkedHashSet` when:
- You need **unique elements**
- You care about **insertion order**
- You want better performance than `TreeSet`

---
