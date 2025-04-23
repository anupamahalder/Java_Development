// Find the sum of digits of a number.

import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to sum of digits: ");
        int num = sc.nextInt();
        int numCopy = num;
        int ans = 0;
        while(num != 0){
            ans += (num%10);
            num /= 10;
        }
        System.out.println("The sum of digits of " + numCopy + " is: " + ans);
    }
}

/* 
OUTPUT:
------
Enter the number to sum of digits: 12345
The sum of digits of 12345 is: 15

*/
