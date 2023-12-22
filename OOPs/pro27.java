// Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.
class BankAccount {
    private String accountNumber;
    private double balance;

    // Getter method for 'accountNumber'
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter method for 'accountNumber'
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for 'balance'
    public double getBalance() {
        return balance;
    }

    // Setter method for 'balance'
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class pro27 {
    public static void main(String[] args) {
        // Creating an instance of BankAccount class
        BankAccount account = new BankAccount();

        // Setting values using setter methods
        account.setAccountNumber("123456789");
        account.setBalance(5000.0);

        // Getting and displaying values using getter methods
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}
