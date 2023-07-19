import java.util.Scanner;

class Employee {
  int id;
  String name;
  double salary;
  int age;

  Employee(int id, String name, double salary, int age) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.age = age;
  }

  void displayDetails() {
    System.out.println("Employee ID: " + id);
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary);
    System.out.println("Employee Age: " + age);
  }
}

class Main22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter employee id: ");
    int id = sc.nextInt();
    System.out.print("Enter employee name: ");
    String name = sc.next();
    System.out.print("Enter employee salary: ");
    double salary = sc.nextDouble();
    System.out.print("Enter employee age: ");
    int age = sc.nextInt();

    Employee e = new Employee(id, name, salary, age);
    System.out.println("Employee Details:");
    e.displayDetails();
  }
}
