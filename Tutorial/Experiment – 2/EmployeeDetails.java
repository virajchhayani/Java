import java.util.Scanner;

class Employee {
  int employeeId;
  String employeeName;
  double salary;
  int age;

  public void inputDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Employee ID: ");
    employeeId = sc.nextInt();
    System.out.print("Enter Employee Name: ");
    employeeName = sc.next();
    System.out.print("Enter Employee Salary: ");
    salary = sc.nextDouble();
    System.out.print("Enter Employee Age: ");
    age = sc.nextInt();
  }

  public void displayDetails() {
    System.out.println("Employee ID: " + employeeId);
    System.out.println("Employee Name: " + employeeName);
    System.out.println("Employee Salary: " + salary);
    System.out.println("Employee Age: " + age);
  }
}

public class EmployeeDetails {
  public static void main(String[] args) {
    Employee e = new Employee();
    System.out.println("Enter the details of employee:");
    e.inputDetails();
    System.out.println("\nDetails of Employee:");
    e.displayDetails();
  }
}
