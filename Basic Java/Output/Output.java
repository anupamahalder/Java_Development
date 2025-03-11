import java.io.*;

public class Output {
    public static void main(String[] args) throws IOException {
        
        // 1️⃣ System.out.print() -> Prints without a newline
        System.out.print("Using print(): ");
        System.out.print("Hello, ");
        System.out.print("World!");
        System.out.println(); // To add a new line

        // 2️⃣ System.out.println() -> Prints with a newline
        System.out.println("Using println(): Hello, World!");

        // 3️⃣ System.out.printf() -> Formatted output
        int age = 25;
        double pi = 3.14159;
        System.out.printf("Using printf(): I am %d years old. Pi = %.2f%n", age, pi);

        // 4️⃣ System.out.format() -> Similar to printf()
        System.out.format("Using format(): Hello, %s! Pi = %.3f%n", "Anupama", pi);

        // 5️⃣ System.out.append() -> Appends text
        System.out.append("Using append(): ").append("Appending text using append().\n");

        // 6️⃣ System.err.println() -> Prints error messages (appears in red in most IDEs)
        System.err.println("Using err.println(): This is an error message!");

        // 7️⃣ BufferedWriter -> Efficient printing
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write("Using BufferedWriter: Hello, World!");
        writer.newLine(); // Adds a new line
        writer.flush(); // Ensures output is printed

        // 8️⃣ PrintWriter -> Advanced printing (supports auto-flushing)
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Using PrintWriter: Hello, World!");
        pw.printf("Using PrintWriter with formatting: Age = %d, Pi = %.4f%n", age, pi);

        // Closing the writer (optional)
        writer.close();
        pw.close();
    }
}


/*
Output:
-------
Using print(): Hello, World!
Using println(): Hello, World!
Using printf(): I am 25 years old. Pi = 3.14
Using format(): Hello, Anupama! Pi = 3.142
Using append(): Appending text using append().
Using err.println(): This is an error message!
Using BufferedWriter: Hello, World!
Using PrintWriter: Hello, World!
Using PrintWriter with formatting: Age = 25, Pi = 3.1416
*/
