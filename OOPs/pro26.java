//Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.
class BankAccount {
    private String accountNumber;
    private double balance;

    // Getter and Setter for 'accountNumber'
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for 'balance'
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class pro26 {
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
