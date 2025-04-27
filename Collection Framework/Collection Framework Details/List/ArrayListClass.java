import java.util.ArrayList;
import java.util.List;

public class ArrayListClass{
    public static void main(String[] args) {
        // Creating object of List interface
        List<Integer> list = new ArrayList<>();

        // Add elements 
        list.add(3);
        list.add(45);
        list.add(79);
        list.add(0);
        list.add(5);

        // print list object 
        System.out.println(list); // [3, 45, 79, 0, 5]

        // add element to a specific index 
        list.add(2, 50);
        System.out.println(list); // [3, 45, 50, 79, 0, 5]

        // remove element from an index 
        list.remove(1);
        System.out.println(list); // [3, 50, 79, 0, 5]

        // size of list 
        System.out.println(list.size()); // 5

        // clear all elements of list
        list.clear(); 
        System.out.println(list); // []
    }
}
