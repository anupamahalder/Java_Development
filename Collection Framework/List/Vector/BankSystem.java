import java.util.Vector;

// Shared resource (Thread-safe)
class TransactionLog {
    private Vector<String> logs = new Vector<>();

    public void addLog(String log) {
        logs.add(log);
        System.out.println(Thread.currentThread().getName() + " added: " + log);
    }

    public void showLogs() {
        System.out.println("\nFinal Transaction Logs:");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}

// Customer Thread simulating transactions
class Customer extends Thread {
    private TransactionLog transactionLog;
    private String customerName;

    public Customer(TransactionLog log, String name) {
        this.transactionLog = log;
        this.customerName = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            transactionLog.addLog(customerName + " deposited ₹" + (1000 * i));
            try {
                Thread.sleep(100); // Simulate processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class to run the simulation
public class BankSystem {
    public static void main(String[] args) {
        TransactionLog log = new TransactionLog();

        Customer c1 = new Customer(log, "Alice");
        Customer c2 = new Customer(log, "Bob");

        c1.start();
        c2.start();

        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Show all transaction logs
        log.showLogs();
    }
}
/*
OUTPUT:
-------
Alice added: Alice deposited ₹1000
Bob added: Bob deposited ₹1000
Alice added: Alice deposited ₹2000
Bob added: Bob deposited ₹2000
Alice added: Alice deposited ₹3000
Bob added: Bob deposited ₹3000

Final Transaction Logs:
Alice deposited ₹1000
Bob deposited ₹1000
Alice deposited ₹2000
Bob deposited ₹2000
Alice deposited ₹3000
Bob deposited ₹3000

*/
