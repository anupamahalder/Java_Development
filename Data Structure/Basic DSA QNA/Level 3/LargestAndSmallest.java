// Find the largest and smallest element in an array.

import java.util.Scanner;
import java.util.Arrays;

public class LargestAndSmallest{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the total number of elements of the array: ");
       int size = sc.nextInt();

       int[] arr = new int[size];
       System.out.println("Enter the elements: ");

       for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
       }
       int largest = arr[0], smallest = arr[0];

       for(int i=0;i<size;i++){
           if(largest < arr[i]) largest = arr[i];
           if(smallest > arr[i]) smallest = arr[i];
       }

       System.out.println("The largest element is: " + largest);
       System.out.println("The smallest element is: " + smallest);
    }
}

/* 
OUTPUT:
------
Enter the total number of elements of the array: 5
Enter the elements: 
22 
434
23
56
88
The largest element is: 434
The smallest element is: 22

*/
