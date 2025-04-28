import java.util.Arrays;
import java.util.HashMap;

public class HashMapClass{
    public static void main(String[] args) {
        // Creating object of Map interface
        HashMap<Integer, Integer> map = new HashMap<>(); 

        // Add elements
        map.put(1, 101);
        map.put(2, 102);
        map.put(3, 101);

        // get all values of map 
        System.out.println(map.values()); // [101, 102, 101]

        // get all keys of map 
        System.out.println(map.keySet()); // [1, 2, 3]

        // get a specific value by key
        System.out.println(map.get(2)); // 102
        
        // sort array 
        int[] array = {1, 2, 33, 556, 827, 34, 9};
        Arrays.sort(array);
        for(int num: array){
            System.out.print(num + " "); // 1 2 9 33 34 556 827                                                                                                                                              
        }
    }
}
