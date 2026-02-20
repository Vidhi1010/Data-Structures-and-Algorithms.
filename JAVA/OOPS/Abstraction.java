package OOPS;

// Abstract class representing a Bank Account
abstract class BankAccount {
    String accountHolderName;
    double balance;

    // Constructor to initialize common fields
    BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Abstract method for calculating interest
    abstract double calculateInterest();

    // Non-abstract method
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

// Subclass representing a Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate = 0.04;  // 4% interest rate

    SavingsAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
    }

    // Implementing the abstract method
    @Override
    double calculateInterest() {
        return balance * interestRate;
    }
}

// Subclass representing a Current Account
class CurrentAccount extends BankAccount {
    private double interestRate = 0.02;  // 2% interest rate

    CurrentAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
    }

    // Implementing the abstract method
    @Override
    double calculateInterest() {
        return balance * interestRate;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Creating a Savings Account object
        BankAccount savingsAccount = new SavingsAccount("Alice", 5000);
        savingsAccount.displayBalance();
        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());

        // Creating a Current Account object
        BankAccount currentAccount = new CurrentAccount("Bob", 10000);
        currentAccount.displayBalance();
        System.out.println("Current Account Interest: " + currentAccount.calculateInterest());
    }
}

