import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // 1️⃣ Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2️⃣ Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Initial ArrayList: " + fruits);

        // 3️⃣ Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // 4️⃣ Modifying elements
        fruits.set(1, "Grapes"); // Replacing Banana with Grapes
        System.out.println("Updated ArrayList: " + fruits);

        // 5️⃣ Removing elements
        fruits.remove("Mango");
        System.out.println("After removing Mango: " + fruits);

        // 6️⃣ Checking if an element exists
        System.out.println("Does list contain Orange? " + fruits.contains("Orange"));

        // 7️⃣ Iterating over the ArrayList
        System.out.println("Fruits in ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 8️⃣ Sorting the ArrayList
        Collections.sort(fruits);
        System.out.println("Sorted ArrayList: " + fruits);

        // 9️⃣ Getting the size of the ArrayList
        System.out.println("Total fruits: " + fruits.size());

        // 🔟 Clearing the ArrayList
        fruits.clear();
        System.out.println("Is ArrayList empty? " + fruits.isEmpty());
    }
}

/*
OUTPUT:
-------
Initial ArrayList: [Apple, Banana, Mango, Orange]
First fruit: Apple
Updated ArrayList: [Apple, Grapes, Mango, Orange]
After removing Mango: [Apple, Grapes, Orange]
Does list contain Orange? true
Fruits in ArrayList:
Apple
Grapes
Orange
Sorted ArrayList: [Apple, Grapes, Orange]
Total fruits: 3
Is ArrayList empty? true
*/
