// Remove duplicate characters from a string.

import java.util.Scanner;
import java.util.Arrays;

public class CheckAnagram{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the first string: ");
       String str1 = sc.nextLine();

       System.out.print("Enter the second string: ");
       String str2 = sc.nextLine();

       // convert the string to array of characters
       char[] array1 = str1.toCharArray();
       char[] array2 = str2.toCharArray();

       // sort array 
        Arrays.sort(array1);
        Arrays.sort(array2);

        // check anagram or not 
        if(Arrays.equals(array1, array2)) System.out.print("Given two string are anagram");
        else System.out.print("Given two strings are not anagram");
    }
}

/* 
OUTPUT:
------
Enter the first string: racecar
Enter the second string: carrace
Given two string are anagram

*/
