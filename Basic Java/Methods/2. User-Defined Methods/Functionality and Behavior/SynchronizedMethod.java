/**
 * Explanation
    1. Shared Resource: A BankAccount object represents a shared resource.
    2. Synchronized Method: The withdraw(int amount) method is synchronized, allowing only one thread to access it at a time.
    3. Multiple Threads:
        a. Three threads (Customer 1, Customer 2, Customer 3) try to withdraw different amounts.
        b. The synchronized method ensures that only one customer can withdraw at a time, preventing race conditions.
    4. Simulated Delay: Thread.sleep(1000) mimics the time taken for withdrawal.
    5. Balance Check: Ensures no overdrawing occurs.
 */
// A class representing a bank account
class BankAccount {
    private int balance = 5000; // Initial balance of the account

    // Synchronized method to ensure only one thread can withdraw money at a time
    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw: " + amount);

        // Check if there is enough balance for withdrawal
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing...");

            try {
                Thread.sleep(1000); // Simulate time taken for withdrawal
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            balance -= amount; // Deduct the withdrawn amount from balance
            System.out.println(Thread.currentThread().getName() + " successfully withdrew. Remaining balance: " + balance);
        } else {
            System.out.println("Not enough balance for " + Thread.currentThread().getName());
        }
    }
}

// A class representing a customer who wants to withdraw money
class Customer extends Thread {
    BankAccount account; // Shared bank account
    int amount; // Amount the customer wants to withdraw

    // Constructor to initialize the customer with a bank account and withdrawal amount
    Customer(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    // Run method which will be executed when the thread starts
    public void run() {
        account.withdraw(amount); // Call the withdraw method on the shared account
    }
}

// Main class where execution begins
public class SynchronizedMethod {
    public static void main(String[] args) {
        // Creating a single shared bank account object
        BankAccount account = new BankAccount();

        // Creating three customer threads that try to withdraw money
        Customer c1 = new Customer(account, 3000);
        Customer c2 = new Customer(account, 4000);
        Customer c3 = new Customer(account, 2000);

        // Setting thread names for better readability in output
        c1.setName("Customer 1");
        c2.setName("Customer 2");
        c3.setName("Customer 3");

        // Starting the customer threads
        c1.start();
        c2.start();
        c3.start();
    }
}
/*
 * OUTPUT:
 * -------
 *  Customer 1 is trying to withdraw: 3000
    Customer 1 is withdrawing...
    Customer 1 successfully withdrew. Remaining balance: 2000
    Customer 3 is trying to withdraw: 2000
    Customer 3 is withdrawing...
    Customer 3 successfully withdrew. Remaining balance: 0
    Customer 2 is trying to withdraw: 4000
    Not enough balance for Customer 2
 */

/**
 * 🔹 Why Did This Happen?
--> Customer 1 started first and successfully withdrew ₹3000, leaving ₹2000 in the account.
    Customer 3 started next, found ₹2000 available, and successfully withdrew ₹2000, making the balance ₹0.
    Customer 2 started last, tried to withdraw ₹4000, but since the balance was ₹0, the withdrawal failed.

🔹 Why Didn't Customer 2 Run Before Customer 3?
--> Thread execution order is unpredictable in Java. The scheduler decides which thread gets CPU time first.
    Even though c2.start() was called before c3.start(), the JVM might have picked c3 to execute first.
 */
