import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass{
    public static void main(String[] args) {
        // Creating object of List interface
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        // Add elements
        lhs.add(34);
        lhs.add(29);
        lhs.add(75);
        lhs.add(70);
        lhs.add(29);
        lhs.add(34);

        // print set 
        System.out.println(lhs);  // [34, 29, 75, 70]

        // remove element 
        lhs.remove(75);
        System.out.println(lhs); // [34, 29, 70]

        // check element is present or not 
        System.out.println(lhs.contains(70)); // true

        // remove all elements
        lhs.clear();
        System.out.println(lhs); // []
    }
}
