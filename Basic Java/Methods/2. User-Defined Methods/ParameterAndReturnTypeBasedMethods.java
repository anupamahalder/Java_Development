// Class Definition

import java.util.Random;

class ParameterAndReturnTypeBasedMethods {

    // 1️⃣ No Parameters, No Return Type
    void greetings(){
        System.out.println("Hello, Welcome to Java methods");
    }

    // 2️⃣ Parameters, No Return Type
    void displaySum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // 3️⃣ No Parameters, Returns a Value
    int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(1001); // It will return 0 to 1000 random value
    }

    // 4️⃣ Parameters, Returns a Value
    int multiply(int x, int y) {
        return x * y;
    }

    // Main Method
    public static void main(String[] args) {
        // Creating an Object of ParameterAndReturnTypeBasedMethods
        ParameterAndReturnTypeBasedMethods obj = new ParameterAndReturnTypeBasedMethods();

        // Calling all types of methods
        obj.greetings();  // No Parameters, No Return Type
        
        obj.displaySum(5, 10);  // Parameters, No Return Type
        
        int number = obj.getRandomNumber();  // No Parameters, Returns Value
        System.out.println("Random Number: " + number);
        
        int result = obj.multiply(4, 3);  // Parameters, Returns Value
        System.out.println("Multiplication Result: " + result);
    }
}

/*
OUTPUT:
-------
Hello, Welcome to Java methods
Sum: 15
Random Number: 934
Multiplication Result: 12

*/
