// Sort an array without using built-in functions (e.g., bubble sort).

import java.util.Scanner;
import java.util.Arrays;

public class SortingArray{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the total number of elements of array: ");
       int size = sc.nextInt(); 
       
       int[] arr = new int[size];
       System.out.println("Enter elements: ");
       for(int i=0;i<size;i++){
          arr[i] = sc.nextInt();
       }

        // Bubble sort the array 
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // print the sorted array
        System.out.println("The sorted array is: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/* 
OUTPUT:
------
Enter the total number of elements of array: 
5
Enter elements: 
21
43
55
86
25
The sorted array is: 
21 25 43 55 86 

*/
