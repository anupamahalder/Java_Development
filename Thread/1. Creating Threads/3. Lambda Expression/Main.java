/*
Using Lambda Expression (For Shorter Code)

🔹 Explanation:
- Java 8 allows us to use lambda expressions to make the code shorter.
- No need to create a separate class; we directly pass the function inside Thread().
*/
public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread running using Lambda...");
        });
        t1.start();
    }
}

/*
OUTPUT:
-------
Thread running using Lambda...

*/
