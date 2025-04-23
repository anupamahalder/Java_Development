// Remove duplicates from an array.

import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicates{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the total number of elements of array: ");
       int size = sc.nextInt(); 
       
       int[] arr = new int[size];
       System.out.println("Enter elements: ");
       for(int i=0;i<size;i++){
          arr[i] = sc.nextInt();
       }

       Set<Integer> set = new LinkedHashSet<>();
       for(int num: arr){
            set.add(num);
       }

       System.out.println("After Removing duplicates, the array is: " + set);
    }
}

/* 
OUTPUT:
------
Enter the total number of elements of array: 
5
Enter elements: 
22
43
23
22
43
After Removing duplicates, the array is: [22, 43, 23]

*/
