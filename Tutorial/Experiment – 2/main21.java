class Student {
    private String name;
    private String city;
    private int age;

    public Student(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public void printData() {
        System.out.println("Name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Age: " + this.age);
    }
}

public class main21 {
    public static void main(String[] args) {
        Student s1 = new Student("Viraj Chhayani", "Jasdan", 20);
        Student s2 = new Student("Mayank", "Jamnagar", 19);
        s1.printData();
        System.out.println("\n");
        s2.printData();
    }
}
