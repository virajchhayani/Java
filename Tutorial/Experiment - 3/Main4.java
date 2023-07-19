import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private String branch;
    private int semester;
    private String college;

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        return scanner.nextLine();
    }

    public static void setName(Student student, String name, int rollNo, String branch, int semester, String college) {
        student.name = name;
        student.rollNo = rollNo;
        student.branch = branch;
        student.semester = semester;
        student.college = college;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Semester: " + semester);
        System.out.println("College: " + college);
    }
}

class Main4 {
    public static void main(String[] args) {
        Student student = new Student();
        String name = Student.getName();
        Student.setName(student, name, 10, "B.tech CE", 4, "RK University");
        student.showDetails();
    }
}