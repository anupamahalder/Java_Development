public class Operators{
    public static void main(String[] args) {
        // 1️. Arithmetic Operators
        // +, -, *, /, %
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println();

        // 2️. Relational (Comparison) Operators
        // ==, !=, >, <, >=, <=
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // true
        System.out.println("a < b: " + (a < b));   // false
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a <= b: " + (a <= b)); // false
        System.out.println();

        // 3️. Logical Operators
        // &&, ||, !
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false
        System.out.println();

        // 4️. Bitwise Operators
        // &, |, ^, ~, <<, >>
        int p = 5, q = 3; // Binary: 5 = 0101, 3 = 0011
        System.out.println("Bitwise Operators:");
        System.out.println("p & q: " + (p & q)); // 0101 & 0011 = 0001 (1)
        System.out.println("p | q: " + (p | q)); // 0101 | 0011 = 0111 (7)
        System.out.println("p ^ q: " + (p ^ q)); // 0101 ^ 0011 = 0110 (6)
        System.out.println("~p: " + (~p));       // ~0101 = 1010 (-6 in 2's complement)
        System.out.println("p << 1: " + (p << 1)); // 0101 << 1 = 1010 (10)
        System.out.println("p >> 1: " + (p >> 1)); // 0101 >> 1 = 0010 (2)
        System.out.println();

        // 5️. Assignment Operators
        // +=, -=, *=, /=, %=
        int c = 10;
        System.out.println("Assignment Operators:");
        System.out.println("c = " + c);
        c += 5; System.out.println("c += 5 -> " + c);
        c -= 2; System.out.println("c -= 2 -> " + c);
        c *= 2; System.out.println("c *= 2 -> " + c);
        c /= 4; System.out.println("c /= 4 -> " + c);
        c %= 3; System.out.println("c %= 3 -> " + c);
        System.out.println();

        // 6️. Unary Operators
        // ++a, a++, --a, a--
        int d = 5;
        System.out.println("Unary Operators:");
        System.out.println("++d: " + (++d)); // Pre-increment
        System.out.println("d++: " + (d++)); // Post-increment
        System.out.println("--d: " + (--d)); // Pre-decrement
        System.out.println("d--: " + (d--)); // Post-decrement
        System.out.println();

        // 7️. Ternary Operator
        // (condition) ? true : false
        int num = 10;
        String result = (num > 5) ? "Greater" : "Smaller";
        System.out.println("Ternary Operator:");
        System.out.println("num is " + result);
    }
}

/*
Output:

Byte Object: 10
Short Object: 20
Integer Object: 12132
Long Object: 100
Float Object: 5.5
Double Object: 348.6
Character Object: A
Boolean Object: true

Performing Unboxing...
Byte Value: 10
Short Value: 20
Integer Value: 12132
Long Value: 100
Float Value: 5.5
Double Value: 348.6
Character Value: A
Boolean Value: true

Using Wrapper class utility Methods...
Parsed int: 106
Parsed double: 28.09
Integer to String: 352
Boolean from String: false
*/
