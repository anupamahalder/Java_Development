import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashClass {

    public static void main(String[] args) {

        // Creating a LinkedHashSet
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate (will be ignored)

        // Displaying elements (in insertion order)
        System.out.println("LinkedHashSet elements:");
        System.out.println(fruits); // [Apple, Banana, Mango, Orange]

        // Checking if element exists
        System.out.println("\nContains Mango? " + fruits.contains("Mango")); // true

        // Removing an element
        fruits.remove("Banana");
        System.out.println("\nAfter removing Banana:");
        System.out.println(fruits); // [Apple, Mango, Orange]

        // Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // Apple  Mango Orange
        }

        // Size of LinkedHashSet
        System.out.println("\nSize of LinkedHashSet: " + fruits.size()); // 3

        // Clearing the set
        fruits.clear();
        System.out.println("\nAfter clearing LinkedHashSet:");
        System.out.println(fruits);
    }
}
