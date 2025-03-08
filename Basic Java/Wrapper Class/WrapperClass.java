public class WrapperClass{
    public static void main(String[] args){
        // Autoboxing (Primitive -> Object)
        Byte byteObj = 10;          // byte -> Byte
        Short shortObj = 20;        // short -> Short
        Integer intObj = 12132;     // int -> Integer
        Long longObj = 100L;        // long -> Long
        Float floatObj = 5.5f;      // float -> Float
        Double doubleObj = 348.6;   // double -> Double
        Character charObj = 'A';    // char -> Character
        Boolean boolObj = true;     // boolean -> Boolean

        // Printing Wrapper Objects
        System.out.println("Byte Object: " + byteObj);
        System.out.println("Short Object: " + shortObj);
        System.out.println("Integer Object: " + intObj);
        System.out.println("Long Object: " + longObj);
        System.out.println("Float Object: " + floatObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + boolObj);

        System.out.println("\nPerforming Unboxing...");

        // Unboxing (Object -> Primitive)
        byte byteValue = byteObj;
        short shortValue = shortObj;
        int intValue = intObj;
        long longValue = longObj;
        float floatValue = floatObj;
        double doubleValue = doubleObj;
        char charValue = charObj;
        boolean boolValue = boolObj;

        // Printing Primitive values
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Boolean Value: " + boolValue);

        System.out.println("\nUsing Wrapper class utility Methods...");
        
        // Using Wrapper class utility methods
        int parsedInt = Integer.parseInt("106");           // Convert String to int
        double parsedDouble = Double.parseDouble("28.09"); // Convert String to double
        String intToString = Integer.toString(352);        // Convert int to string
        boolean booleanValue = Boolean.valueOf("faLse");   // Convert String to boolean (case-insensitive)
        
         // Printing Utility Method Outputs
         System.out.println("Parsed int: " + parsedInt);
         System.out.println("Parsed double: " + parsedDouble);
         System.out.println("Integer to String: " + intToString);
         System.out.println("Boolean from String: " + booleanValue);
    }
}

// Output
/* 
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
