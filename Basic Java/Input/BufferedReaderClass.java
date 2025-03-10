import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter an integer: ");
            int intValue = Integer.parseInt(br.readLine());

            System.out.print("Enter a long: ");
            long longValue = Long.parseLong(br.readLine());

            System.out.print("Enter a float: ");
            float floatValue = Float.parseFloat(br.readLine());

            System.out.print("Enter a double: ");
            double doubleValue = Double.parseDouble(br.readLine());

            System.out.print("Enter a boolean (true/false): ");
            boolean boolValue = Boolean.parseBoolean(br.readLine());

            System.out.print("Enter a character: ");
            char charValue = br.readLine().charAt(0);

            System.out.print("Enter a string: ");
            String strValue = br.readLine();

            // Taking an array input
            System.out.print("Enter the size of the array: ");
            int size = Integer.parseInt(br.readLine());
            int[] arr = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            // Displaying the inputs
            System.out.println("\nYou entered:");
            System.out.println("Integer: " + intValue);
            System.out.println("Long: " + longValue);
            System.out.println("Float: " + floatValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Boolean: " + boolValue);
            System.out.println("Character: " + charValue);
            System.out.println("String: " + strValue);
            System.out.print("Array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }
}

/*
Output:
-------
Enter an integer: 223
Enter a long: 234235
Enter a float: 34.6
Enter a double: 43345.5476564
Enter a boolean (true/false): true
Enter a character: gfa
Enter a string: hello
Enter the size of the array: 5
Enter 5 elements:
1
2
3
4
5

You entered:
Integer: 223
Long: 234235
Float: 34.6
Double: 43345.5476564
Boolean: true
Character: g
String: hello
Array: 1 2 3 4 5 
*/
