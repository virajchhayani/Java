import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        int empId = input.nextInt();
        input.nextLine(); // consume the newline character
        System.out.print("Enter employee name: ");
        String empName = input.nextLine();
        System.out.print("Enter employee salary: ");
        double empSalary = input.nextDouble();
        System.out.print("Enter employee age: ");
        int empAge = input.nextInt();
        System.out.println("Employee details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + empSalary);
        System.out.println("Age: " + empAge);
    }
}
