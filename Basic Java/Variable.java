public class Variable{
    public static void main(String[] args){
        // variables with primitive datatype
        byte b = 4;
        short s = 5000;
        int num = 1324829;
        long bigNum = 23823982L;
        float pi = 3.14f;
        double precise = 99.99;
        char letter = 'A';
        boolean isJava = true;
        System.out.println(b);
        System.out.println(s);
        System.out.println(num); 
        System.out.println(bigNum);
        System.out.println(pi);
        System.out.println(precise);
        System.out.println(letter);
        System.out.println(isJava);

        // Variables with non-primitive datatype
        String name = "Java";
        int[] numbers = {1, 3, 4, 5}; //Array
        // Classes & Objects and Interface are also non-primitive datatype
        System.out.println(name);
        System.out.println(numbers[0]); // Acccessing elements with index
    }
}
