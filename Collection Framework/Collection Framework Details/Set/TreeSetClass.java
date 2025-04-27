import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass{
    public static void main(String[] args) {
        // Creating object of Set interface
        TreeSet<Integer> tset = new TreeSet<>(); 

        // Add elements
        tset.add(23);
        tset.add(12);
        tset.add(45);
        tset.add(6);
        tset.add(12);
        tset.add(6);

        // print set (Sorted using Binary Search Tree)
        System.out.println(tset);  // [6, 12, 23, 45]

        // remove element 
        tset.remove(45);
        System.out.println(tset); // [6, 12, 23]

        // check element is present or not 
        System.out.println(tset.contains(17)); // false

        // remove all elements
        tset.clear();
        System.out.println(tset); // []
    }
}
