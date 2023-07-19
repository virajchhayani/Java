class Bank {
    double getInterestRate() {
        return 0;
    }
}
class ICICI extends Bank {
    double getInterestRate() {
        return 5.0;
    }
}
class SBI extends Bank {
    double getInterestRate() {
        return 4.5;
    }
}
class BOB extends Bank {
    double getInterestRate() {
        return 4.0;
    }
}
public class Main3 {
    public static void main(String[] args) {
        Bank bank1 = new ICICI();
        Bank bank2 = new SBI();
        Bank bank3 = new BOB();
        System.out.println("ICICI Interest Rate: " + bank1.getInterestRate());
        System.out.println("SBI Interest Rate: " + bank2.getInterestRate());
        System.out.println("BOB Interest Rate: " + bank3.getInterestRate());
    }
}
