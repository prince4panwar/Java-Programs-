//Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.
class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    // Constructor
    public Account(String accountNumber, String customerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " made. Current balance: $" + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " made. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Current balance: $" + balance);
        }
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }
}

class Bank {
    private Account[] accounts;
    private int numAccounts;

    // Constructor
    public Bank(int maxAccounts) {
        accounts = new Account[maxAccounts];
        numAccounts = 0;
    }

    // Method to add an account
    public void addAccount(Account account) {
        if (numAccounts < accounts.length) {
            accounts[numAccounts] = account;
            numAccounts++;
            System.out.println("Account added for " + account.getCustomerName());
        } else {
            System.out.println("Cannot add more accounts. Bank is full.");
        }
    }

    // Method to remove an account
    public void removeAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                System.out.println("Account removed for " + accounts[i].getCustomerName());
                for (int j = i; j < numAccounts - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[numAccounts - 1] = null;
                numAccounts--;
                return;
            }
        }
        System.out.println("Account with account number " + accountNumber + " not found.");
    }

    // Method to deposit to an account
    public void depositToAccount(String accountNumber, double amount) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].deposit(amount);
                return;
            }
        }
        System.out.println("Account with account number " + accountNumber + " not found.");
    }

    // Method to withdraw from an account
    public void withdrawFromAccount(String accountNumber, double amount) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].withdraw(amount);
                return;
            }
        }
        System.out.println("Account with account number " + accountNumber + " not found.");
    }
}

public class pro7 {
    public static void main(String[] args) {
        // Creating a Bank
        Bank bank = new Bank(10);

        // Adding accounts
        Account account1 = new Account("123456", "Alice", 1000.0);
        Account account2 = new Account("789012", "Bob", 500.0);

        bank.addAccount(account1);
        bank.addAccount(account2);

        // Depositing and withdrawing from accounts
        bank.depositToAccount("123456", 500.0);
        bank.withdrawFromAccount("789012", 200.0);

        // Removing an account
        bank.removeAccount("123456");
    }
}
