class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
    }
}


public class Main6 {
    public static void main(String[] args) {
        Person person = new Person("Viraj", 20);
        person.printDetails();

        person.setName("Uday");
        person.setAge(19);
        person.printDetails();
    }
}
