// Write a program to implement a simple `Bank` system with deposit, withdraw, and balance check.

import java.util.Scanner;
import java.util.HashMap;

public class Bank{
    private double balance; // Private balance for encapsulation

    // Constructor to initialize balance
    public Bank(double initialBalance){
        balance = initialBalance;
    }

    // Method to deposit money 
    public void depositMoney(double money){
        if(money > 0){
            balance += money;
            System.out.println("Rs. " + money + " deposited successfully!");
        }
        else{
            System.out.println("Please give positive amount");
        }
    }

    // Method to withdraw money 
    public void withdrawMoney(double money){
        if(money > 0 && money <= balance){
            balance -= money;
            System.out.println("Rs. " + money + " withdrawed successfully");
        }
        else{
            System.out.println("Invalid amount or insufficient balance");
        }
    }

    // Method to check current balance 
    public void checkBalance(){
        System.out.println("Current balance is rs. " + balance);
    }
}

public class BankSystem{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // Create a Bank object 
        Bank myBank = new Bank(3000);

        while(true){
            System.out.println("\n--------Welcome to your bank-------\n");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your option:");

            int option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositedAmount = sc.nextDouble();
                    myBank.depositMoney(depositedAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawalAmount = sc.nextDouble();
                    myBank.withdrawMoney(withdrawalAmount);
                    break;
                
                case 3:
                    myBank.checkBalance();
                    break;
                
                case 4:
                    System.out.println("Thank you for trying our simple bank!");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Please enter valid option! and try again!");
            }

        }
    }
}

/* 
OUTPUT:
------

--------Welcome to your bank-------

1. Deposit Money
2. Withdraw Money
3. Check Balance
4. Exit
Enter your option:
1
Enter amount to deposit: 345
Rs. 345.0 deposited successfully!

--------Welcome to your bank-------

1. Deposit Money
2. Withdraw Money
3. Check Balance
4. Exit
Enter your option:
3
Current balance is rs. 3345.0

--------Welcome to your bank-------

1. Deposit Money
2. Withdraw Money
3. Check Balance
4. Exit
Enter your option:
2
Enter amount to withdraw: 234
Rs. 234.0 withdrawed successfully

--------Welcome to your bank-------

1. Deposit Money
2. Withdraw Money
3. Check Balance
4. Exit
Enter your option:
3
Current balance is rs. 3111.0

--------Welcome to your bank-------

1. Deposit Money
2. Withdraw Money
3. Check Balance
4. Exit
Enter your option:
4
Thank you for trying our simple bank!

*/
