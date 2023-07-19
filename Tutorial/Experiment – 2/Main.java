class Person {
    private int age;
    private String name;
    private String address;
    private String mobileNumber;

    public void getInput() {
        System.out.print("Enter Age: ");
        age = new java.util.Scanner(System.in).nextInt();

        System.out.print("Enter Name: ");
        name = new java.util.Scanner(System.in).nextLine();

        System.out.print("Enter Address: ");
        address = new java.util.Scanner(System.in).nextLine();

        System.out.print("Enter Mobile Number: ");
        mobileNumber = new java.util.Scanner(System.in).nextLine();
    }

    public void show() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Enter details for person:");
        person.getInput();
        System.out.println("Details for person:");
        person.show();
    }
}
