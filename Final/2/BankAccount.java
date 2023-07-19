import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String name;
    private String accountType;
    private double balance;

    public BankAccount(String accountNumber, String name, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String name, String accountType) {
        this(accountNumber, name, accountType, 0);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited into account number " + accountNumber + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds to withdraw " + amount + " from account number " + accountNumber);
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn from account number " + accountNumber + ". New balance: " + balance);
        }
    }

    public void displayBalance() {
        System.out.println("Account number: " + accountNumber + ", balance: " + balance);
    }

    public void displayInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();
        System.out.print("Enter name of depositor: ");
        String name = input.nextLine();
        System.out.print("Enter type of account: ");
        String accountType = input.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();

        BankAccount account = new BankAccount(accountNumber, name, accountType, balance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayInfo();
        account.displayBalance();
    }
}
