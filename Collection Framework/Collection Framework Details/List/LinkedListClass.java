import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass{
    public static void main(String[] args) {
        // Creating object of List interface
        List<String> linkedList = new LinkedList<>();

        // Add elements to linkedList 
        linkedList.add("Tom");
        linkedList.add("Priya");
        linkedList.add("Farin");

        // print linkedList elements 
        System.out.println(linkedList); // [Tom, Priya, Farin]

        // Add element to a specific index 
        linkedList.add(1, "Simran");
        System.out.println(linkedList); // [Tom, Simran, Priya, Farin]

        // Remove element from the linkedList
        linkedList.remove(2);
        System.out.println(linkedList); // [Tom, Simran, Farin]

    }
}
