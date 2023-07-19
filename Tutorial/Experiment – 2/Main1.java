import java.util.Scanner;

class Employee {
  private int id;
  private String name;
  private double salary;

  public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }
}

public class Main1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of employees: ");
    int n = scan.nextInt();
    Employee[] employees = new Employee[n];
    scan.nextLine();
    for (int i = 0; i < n; i++) {
      System.out.println("Enter the details of employee " + (i + 1) + " (id name salary): ");
      String[] details = scan.nextLine().split(" ");
      int id = Integer.parseInt(details[0]);
      String name = details[1];
      double salary = Double.parseDouble(details[2]);
      employees[i] = new Employee(id, name, salary);
    }

    double maxSalary = Double.MIN_VALUE;
    int maxEmployeeIndex = -1;
    for (int i = 0; i < n; i++) {
      if (employees[i].getSalary() > maxSalary) {
        maxSalary = employees[i].getSalary();
        maxEmployeeIndex = i;
      }
    }

    System.out.println("The employee with highest salary is: ");
    System.out.println("Id: " + employees[maxEmployeeIndex].getId());
    System.out.println("Name: " + employees[maxEmployeeIndex].getName());
    System.out.println("Salary: " + employees[maxEmployeeIndex].getSalary());
  }
}
