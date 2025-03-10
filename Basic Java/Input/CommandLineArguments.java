public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length < 7) {
            System.out.println("Usage: java CommandLineInputExample <name> <age> <salary> <gender> <isMarried> <hobbies> <password>");
            return;
        }

        // Taking inputs from command line arguments
        String name = args[0];                         // String
        int age = Integer.parseInt(args[1]);          // Integer
        double salary = Double.parseDouble(args[2]);  // Double
        char gender = args[3].charAt(0);              // Character
        boolean isMarried = Boolean.parseBoolean(args[4]); // Boolean
        String[] hobbies = args[5].split(",");        // Array (comma-separated values)
        String password = args[6];                    // Password (not hidden here)

        // Printing Output
        System.out.println("\n===== User Details =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Married: " + isMarried);
        System.out.print("Hobbies: ");
        for (String hobby : hobbies) {
            System.out.print(hobby + " ");
        }
        System.out.println("\nPassword Length: " + password.length() + "(hidden for security)");
    }
}

/*
OUTPUT in terminal:
-------------------
javac CommandLineArguments.java && java CommandLineArguments Anupama 18 312412 F false dancing,coding,programming,reading,cooking iweqiei

===== User Details =====
Name: Anupama
Age: 18
Salary: 312412.0
Gender: F
Married: false
Hobbies: dancing coding programming reading cooking 
Password Length: 7(hidden for security)
*/
