public class StringBuilderClass {
    public static void main(String[] args) {

        // 1. Creating a StringBuilder Object
        StringBuilder sb = new StringBuilder("Hello"); 

        // 2. Append - Add text at the end
        sb.append(" World!");
        System.out.println("After Append: " + sb);  // Hello World!

        // 3. Insert - Add text at a specific position
        sb.insert(6, "Java ");
        System.out.println("After Insert: " + sb);  // Hello Java World!

        // 4. Replace - Replace part of the string
        sb.replace(6, 10, "Python");
        System.out.println("After Replace: " + sb);  // Hello Python World!

        // 5. Delete - Remove characters from a range
        sb.delete(6, 12);
        System.out.println("After Delete: " + sb);  // Hello World!

        // 6. Reverse - Reverse the string
        sb.reverse();
        System.out.println("After Reverse: " + sb);  // !dlroW olleH

        // 7. Convert StringBuilder to String
        String finalString = sb.toString();
        System.out.println("Converted to String: " + finalString);

        // 8. Convert String to StringBuilder
        String str = "Java Programming";
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println("String to StringBuilder: " + sb2);

        // 9. Finding the capacity of StringBuilder
        System.out.println("Capacity: " + sb.capacity());  // Default: 16 + initial length

        // 10. Checking Length
        System.out.println("Length: " + sb.length());

        // 11. Using charAt and setCharAt
        System.out.println("Character at index 2: " + sb.charAt(2)); // Get character
        sb.setCharAt(2, 'X'); // Set character
        System.out.println("After setCharAt: " + sb);

        // 12. Performance Comparison: String vs StringBuilder
        performanceTest();
    }

    // Performance Test for String vs StringBuilder
    public static void performanceTest() {

        long startTime, endTime;

        // Using String (Inefficient)
        startTime = System.currentTimeMillis();
        String str = "Java";
        for (int i = 0; i < 10000; i++) {
            str += i;  // Creates a new object every time
        }
        endTime = System.currentTimeMillis();
        System.out.println("\nString Time: " + (endTime - startTime) + "ms");

        // Using StringBuilder (Efficient)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append(i);  // Modifies the same object
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + "ms");
    }
}

/*
OUTPUT:
-------
After Append: Hello World!
After Insert: Hello Java World!
After Replace: Hello Python World!
After Delete: Hello  World!
After Reverse: !dlroW  olleH
Converted to String: !dlroW  olleH
String to StringBuilder: Java Programming
Capacity: 21
Length: 13
Character at index 2: l
After setCharAt: !dXroW  olleH

String Time: 23ms
StringBuilder Time: 1ms

 */
