// Count the frequency of each element in an array.

import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class FrequencyArrayElements{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the total number of elements of array: ");
       int size = sc.nextInt(); 
       
       int[] arr = new int[size];
       System.out.println("Enter elements: ");
       for(int i=0;i<size;i++){
          arr[i] = sc.nextInt();
       }

       Map<Integer, Integer> freq = new HashMap<>();
       for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
       }

       System.out.println("The frequency of array elements: " + freq);
    }
}

/* 
OUTPUT:
------
Enter the total number of elements of array: 
5
Enter elements: 
12
3
54
6
7
The frequency of array elements: {3=1, 54=1, 6=1, 7=1, 12=1}

*/
