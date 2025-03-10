import java.io.Console;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available. Run this program in a terminal.");
            return;
        }
        
        // Taking String Input
        String name = console.readLine("Enter your name: ");

        // Taking Integer Input
        int age = Integer.parseInt(console.readLine("Enter your age: "));

        // Taking Double Input
        double salary = Double.parseDouble(console.readLine("Enter your salary: "));

        // Taking Character Input
        char gender = console.readLine("Enter your gender (M/F): ").charAt(0);

        // Taking Boolean Input
        boolean isMarried = Boolean.parseBoolean(console.readLine("Are you married? (true/false): "));

        // Taking Array Input
        String[] hobbies = console.readLine("Enter your hobbies (comma separated): ").split(",");

        // Taking Secure Password Input
        char[] password = console.readPassword("Enter your password: ");

        // Printing Output
        System.out.println("\n===== User Details =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Married: " + isMarried);
        System.out.println("Hobbies: " + Arrays.toString(hobbies));
        System.out.println("Password Length: " + password.length + " (hidden for security)");
    }
}

/*
Output:
-------
Enter your name: Anupama Halder
Enter your age: 98
Enter your salary: 2423
Enter your gender (M/F): f
Are you married? (true/false): false
Enter your hobbies (comma separated): reading, coding, drawing
Enter your password:

===== User Details =====
Name: Anupama Halder
Age: 98
Salary: 2423.0
Gender: f
Married: false
Hobbies: [reading,  coding,  drawing]
Password Length: 12 (hidden for security)

*/
