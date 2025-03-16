import java.util.Arrays;
import java.util.Scanner;

class CharacterArrayVsString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1️⃣ Declare and Initialize a Character Array
        char[] charArr = {'J', 'a', 'v', 'a'};
        System.out.println("Original Character Array: " + new String(charArr));
        /* NOTE:
         ✅ System.out.println(charArr); → Works because println() is overloaded for char[].
         ❌ "Original Character Array: " + charArr → Fails because Java treats char[] as an object reference when concatenated, printing its memory address instead of contents.
         ✅ "Original Character Array: " + new String(charArr) → Correctly converts the array to a String.
         */

        // 2️⃣ Modify an Element in the Character Array
        charArr[0] = 'K';  // Changing 'J' to 'K'
        System.out.println("Modified Character Array: " + new String(charArr));

        // 3️⃣ Convert String to Character Array
        System.out.print("\nEnter a word to convert to a character array: ");
        String userInput = sc.next();
        char[] strToCharArr = userInput.toCharArray();
        
        System.out.print("Converted Character Array: ");
        for (char c : strToCharArr) {
            System.out.print(c + " ");
        }
        System.out.println(); 

        // 4️⃣ Convert Character Array Back to String
        String charToString = new String(strToCharArr);
        System.out.println("Character Array Converted Back to String: " + charToString);

        // 5️⃣ Password Handling - Using Character Array Instead of String
        System.out.print("\nEnter your password: ");
        char[] password = sc.next().toCharArray();

        System.out.print("Your Password (Stored in Char Array): ");
        for (char c : password) {
            System.out.print('*'); // Masking password
        }
        System.out.println();

        // Clear Password Array for Security
        java.util.Arrays.fill(password, ' ');  
        System.out.println("Password Cleared from Memory for Security.");

        sc.close();
    }
}


/*
OUTPUT:
-------
Original Character Array: Java
Modified Character Array: Kava

Enter a word to convert to a character array: Dream
Converted Character Array: D r e a m 
Character Array Converted Back to String: Dream

Enter your password: PasswordSecret
Your Password (Stored in Char Array): **************
Password Cleared from Memory for Security.

 */
