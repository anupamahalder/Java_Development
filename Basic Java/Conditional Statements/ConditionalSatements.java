import java.util.Scanner;

public class ConditionalSatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking an integer input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // 1️⃣ if Statement
        if (num > 0) {
            System.out.println("The number is positive.");
        }

        // 2️⃣ if-else Statement
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        // 3️⃣ if-else-if Ladder
        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("The number is zero.");
        }

        // 4️⃣ Nested if Statement
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Positive Even Number");
            } else {
                System.out.println("Positive Odd Number");
            }
        }

        // 5️⃣ switch Statement (Checking Day of the Week)
        System.out.print("Enter a day number (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }

        // 6️⃣ Ternary Operator
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println("Using Ternary Operator: " + result);

        sc.close(); // Closing Scanner to prevent memory leak
    }
}

/*
Output:
-------
Enter a number: 3
The number is positive.
3 is odd.
Positive number
Positive Odd Number
Enter a day number (1-7): 5
Friday
Using Ternary Operator: Positive
*/
