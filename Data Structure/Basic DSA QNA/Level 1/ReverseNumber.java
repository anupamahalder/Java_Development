// Reverse a number (e.g., 123 → 321).

import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int num = sc.nextInt();
        int numCopy = num;
        int ans = 0;
        while( num != 0){
            int lastDigit = num%10;
            ans = ans*10 + lastDigit;
            num /= 10;
        }
        System.out.println("The reverse of "+ numCopy + " is: " + ans);
    }
}

/* 
OUTPUT:
------
Enter the number to reverse: 3455 
The reverse of 3455 is: 5543

*/
