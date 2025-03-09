import java.util.Scanner;

public class ScannerClass{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object
        
        // Taking Short Input
        System.out.print("Enter a short value: ");
        short shortValue = sc.nextShort();

        // Taking Integer Input
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();
        
        // Taking Float Input
        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();
        
        // Taking Double Input
        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();
        
        // Taking Long Input
        System.out.print("Enter a long value: ");
        long longValue = sc.nextLong();
        
        // Taking Boolean Input
        System.out.print("Enter true or false: ");
        boolean boolValue = sc.nextBoolean();
        
        // Taking Character Input
        System.out.print("Enter a character: ");
        char charValue = sc.next().charAt(0);
        
        sc.nextLine(); // Consume the leftover newline
        
        // Taking String Input
        System.out.print("Enter a string: ");
        String stringValue = sc.nextLine();

        // Taking Array Input (Integer Array)
        System.out.print("Enter the size of the array: ");
        int arraySize = sc.nextInt();
        int[] intArray = new int[arraySize];

        System.out.println("Enter " + arraySize + " integer elements:");
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = sc.nextInt();
        }

        // Displaying All Inputs
        System.out.println("\n📝 You Entered:");
        System.out.println("Short: " + shortValue);
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Long: " + longValue);
        System.out.println("Boolean: " + boolValue);
        System.out.println("Character: " + charValue);
        System.out.println("String: " + stringValue);

        // Displaying Array Elements
        System.out.print("Array Elements: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        
        sc.close(); // Closing scanner
    }
}

/*
Input and Output:
-----------------
Enter a short value: 12
Enter an integer: 42
Enter a float value: 3.14
Enter a double value: 9.87654321
Enter a long value: 9876543210
Enter true or false: true
Enter a character: A
Enter a string: Hello Java
Enter the size of the array: 3
Enter 3 integer elements:
1
2
3

📝 You Entered:
Short: 12
Integer: 42
Float: 3.14
Double: 9.87654321
Long: 9876543210
Boolean: true
Character: A
String: Hello Java
Array Elements: 1 2 3 

*/

/*
NOTE:
✔ sc.nextShort() → Reads a short value.
✔ sc.nextInt() → Reads an integer.
✔ sc.nextFloat() → Reads a float.
✔ sc.nextDouble() → Reads a double.
✔ sc.nextLong() → Reads a long integer.
✔ sc.nextBoolean() → Reads a boolean (true/false).
✔ sc.next().charAt(0) → Reads a character.
✔ sc.nextLine() → Reads a full line as a string.
✔ Array Input Using Loop → Takes multiple elements dynamically.
*/
