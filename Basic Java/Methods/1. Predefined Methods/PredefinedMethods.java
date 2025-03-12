import java.util.Arrays;

public class PredefinedMethods {
    public static void main(String[] args) {

        // 🔹 1. Math Class Methods
        System.out.println("---- Math Methods:");
        System.out.println("Maximum of 10 and 20: " + Math.max(10, 20));
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("Power of 2^3: " + Math.pow(2, 3));
        System.out.println("Absolute value of -10: " + Math.abs(-10));
        System.out.println("Random number: " + Math.random()); // Generates number between 0 and 1
        long startTimes = System.currentTimeMillis();
        for(int i=0;i<190203842;i++){};
        long endTimes = System.currentTimeMillis();
        System.out.println(endTimes - startTimes);


        System.out.println("\n---- String Methods:");
        // 🔹 2. String Class Methods
        String str = "Hello, Java!";
        System.out.println("Length of string: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (0 to 5): " + str.substring(0, 5));
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));

        System.out.println("\n---- Arrays Methods:");
        // 🔹 3. Arrays Class Methods
        int[] numbers = {5, 3, 8, 1, 9};
        Arrays.sort(numbers); // Sort the array
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 8); // Search for 8
        System.out.println("Index of 8: " + index);

        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        System.out.println("\n---- System Methods:");
        // 🔹 4. System Class Methods
        System.out.println("This is a built-in method!"); // Output message
        System.err.println("This is an error message!"); // Error message

        long startTime = System.currentTimeMillis(); // Start time
        for (int i = 0; i < 1000000; i++) {} // Dummy loop
        long endTime = System.currentTimeMillis(); // End time

        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}

/*
OUTPUT:
-------
---- Math Methods:
Maximum of 10 and 20: 20
Square root of 25: 5.0
Power of 2^3: 8.0
Absolute value of -10: 10
Random number: 0.7258275840576451
34

---- String Methods:
Length of string: 12
Uppercase: HELLO, JAVA!
Lowercase: hello, java!
Substring (0 to 5): Hello
Replace 'Java' with 'World': Hello, World!

---- Arrays Methods:
Sorted array: [1, 3, 5, 8, 9]
Index of 8: 3
Copied array: [1, 3, 5, 8, 9]

---- System Methods:
This is a built-in method!
This is an error message!
Execution Time: 34 ms

*/
