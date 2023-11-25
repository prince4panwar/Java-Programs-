//program that creates a bank account with concurrent deposits and withdrawals using threads.
class program7 {
    private double balance;

    public program7(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        System.out.println("Depositing: " + amount);
        balance += amount;
        System.out.println("New Balance after deposit: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            System.out.println("Withdrawing: " + amount);
            balance -= amount;
            System.out.println("New Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public static void main(String[] args) {
        program7 account = new program7(1000); // Starting balance

        // Create multiple threads for deposits and withdrawals
        Thread depositThread = new Thread(new DepositTask(account));
        Thread withdrawThread = new Thread(new WithdrawTask(account));

        depositThread.start();
        withdrawThread.start();
    }
}

class DepositTask implements Runnable {
    private final program7 account;

    public DepositTask(program7 account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(100);
            try {
                Thread.sleep(100); // Adding a delay for demonstration purposes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WithdrawTask implements Runnable {
    private final program7 account;

    public WithdrawTask(program7 account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            account.withdraw(150);
            try {
                Thread.sleep(100); // Adding a delay for demonstration purposes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
