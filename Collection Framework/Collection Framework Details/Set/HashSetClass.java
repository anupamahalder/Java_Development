import java.util.HashSet;
import java.util.Set;

public class HashSetClass{
    public static void main(String[] args) {
        // Creating object of Set interface
        Set<Integer> set = new HashSet<>();

        // Add elements to set
        set.add(3);
        set.add(4);
        set.add(3);
        set.add(8);
        set.add(4);
        set.add(3);
        set.add(7);

        // print set 
        System.out.println(set); // [3, 4, 7, 8]

        // remove element 
        set.remove(4); // Direct element have to give here
        System.out.println(set); // [3, 7, 8]

        // check element is present or not 
        System.out.println(set.contains(9)); // false

        // remove all elements
        set.clear();
        System.out.println(set); // []
    }
}
