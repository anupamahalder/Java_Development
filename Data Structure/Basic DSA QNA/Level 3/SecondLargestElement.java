// Find the second largest element in an array.

import java.util.Scanner;
import java.util.Arrays;

public class SecondLargestElement{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the total number of elements of array: ");
       int size = sc.nextInt(); 
       
       int[] arr = new int[size];
       System.out.println("Enter elements: ");
       for(int i=0;i<size;i++){
          arr[i] = sc.nextInt();
       }

       int maxEle = Integer.MIN_VALUE;
       int secondMaxEle = Integer.MIN_VALUE;

       for(int i=0;i<size;i++){
            if(maxEle < arr[i]){
                secondMaxEle = maxEle;
                maxEle = arr[i];
            }
            else if(arr[i] > secondMaxEle && arr[i] != maxEle){
                secondMaxEle = arr[i];
            }
       }
       System.out.println("The second largest element is: " + secondMaxEle);
    }
}

/* 
OUTPUT:
------
Enter the total number of elements of array: 
8  
Enter elements: 
24
32
45
56
75
56
5
75
The second largest element is: 56

*/
