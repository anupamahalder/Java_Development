// Reverse a string without using library functions.

import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println("The reverse of " + str + " is: " + rev);
    }
}

/* 
OUTPUT:
------
Enter a string to reverse: hello world
The reverse of hello world is: dlrow olleh

*/
