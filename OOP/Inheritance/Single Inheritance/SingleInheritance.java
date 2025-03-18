/*
Explanation
1. BankAccount (Parent class) has balance and showBalance().
2. SavingsAccount (Child class) inherits BankAccount and adds addInterest().
 */

 
// Parent class
class BankAccount {
    double balance = 5000;

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Child class
class SavingsAccount extends BankAccount {
    void addInterest() {
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}
class SingleInheritance{
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.showBalance(); // Inherited method
        sa.addInterest(); // Child class method
        sa.showBalance();
    }
}

/*
OUTPUT:
-------
Current Balance: 5000.0
Interest Added: 250.0
Current Balance: 5250.0

 */
