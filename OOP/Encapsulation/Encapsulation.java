// Class with encapsulated fields
class BankAccount {

    private String accountNumber; // Private variable (Data Hiding)
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    // Getter (Read-Only Property)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter and Setter for balance (Controlled Access)
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Write-Only Property (Set name but not get)
    public void setAccountHolderName(String name) {
        if (!name.isEmpty()) {
            accountHolderName = name;
        } else {
            System.out.println("Name cannot be empty.");
        }
    }
}

// Main class to test Encapsulation
public class Encapsulation {
    public static void main(String[] args) {

        // Creating an object of BankAccount
        BankAccount account = new BankAccount("123456789", "John Doe", 5000);

        // Accessing data through getters and setters
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Depositing money
        account.deposit(2000);

        // Withdrawing money
        account.withdraw(1000);
        
        // Trying to withdraw more than balance
        account.withdraw(7000);

        // Changing account holder name
        account.setAccountHolderName("Alice Smith");
    }
}

/*
OUTPUT:
-------
Account Number: 123456789
Initial Balance: 5000.0
Deposited: 2000.0, New Balance: 7000.0
Withdrawn: 1000.0, Remaining Balance: 6000.0
Invalid withdrawal amount or insufficient funds.

 */
