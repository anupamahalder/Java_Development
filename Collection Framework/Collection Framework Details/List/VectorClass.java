import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorClass{
    public static void main(String[] args) {
        // Creating object of List interface
        Vector<Double> vector = new Vector<>();

        // Add elements to vector 
        vector.add(122.5);
        vector.add(45.7);
        vector.add(46.0);
        vector.add(10.0);

        // print vector 
        System.out.println(vector); // [122.5, 45.7, 46.0, 10.0]

        // add element to a specific index 
        vector.add(1, 100.0);
        System.out.println(vector); // [122.5, 100.0, 45.7, 46.0, 10.0]

        // remove element using index 
        vector.remove(4);
        System.out.println(vector); // [122.5, 100.0, 45.7, 46.0]

        // clear all elements 
        vector.clear();
        System.out.println(vector); // []
    }
}
