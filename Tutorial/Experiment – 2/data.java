import java.util.*;

class Person {
    private int age;
    private String name;
    private String address;
    private String mobileNumber;

    public void getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = input.nextInt();
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter address: ");
        address = input.nextLine();
        System.out.print("Enter mobile number: ");
        mobileNumber = input.nextLine();
    }

    public void show() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}

public class data {

    public static void main(String[] args) {
        Person p = new Person();
        p.getInput();
        p.show();
    }
}
