// Find the factorial of a number using loops.

import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial: ");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i=num; i>1;i--){
            factorial *= i;
        }
        System.out.println("The factorial of "+ num + " is: " + factorial);
    }
}

/* 
OUTPUT:
------
Enter a number to calculate factorial: 
5
The factorial of 5 is: 120

*/
