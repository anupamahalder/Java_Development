// Check if a string is a palindrome (e.g., "madam").

import java.util.Scanner;

public class CheckPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check palidrome: ");
        String str = sc.nextLine();
        int i = 0, j = str.length()-1;
        boolean isPalindrome = true;
        while( i < j){
            if(str.charAt(i) != str.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println("The given string " + str + " is Palindrome ? " + isPalindrome);
    }
}

/* 
OUTPUT:
------
Enter a string to check palidrome: 
malayalam
The given string malayalam is Palindrome ? true

*/
