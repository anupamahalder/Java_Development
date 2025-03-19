/*
Compile Time Polymorphism:
🅰️ Same method name but different parameter list (different number, type, or order of parameters).
🅱️ The method to be executed is decided at compile-time based on the method signature.
*/

class MathOperations {
    // Method with two int parameters
    int multiply(int a, int b) {
        return a * b;
    }

    // Method with three int parameters (overloaded)
    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method with two double parameters (overloaded)
    double multiply(double a, double b) {
        return a * b;
    }

    // Method with mixed parameters (overloaded)
    double multiply(int a, double b) {
        return a * b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Multiply 2 numbers (int): " + math.multiply(5, 3));         // Calls multiply(int, int)
        System.out.println("Multiply 3 numbers (int): " + math.multiply(2, 3, 4));    // Calls multiply(int, int, int)
        System.out.println("Multiply 2 numbers (double): " + math.multiply(2.5, 3.5)); // Calls multiply(double, double)
        System.out.println("Multiply int & double: " + math.multiply(4, 2.5));         // Calls multiply(int, double)
    }
}
/* 
OUTPUT:
-------
Multiply 2 numbers (int): 15
Multiply 3 numbers (int): 24
Multiply 2 numbers (double): 8.75
Multiply int & double: 10.0

*/
