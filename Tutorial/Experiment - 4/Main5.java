import java.util.Scanner;

interface College {
    String COLLEGE_NAME = "XYZ College";
    String getName();
    String getBranch();
    String getStudentName();
    int getSem();
    void showDetails();
}

class Department implements College {
    private String branch;
    private String studentName;

    @Override
    public String getName() {
        return COLLEGE_NAME;
    }

    @Override
    public String getBranch() {
        return branch;
    }

    @Override
    public String getStudentName() {
        return studentName;
    }

    @Override
    public int getSem() {
        return 0;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void showDetails() {
        System.out.println("Branch: " + branch);
        System.out.println("Student Name: " + studentName);
    }
}

class Student implements College {
    private String branch;
    private String studentName;
    private int sem;

    @Override
    public String getName() {
        return COLLEGE_NAME;
    }

    @Override
    public String getBranch() {
        return branch;
    }

    @Override
    public String getStudentName() {
        return studentName;
    }

    @Override
    public int getSem() {
        return sem;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    @Override
    public void showDetails() {
        System.out.println("College Name: " + getName());
        System.out.println("Branch: " + branch);
        System.out.println("Student Name: " + studentName);
        System.out.println("Semester: " + sem);
    }
}

class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        College college;
        System.out.println("Enter 1 for Department or 2 for Student");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                college = new Department();
                System.out.println("Enter Branch: ");
                ((Department) college).setBranch(scanner.nextLine());
                System.out.println("Enter Student Name: ");
                ((Department) college).setStudentName(scanner.nextLine());
                break;
            case 2:
                college = new Student();
                System.out.println("Enter Branch: ");
                ((Student) college).setBranch(scanner.nextLine());
                System.out.println("Enter Student Name: ");
                ((Student) college).setStudentName(scanner.nextLine());
                System.out.println("Enter Semester: ");
                ((Student) college).setSem(scanner.nextInt());
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        college.showDetails();
    }
}
