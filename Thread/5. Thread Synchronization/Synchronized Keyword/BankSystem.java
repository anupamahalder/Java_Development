/*
Thread Synchronization (Handling Shared Resources)
Real-World Example: Bank Account Transactions 🏦

Imagine a bank where multiple users are trying to withdraw money from a shared bank account. 
If two users try to withdraw at the same time, we need synchronization to prevent issues like overdrawing.

Breakdown of Responsibilities:
BankAccount Class (Shared Resource)
- Represents the bank account with a balance and a withdraw() method.
- Does not need to extend Thread because it’s just a shared resource, not a thread.
Customer Class (Thread)
- Represents a user trying to withdraw money.
- Needs to run in parallel (multiple customers withdrawing at the same time), so it extends Thread.
- Calls the withdraw() method of BankAccount.

Why Use Synchronization?
🔹 Without synchronized, both customers could withdraw at the same time, causing incorrect balance updates.
🔹 With synchronized, only one thread can access withdraw() at a time, ensuring data consistency.
🔹 Thread Safety → Prevents issues like race conditions and data corruption.

*/

// BankAccount class - Shared Resource
class BankAccount {
    private int balance = 5000; // Initial balance

    // Synchronized method to withdraw money
    public synchronized void withdraw(String customer, int amount) {
        System.out.println(customer + " is trying to withdraw ₹" + amount);
        
        if (balance >= amount) {
            System.out.println(customer + " withdrawal in process...");
            try {
                Thread.sleep(2000); // Simulating processing time
            } catch (InterruptedException e) {
                System.out.println("Transaction interrupted.");
            }
            balance -= amount;
            System.out.println(customer + " successfully withdrew ₹" + amount);
        } else {
            System.out.println("Sorry, " + customer + ". Insufficient balance.");
        }
        
        System.out.println("Remaining balance: ₹" + balance);
        System.out.println("--------------------------------------");
    }
}

// Customer Thread class
class Customer extends Thread {
    private BankAccount account;
    private String name;
    private int amount;

    public Customer(BankAccount account, String name, int amount) {
        this.account = account;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(name, amount);
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(); // Shared bank account

        // Two customers trying to withdraw at the same time
        Customer c1 = new Customer(account, "Alice", 3000);
        Customer c2 = new Customer(account, "Bob", 4000);

        c1.start();
        c2.start();
    }
}

/*
OUTPUT:
-------
Alice is trying to withdraw ₹3000
Alice withdrawal in process...
Alice successfully withdrew ₹3000
Remaining balance: ₹2000
--------------------------------------
Bob is trying to withdraw ₹4000
Sorry, Bob. Insufficient balance.
Remaining balance: ₹2000
--------------------------------------
*/
