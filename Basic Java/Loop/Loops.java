public class Loops {
    public static void main(String[] args) {

        // 1️⃣ FOR LOOP: Printing numbers from 1 to 5
        System.out.println("Using for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 2️⃣ WHILE LOOP: Printing numbers from 1 to 5
        System.out.println("Using while loop:");
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println("\n");

        // 3️⃣ DO-WHILE LOOP: Printing numbers from 1 to 5
        System.out.println("Using do-while loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
        System.out.println("\n");

        // 4️⃣ FOR-EACH LOOP: Iterating over an array
        System.out.println("Using for-each loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // 5️⃣ BREAK & CONTINUE in a loop
        System.out.println("Using break and continue in for loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping " + i + " using continue...");
                continue;  // Skips iteration when i = 3
            }
            if (i == 5) {
                System.out.println("Breaking at " + i + "...");
                break;  // Exits loop when i = 5
            }
            System.out.println("Count: " + i);
        }
    }
}

/*
OUTPUT:
-------
Using for loop:
1 2 3 4 5 

Using while loop:
1 2 3 4 5 

Using do-while loop:
1 2 3 4 5 

Using for-each loop:
10 20 30 40 50

Using break and continue in for loop:
Count: 1
Count: 2
Skipping 3 using continue...
Count: 4
Breaking at 5...

*/
