// Check if a number is Prime.

import java.util.*;

public class ChackPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        // check prime or not 
        for(int i=2;i*i<num;i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(num + " is prime ? " + isPrime);
    }
}

/*
OUTPUT:
------
Enter a number to check prime: 
23
23 is prime ? true
*/
