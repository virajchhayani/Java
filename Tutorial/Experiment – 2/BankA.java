class BankAccount {
  private int accountNumber;
  private String name;
  private String type;
  private double balance;

  public BankAccount(int accountNumber, String name, String type, double balance) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.type = type;
    this.balance = balance;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public boolean withdraw(double amount) {
    if (this.balance >= amount) {
      this.balance -= amount;
      return true;
    }
    return false;
  }

  public void displayInfo() {
    System.out.println("Name: " + this.name);
    System.out.println("Balance: " + this.balance);
  }
}

public class BankA {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(12345, "Viraj Chhayani", "Saving", 10000.0);
    account.displayInfo();

    account.deposit(1500.0);
    System.out.println("After deposit:");
    account.displayInfo();

    boolean result = account.withdraw(5000.0);
    if (result) {
      System.out.println("Withdrawal successful.");
      System.out.println("After withdrawal:");
      account.displayInfo();
    } else {
      System.out.println("Insufficient balance.");
    }
  }
}