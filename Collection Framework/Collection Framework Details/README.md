# Java Collection Framework:
## 🧭 **Java Collection Framework Hierarchy**  
*(with commonly used classes/interfaces)*

```
java.lang.Iterable (interface)
        |
        |--> java.util.Collection (interface)
                |
                |--> java.util.List (interface)
                |       |--> ArrayList
                |       |--> LinkedList
                |       |--> Vector
                |             |--> Stack
                |
                |--> java.util.Set (interface)
                |       |--> HashSet
                |       |--> LinkedHashSet
                |       |--> SortedSet (interface)
                |             |--> NavigableSet (interface)
                |                   |--> TreeSet
                |
                |--> java.util.Queue (interface)
                        |--> PriorityQueue
                        |--> LinkedList (also implements Queue)

java.util.Map (interface) – *NOT a part of Collection hierarchy*
        |
        |--> HashMap
        |     |--> LinkedHashMap
        |
        |--> Hashtable
        |     |--> Properties
        |
        |--> SortedMap (interface)
              |--> NavigableMap (interface)
                    |--> TreeMap
```

### 💡 NOTE:
- `Iterable` interface has only one method: `iterator()`. All classes in the Collection Framework are indirectly iterable.
- `Map` is not a subtype of `Collection`. It's a separate hierarchy.
- Many classes (like `LinkedList`) implement multiple interfaces (e.g., both `List` and `Queue`).
- `Stack` is a legacy class, now often replaced by `Deque` (like `ArrayDeque`).

---

