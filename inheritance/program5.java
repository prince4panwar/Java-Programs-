// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
class BankAccount
{
    public int balance = 0;
    public void deposit()
    {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter a amount :- ");
        balance = balance + s.nextInt();
    }
    public void withdraw()
    {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter a withdraw amount :- ");
        balance = balance - s.nextInt();
        System.out.println("Amount deducted succesfully");
    }
}
class SavingsAccount extends BankAccount
{
    public static void main(String arg[])
    {
        SavingsAccount s = new SavingsAccount();
        s.deposit();
        s.withdraw();
    }
    public void withdraw()
    {
        
        if(balance>100)
        {
            java.util.Scanner s = new java.util.Scanner(System.in);
            System.out.println("Enter a withdraw amount :- ");
            int a = s.nextInt();
            if((balance - a) < 100)
                System.out.println("You cann't withdraw as your balance would become less than hundred");
            else 
            {
                balance = balance - a;
                System.out.println("Amount deducted succesfully");
            }
        }
        else
        {
            System.out.println("You cann't withdraw as your balance would become less than hundred");
        }
    }
}