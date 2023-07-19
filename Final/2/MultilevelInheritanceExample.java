class Student {
    private String name;
    private int rollNo;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

class Exam extends Student {
    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

class Result extends Exam {
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Marks: " + getMarks());
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Result resultObj = new Result();
        resultObj.setName("Vxyz");
        resultObj.setRollNo(101);
        resultObj.setMarks(85);
        resultObj.display();
    }
}
